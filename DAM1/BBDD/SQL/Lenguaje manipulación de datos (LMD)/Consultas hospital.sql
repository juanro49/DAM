/*Obtener el nombre del hospital y el nombre de la sala*/
select hospital.nombre, sala.nombre
from hospital, sala
where hospital.HOSPITAL_COD=sala.HOSPITAL_COD
order by hospital.NOMBRE

--Mas optimizado
select h.nombre hospital, s.nombre sala
from hospital h inner join sala s on h.HOSPITAL_COD=s.HOSPITAL_COD 

/*Obtener los pacientes que no están ingresados*/
select ENFERMO.INSCRIPCION
from enfermo
where ENFERMO.INSCRIPCION not in (
	select OCUPACION.INSCRIPCION
	from OCUPACION) 

/*Obtener los pacientes ingresados en el hospital La Paz*/
select APELLIDO
from ENFERMO
where INSCRIPCION in (
	select INSCRIPCION
	from ocupacion
	where hospital_cod in (
		select HOSPITAL_COD
		from hospital
		where NOMBRE='La Paz')) 
order by APELLIDO

/*Obtener las enfermeras que trabajan el el turno de noche*/
select apellido, FUNCION, TURNO
from plantilla
where funcion='Enfermera' and (turno='m' or turno='n')

/*Obtener los cardiólogos  que trabajan en el hospital San Carlos*/
select APELLIDO
from doctor 
where HOSPITAL_COD in (
	select hospital_cod
	from hospital
	where nombre='San Carlos') 
and especialidad='Cardiologia'
