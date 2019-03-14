-- 1.
alter table producto
	add cod_cate varchar(8)

alter table producto
	add cod_pres varchar(8)

--2.
create table categoria (
	cod_cate varchar(8) constraint pk_cod_cate primary key,
	nom_cate varchar(40) not null constraint uq_nom_cate unique)

create table presentacion (
	cod_pres varchar(8) constraint pk_cod_pres primary key,
	nom_pres varchar(40) not null)

create table detalleordenpro (
	num_ordenp int identity(1,1) constraint pk_num_ordenp primary key,
	cod_pro varchar(8) not null,
	nom_pro varchar(40),
	cantidad int,
	precio_venta numeric(10,2),
	importe money)

--3.
alter table producto
	add constraint fk_cod_cate foreign key (cod_cate) references categoria

alter table producto
	add constraint fk_cod_pres foreign key (cod_pres) references presentacion

alter table detalleordenpro
	add constraint fk_cod_pro foreign key (cod_pro) references producto

alter table presentacion
	add constraint uq_nom_pres unique (nom_pres)

alter table presentacion
	alter column nom_pres varchar(50)

--4.
drop table detalleordenpro