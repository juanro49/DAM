/*1.	Crear un procedimiento almacenado que obtenga los enfermos nacidos entre dos 
fechas pasadas como parámetros.*/

use hospital
go

create proc pa_edad_enfermos
	@f_inicial date,
	@f_final date
as
	if(@f_inicial > @f_final)
		begin
			declare @fecha date
			set @fecha = @f_inicial
			set @f_inicial = @f_final
			set @f_final = @fecha
		end

	select *
	from enfermo
	where FECHA_NAC between @f_inicial and @f_final
go

exec pa_edad_enfermos '01/01/1985', '01/01/1965'


/*2.	Crea un procedimiento almacenado que sirva para dar de alta 
en la base de datos un nuevo enfermo cuando este acuda al hospital.*/

use hospital
go

create proc pa_añadir_enfermo
	@inscripcion int,
	@apellido varchar(25),
	@direccion varchar(25),
	@fecha_nac smalldatetime,
	@sexo char(1),
	@nss int
as
	if @sexo = 'V' or @sexo = 'M'
		begin
			insert into enfermo
			values (@inscripcion, @apellido, @direccion, @fecha_nac, upper(@sexo), @nss)
		end
	else
		print 'El sexo no es válido, debe ser V o M.'
go

exec pa_añadir_enfermo 99999, 'Ávila', 'mi calle, 3', '01/01/1960', 'M', 12345678
go
select * from enfermo


/*3.	Para complementar al anterior habrá que crear un procedimiento 
almacenado que permita borrar un enfermo de la base de datos cuando se 
le de el alta médica.*/

use hospital
go

create proc pa_eliminar_enfermo
	@inscripcion int
as
	delete from enfermo
	where inscripcion = @inscripcion
GO

exec pa_eliminar_enfermo 99999
go

select * from enfermo


/*4.	Crear un procedimiento almacenado que muestre la suma total 
del salario para una función de la plantilla del hospital pasada 
como parámetro.*/

use hospital
go

create proc pa_total_salario_funcion
	@funcion varchar(10)
as
	select sum(salario) "Suma salarios"
	from plantilla
	where funcion = @funcion
GO

exec pa_total_salario_funcion 'enfermera'


/*5.	¿Qué modificación habrra que incorporar en el anterior para 
poder ejecutar el procedimiento almacenado sin pasarle ningún 
parámetro y que devuelva el total del salario para toda la plantilla?*/

use hospital
go

alter proc pa_total_salario_funcion
	@funcion varchar(10) = '%'
as
	select sum(salario) "Suma salarios"
	from plantilla
	where funcion like @funcion
GO

exec pa_total_salario_funcion


/*6.	Crear un procedimiento almacenado que permita pasar un doctor 
de una especialidad a otra, pasando como par�metros la nueva especialidad 
y parte de su apellido.*/

use hospital
go

create proc pa_cambiar_doctor
	@apellido varchar(10),
	@especialidad varchar(15)
as
	update doctor
	set especialidad = @especialidad
	where apellido like  '%' + @apellido + '%'
GO

exec pa_cambiar_doctor 'lopez', 'Pediatria'
go

select * from doctor


/*7.	Crear un procedimiento almacenado que calcule el total de 
enfermos y lo devuelva como valor.*/

use hospital
go

create proc pa_calcula_total_enfermos
as
	declare @total_enfermos int
	set @total_enfermos = (select count(inscripcion)
							from ocupacion)
	return @total_enfermos
GO

declare @valorDevuelto int
exec @valorDevuelto = pa_calcula_total_enfermos
print 'El total de los enfermos es: ' + cast(@valorDevuelto as varchar)


/*8.	Crear un procedimiento almacenado que calcule el número de camas 
ocupadas en un hospital dado su código como parámetro y, opcionalmente, 
un nombre de sala. Si este último no se proporciona deberá calcularse el 
total para todas las salas de las que disponga.*/

use hospital
go

create proc pa_contar_camas_ocupadas
	@cod_hosp int,
	@nom_sala varchar(20) = '%' --Se pone % como valor para hacerlo opcional
as
	select count(cama) "camas ocupadas"
	from OCUPACION o left join sala s
		on o.sala_cod = s.sala_cod and o.HOSPITAL_COD = s.HOSPITAL_COD
	where o.HOSPITAL_COD = @cod_hosp and s.nombre like @nom_sala
go

exec pa_contar_camas_ocupadas 22, 'psiquiatrico'


/*9.	Crear un procedimiento almacenado que, recibiendo como entrada el 
apellido de un cliente, visualice el nombre de las compañías proveedoras 
que tengan oficina en la misma ciudad que el domicilio del cliente. Si no 
existiera ninguna, debe mostrarse un mensaje explicativo.*/

use compraventa
go

create proc pa_compañias_misma_ciudad
	@apellido nvarchar(30)
as
	select nombrecompañía
	from proveedores
	where ciudad = (select ciudad
					from clientes
					where nombrecontacto like '%' + @apellido + '%')

	if (@@ROWCOUNT = 0) --No hay filas afectadas
		print 'No existe ningún proveedor en su ciudad'
GO

exec pa_compañias_misma_ciudad 'anders'

--Con parámetro de salida

alter proc pa_compañias_misma_ciudad
	@apellido nvarchar(30),
	@nombre nvarchar(40) output
as
	select @nombre = nombrecompañía
	from proveedores
	where ciudad = (select ciudad
					from clientes
					where nombrecontacto like '%' + @apellido + '%')

	if (@@ROWCOUNT = 0) --No hay filas afectadas
		print 'No existe ningún proveedor en su ciudad'
GO

declare @nombreComp nvarchar(40)
exec pa_compañias_misma_ciudad 'anders', @nombreComp output
print @nombreComp

/*10.	Crear un procedimiento almacenado que, pasándole como parámetro el 
apellido de un empleado, muestre el total de sus ventas.*/

use compraventa
go

create proc pa_ventas_empleado
	@apellido nvarchar(30)
as
	select sum(p.cargo) "ventas"
	from empleados e inner join pedidos p on e.idempleado = p.idempleado
	where apellidos = @apellido
go

exec pa_ventas_empleado 'Fuller'


/*11.	Crear un procedimiento almacenado que, pasándole como parámetro 
el apellido de un empleado, obtenga el total de sus ventas. El resultado 
deberá extraerse con un parámetro de salida. Adicionalmente, el procedimiento 
deberá proporcionar un valor de retorno que indicará un código de estado, 
siendo 0 en caso de ejecución correcta, 1 en caso de no existir el usuario 
especificado o 2 si el empleado no ha realizado ninguna venta. Junto con el 
código de estado correspondiente se debe imprimir un mensaje explicativo.*/

use compraventa
go

alter proc pa_ventas_empleado
	@apellido nvarchar(30),
	@ventas money output
as
	if(@apellido not in (select apellidos from empleados))
		begin
			print 'No existe el usuario'
			return 1
		end
	else
		begin
			select @ventas = sum(p.cargo)
			from empleados e inner join pedidos p on e.idempleado = p.idempleado
			where apellidos = @apellido

			if(@ventas is not null)
				return 0
			else
				begin
					print 'No existen ventas'
					return 2
				end
		end
go

declare @ventasEmp money, @estado int
exec @estado = pa_ventas_empleado 'Fuller', @ventasEmp output
if (@estado = 0)
	select @ventasEmp

/*12.	Crear un procedimiento almacenado que obtenga el nombre y el 
precio unitario del producto más caro existente en una categoría pasándole 
como parámetro dicha categoría. Los resultados deberán extraerse mediante 
sendos parámetros de salida. Si no se obtiene ningún resultado (la 
categoría no existe) el procedimiento debe imprimir un mensaje indicando 
que no se han encontrado productos y, adicionalmente, retornar el código 
de estado 1. */

use compraventa
go

create proc pa_producto_mas_caro
	@categoria nvarchar(15),
	@producto nvarchar(40) output,
	@precio money output
as
	select top 1 @producto = nombreproducto, @precio = preciounidad
	from productos
	where idcategoría in (select IdCategoría
							from CATEGORÍAS
							where NombreCategoría = @categoria)
	order by PrecioUnidad desc
go

declare @prod nvarchar(40), @precioProd money
exec pa_producto_mas_caro 'bebidas', @prod output, @precioProd out
select @prod "Producto", @precioProd "Precio"


/*13.	Crear un procedimiento almacenado que muestre los nombres de las categorías 
junto con el valor de sus ventas en un año determinado, que pasaremos como 
parámetro.*/


/*14.	Mostrar el pedido más reciente de una compañía cliente, dado su nombre como 
parámetro. Obtener el resultado como parámetro de salida. Devolver códigos de 
error si no se encuentran los datos.*/

use compraventa
GO

alter proc pa_pedido_reciente
	@nombreComp NVARCHAR(40),
	@resultado int OUTPUT
as
	if((select nombrecompañía from CLIENTES where NombreCompañía like '%' + @nombreComp + '%') is null)
		BEGIN
			PRINT 'La compañía no existe'
			RETURN 0
		END
	ELSE
		BEGIN
			select top 1 @resultado = IdPedido
			from PEDIDOS p inner join clientes c on p.IdCliente=c.IdCliente
			where NombreCompañía like '%' + @nombreComp + '%'
			order by FechaPedido desc
		END
GO

declare @resul int
exec pa_pedido_reciente 'Alfred', @resul out
select @resul "Id Pedido"
