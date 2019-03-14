use temple
go
begin tran
--Comprobamos las restricciones
--select * from INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE
--Eliminamos claves foráneas
if(OBJECT_ID('fk_numce') is not null)
	alter table tdepto drop constraint fk_numce

if(OBJECT_ID('fk_numde') is not null)
	alter table temple drop constraint fk_numde

if(OBJECT_ID('fk_depde') is not null)
	alter table tdepto drop constraint fk_depde

if (object_id('fk_direc') is not null)
	alter table tdepto drop constraint fk_direc

--Eliminamos claves primarias
if(OBJECT_ID('pk_numce') is not null)
	alter table tcentro drop constraint pk_numce

if(OBJECT_ID('pk_numde') is not null)
	alter table tdepto drop constraint pk_numde

if(OBJECT_ID('pk_numem') is not null)
	alter table temple drop constraint pk_numem

if(OBJECT_ID('ck1_tdir') is not null)
	alter table tdepto drop constraint ck1_tdir

--Editamos los campos que queramos
alter table temple
	alter column numem char(3) not null

alter table tdepto
	alter column direc char(3)

--Añadimos de nuevo las restricciones
if object_id('pk_numce') is null
	alter table tcentro add constraint pk_numce primary key (numce)

if object_id('pk_numde') is null
	alter table tdepto add constraint pk_numde primary key (numde)

if object_id('pk_numem') is null
	alter table temple add constraint pk_numem primary key (numem)

if object_id('ck1_tdir') is null
	alter table tdepto add constraint ck1_tdir check(tdir in ('f','p'))

if object_id('fk_numce') is null
	alter table tdepto add constraint fk_numce foreign key (numce) references tcentro

if object_id('fk_numde') is null
	alter table temple add constraint fk_numde foreign key (numde) references tdepto

if object_id('fk_direc') is null
	alter table tdepto add constraint fk_direc foreign key (direc) references temple

if object_id('fk_depde') is null
	alter table tdepto add constraint fk_depde foreign key (depde) references tdepto
