/*1.-  introduciendo el identificador de un pedido, si pide obtener el cliente  y la fecha 
de envío.*/

use compraventa
go

create function fn_validar_idPedido (@idPedido int)
	returns int
as
	begin
		declare @retorno int

		if(@idpedido not in (select idpedido from PEDIDOS where IdPedido = @idPedido))
			set @retorno = 0
		else
			set @retorno = 1
		return @retorno
	end
go

create function Fn_FechaEspañol (@fecha date, @separador char(1))
	returns char(10)
as
	begin
		return replicate(0,2 - len(datename(dd,@fecha))) + datename(dd,@fecha) + @separador + 
				replicate(0,2 - len(cast(month(@fecha) as varchar))) + cast(month(@fecha) as varchar) + @separador + datename(yy, @fecha)
	end
go

create function fn_idPedido_cliente_envio(@idpedido int)
	returns nvarchar(50)
as
	begin
		declare @retorno nvarchar(50)

		if(dbo.fn_validar_idPedido(@idPedido) = 0)
			set @retorno = 'No existe el pedido'
		else
			select @retorno = nombrecompañía + ' '  + dbo.Fn_FechaEspañol(FechaEnvío, '/')
							from pedidos p inner join clientes c on p.IdCliente = c.IdCliente
							where IdPedido = @idPedido
		return @retorno
	end
go

select dbo.fn_idPedido_cliente_envio(10248)


/*2.-  Introduciendo el id de un pedido, se pide obtener el nombre de la compañía encargada 
de realizarlo.*/

use compraventa
go

create function fn_idPedido_compañiaenvio(@idpedido int)
	returns nvarchar(50)
as
	begin
		declare @retorno nvarchar(50)

		if(dbo.fn_validar_idPedido(@idPedido) = 0)
			set @retorno = 'No existe el pedido'
		else
			set @retorno = (select NombreCompañía
							from [COMPAÑÍAS DE ENVÍOS]
							where IdCompañíaEnvíos in (select IdCompañíaEnvíos
														from pedidos
														where IdPedido = @idpedido))
		return @retorno
	end
go

select dbo.fn_idPedido_compañiaenvio(10248)


/*3.- Introduciendo el nombre de un producto, obtener el nombre de la compañía proveedora.*/

use compraventa
go

create function fn_producto_proveedor(@producto nvarchar(40))
	returns nvarchar(40)
as
	begin
		declare @retorno nvarchar(40)

		if(@producto not in (select NombreProducto from productos where NombreProducto like @producto))
			set @retorno = 'No existe el producto' + @producto
		else
			set @retorno = (select NombreCompañía
							from proveedores
							where IdProveedor in (select IdProveedor
													from PRODUCTOS
													where NombreProducto like @producto))
		return @retorno
	end
go

select dbo.fn_producto_proveedor('Té Dharamsala')


/*4.- Obtener el número de pedidos realizados desde un país introducido por teclado.*/

use compraventa
go

alter function fn_pedidos_pais(@pais nvarchar(15))
	returns nvarchar(35)
as
	begin
		declare @retorno nvarchar(35)
		if(@pais not in (select país from clientes where País = @pais))
			set @retorno = 'El país no está en la base de datos'
		else if((select count(IdPedido)
							from pedidos
							where PaísDestinatario = @pais) = 0)
			set @retorno = 'No hay ningún pedido a ' + @pais
		else
			set @retorno = (select count(IdPedido)
							from pedidos
							where PaísDestinatario = @pais)
		return @retorno
	end
go

select dbo.fn_pedidos_pais('estados unidos')


/*5.- Obtener la media de los días que tarda en entregar un pedido, una compañía de envíos, 
introducida por teclado como parámetro de entrada.*/

use compraventa
go

alter function fn_media_pedidos(@compañia nvarchar(40))
	returns nvarchar(35)
as
	begin
		declare @retorno nvarchar(35)

		if (@compañia not in (select NombreCompañía
								from [COMPAÑÍAS DE ENVÍOS]
								where NombreCompañía = @compañia))
			set @retorno = 'No existe esa compañía de envíos'
		else
			set @retorno = (select avg(datediff(dd, FechaEnvío, FechaEntrega))
							from pedidos where IdCompañíaEnvíos = (select IdCompañíaEnvíos
																	from [COMPAÑÍAS DE ENVÍOS]
																	where NombreCompañía = @compañia))
		return @retorno
	end
go

select dbo.fn_media_pedidos('federal shipping')


/*6.- ¿Cuántos productos están suspendidos de una categoría?*/

use compraventa
go

create function fn_productos_suspendidos(@categoria nvarchar(15))
	returns nvarchar(50)
as
	begin
		declare @retorno nvarchar(50)

		if(@categoria not in (select NombreCategoría
								from CATEGORÍAS
								where NombreCategoría = @categoria))
			set @retorno = 'No existe la categoría ' + @categoria
		else
			set @retorno = 'La categoría ' + @categoria + ' tiene ' + cast((select count(suspendido)
																		from PRODUCTOS
																		where suspendido = 1 and IdCategoría = (select IdCategoría
																												from CATEGORÍAS
																												where NombreCategoría = @categoria)) as varchar) + ' productos suspendidos'
		return @retorno
	end
go

select dbo.fn_productos_suspendidos('carnes')


/*7.- Introduciendo el número de un empleado por teclado, devolver la región a la que 
pertenece*/

use compraventa
go

create function fn_region_empleado(@empleado int)
	returns nvarchar(50)
as
	begin
		declare @retorno nvarchar(50)

		if(@empleado not in (select IdEmpleado
								from empleados
								where IdEmpleado = @empleado))
			set @retorno = 'No existe ese empleado'
		else
			set @retorno = (select descripción
							from REGIONES
							where IdRegión in (select IdRegión
												from TERRITORIOS
												where IdTerritorio in (select idterritorio
																		from EMPLEADOSTERRITORIOS
																		where Idempleado = @empleado)))
		return @retorno
	end
go

select dbo.fn_region_empleado(3)

--Otra forma (con vista)

use compraventa
go

alter view vregiones as
	select descripción, IdEmpleado
	from REGIONES, empleados e
	where IdRegión in (select IdRegión
						from TERRITORIOS
						where IdTerritorio in (select idterritorio
												from EMPLEADOSTERRITORIOS
												where Idempleado = e.IdEmpleado))
go

alter function fn_region2_empleado2(@empleado int)
	returns nvarchar(50)
as
	begin
		declare @retorno nvarchar(50)

		if(@empleado not in (select IdEmpleado
								from empleados
								where IdEmpleado = @empleado))
			set @retorno = 'No existe ese empleado'
		else
			set @retorno = 'El empleado ' + cast(@empleado as nvarchar(1)) + ' tiene asignada la región ' + (select Descripción
																												from vregiones
																												where IdEmpleado = @empleado)
		return @retorno
	end
go

select dbo.fn_region2_empleado2(0)

/*Crear dos funciones que introduciendo un pedido, diga a cuanto dinero asciende el pedido con cargo y sin cargo*/

use compraventa
go

create function fn_pedido_sincargo(@pedido int)
	returns nvarchar(50)
as
	begin
		declare @retorno nvarchar(50)
		if(dbo.fn_validar_idPedido(@pedido) = 0)
			set @retorno = 'No existe el pedido ' + cast(@pedido as nvarchar)
		else
			set @retorno = (select sum(preciounidad * cantidad * (1 - descuento))
							from [DETALLES DE PEDIDOS]
							where idpedido = @pedido)
		return @retorno
	end
go

create function fn_pedido_concargo(@pedido int)
	returns nvarchar(50)
as
	begin
		declare @retorno nvarchar(50)
		if(dbo.fn_validar_idPedido(@pedido) = 0)
			set @retorno = 'No existe el pedido ' + cast(@pedido as nvarchar)
		else
			set @retorno = dbo.fn_pedido_sincargo(@pedido) + (select cargo
																from PEDIDOS
																where IdPedido = @pedido)
		return @retorno
	end
go

select dbo.fn_pedido_sincargo(10248), dbo.fn_pedido_concargo(10248)