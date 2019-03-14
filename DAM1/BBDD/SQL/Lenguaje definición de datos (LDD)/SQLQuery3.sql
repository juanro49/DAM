create database empresa
	--tabla empleados
	create table empleados (
		numemp int constraint pk_numemp primary key,
		nombre varchar(30) not null,
		edad int,
		oficina int,
		titulo varchar(20),
		contrato datetime not null,
		director int,
		cuota money,
		ventas money)

	--tabla oficinas
	create table oficinas (
		oficina int constraint pk_oficina primary key,
		ciudad varchar(30),
		region varchar(30),
		dir int constraint fk_dir references empleados,
		objetivo money,
		ventas money)

	--tabla productos
	create table productos (
		idfab varchar(10),
		idproducto varchar(20),
		descripcion varchar(30) not null,
		precio money,
		existencia int
		constraint pk_productos primary key (idfab,idproducto))

	--tabla clientes
	create table clientes (
		numcliente int,
		nombre varchar(30) not null,
		repcliente int,
		constraint pk_numcliente primary key(numcliente),
		constraint fk_representante foreign key(repcliente) references empleados)

	--tabla pedidos
	create table pedidos (
		codigo int identity(1,1),
		numpedido int,
		fechapedido date,
		clie int not null,
		rep int not null,
		fab varchar(10) not null,
		producto varchar(20) not null,
		cant int not null,
		importe money not null,
		constraint fk_clie foreign key(clie) references clientes,
		constraint fk_rep foreign key(rep) references empleados,
		constraint fk_fab_producto foreign key(fab,producto) references productos)

	alter table clientes
		add limitedecredito money

	alter table empleados
		add constraint fk_oficina foreign key(oficina) references oficinas,
			constraint fk_director foreign key(director) references empleados

	alter table empleados
		add constraint uq_nombre unique(nombre)

	alter table pedidos
		add constraint pk_codigo primary key(codigo)