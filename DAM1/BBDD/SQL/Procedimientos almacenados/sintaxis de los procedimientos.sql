use hospital
go


--Crear procedimiento
create proc PA_mostrardoctores
	@cod_hosp int
as
	select apellido, especialidad
	from doctor
	where HOSPITAL_COD = @cod_hosp


--Modificar procedimiento
alter proc PA_mostrardoctores
	@especialidad varchar(15),
	@cod_hosp int = 18
as
	declare @codDoctor varchar(10)
	set @codDoctor = (select DOCTOR_NO
	from doctor
	where HOSPITAL_COD = @cod_hosp and ESPECIALIDAD = @especialidad)
	
	return @codDoctor


--Ejecutar procedimiento
declare @resultado int
exec @resultado = PA_mostrardoctores 'pediatria', 22
select @resultado as apellido


--Eliminar procedimiento
drop proc PA_mostrardoctores


--Renombrar procedimiento
exec sp_rename 'pa_mostrarDoctores', 'pa_doctores'

--Mostrar datos de procesos de las BBDD
exec sp_who2