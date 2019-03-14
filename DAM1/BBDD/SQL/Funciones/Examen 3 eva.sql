--1

create view vejercicio1 as
	select numem, nombre, DNOMBRE, '2' "invitaciones", year(getdate()) - year(fecha_nac) "edad", cast(datename(dw, '22/12/' + cast(year(getdate()) as varchar(4))) as nvarchar(10)) + ' 22/12/' + cast(year(getdate()) as varchar(4)) "fecha"
	from temple t inner join tdepto td on t.NUMDE = td.NUMDE
	where year(getdate()) - year(fecha_nac) > 65
go

--2
create function fn_validar_empleado(@numemp char(3))
	returns int
as
	begin
		declare @retorno int

		if(@numemp not in (select NUMEM
							from TEMPLE
							where NUMEM = @numemp))
			set @retorno = 0
		else
			set @retorno = 1
		return @retorno
	end
go

create function fn_edad_empleado(@numemp char(3))
	returns int
as
	begin
		declare @retorno int
		if(@numemp not in (select NUMEM
							from vejercicio1))
			set @retorno = 0
		else
			set @retorno = 1
		return @retorno
	end
go

create function fn_fecha_valida(@fecha date)
	returns int
as
	begin
		declare @retorno int
		if (@fecha between cast('1/12/' + cast(year(getdate()) as varchar(4)) as date) and cast('21/12/' + cast(year(getdate()) as varchar(4)) as date))
			set @retorno = 1
		else
			set @retorno = 0
		return @retorno
	end
go

create function fn_ejercicio1(@numemp char(3))
	returns varchar(150)
as
	begin
		declare @retorno varchar(150)

		if(dbo.fn_validar_empleado(@numemp) = 0)
			set @retorno = 'No existe el empleado ' + @numemp
		else if(dbo.fn_edad_empleado(@numemp) = 0)
			set @retorno = 'El empleado ' + @numemp + ' no es mayor de 65 años'
		else if(dbo.fn_fecha_valida(getdate()) = 0)
			set @retorno = 'La fecha actual no está entre 1/12/' + cast(year(getdate()) as varchar(4)) + ' y 21/12/' + cast(year(getdate()) as varchar(4))
		else
			set @retorno = (select nombre
							from vejercicio1
							where NUMEM = @numemp) + ' del departamento ' + (select dnombre
																				from vejercicio1
																				where NUMEM = @numemp) + ' está invitado, a una fiesta, el ' + (select fecha
																																				from vejercicio1
																																				where NUMEM = @numemp) + ' y recibirá un regalo de y ' + (select invitaciones
																																																		from vejercicio1
																																																		where NUMEM = @numemp) + ' invitaciones'
		return @retorno
	end
go

select dbo.fn_ejercicio1(110)