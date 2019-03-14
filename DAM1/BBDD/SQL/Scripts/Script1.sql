/*Eliminar claves primarias*/
use hospital
go
begin tran
--borramos las claves primarias
if exists(select *
			from INFORMATION_SCHEMA.TABLE_CONSTRAINTS
			where CONSTRAINT_NAME = 'pk_hospital_cod')

	alter table hospital drop constraint pk_hospital_cod

if exists(select *
			from INFORMATION_SCHEMA.TABLE_CONSTRAINTS
			where CONSTRAINT_NAME = 'pk_inscripcion')

	alter table ocupacion drop constraint pk_inscripcion

if exists(select *
			from INFORMATION_SCHEMA.TABLE_CONSTRAINTS
			where CONSTRAINT_NAME = 'pk_sala')

	alter table sala drop constraint pk_sala

if exists(select *
			from INFORMATION_SCHEMA.TABLE_CONSTRAINTS
			where CONSTRAINT_NAME = 'pk_doctor_no')

	alter table sala drop constraint pk_doctor

if exists(select *
			from INFORMATION_SCHEMA.TABLE_CONSTRAINTS
			where CONSTRAINT_NAME = 'pk_enfermo_no')

	alter table plantilla drop constraint pk_enfermo

if exists(select *
			from INFORMATION_SCHEMA.TABLE_CONSTRAINTS
			where CONSTRAINT_NAME = 'pk_inscripcion_enfermo')

	alter table enfermo drop constraint pk_inscripcion_enfermo