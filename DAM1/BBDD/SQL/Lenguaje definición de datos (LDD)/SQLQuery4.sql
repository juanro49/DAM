create database farmacia
	create table usuario (
		cod_usu varchar(8) constraint pk_cod_usu primary key,
		cod_emp varchar(8) not null,
		nivel_usu varchar(2) not null,
		nom_usu varchar(30) not null,
		password varchar(10) not null,
		activo varchar(2) not null)

	create table clientes (
		cod_cli varchar(8) constraint p_cod_cli primary key,
		nom_cli varchar(40) not null,
		dir_cli varchar(40),
		cod_dis varchar(8),
		sexo char(1) not null,
		dni varchar(9) not null,
		telefono varchar(9) not null)

	create table ordenpedido (
		num_ordenpedido int identity(1,1) constraint pk_ordenpedido primary key,
		fecha datetime default getdate() not null,
		cod_cli varchar(8),
		cod_emp varchar(8),
		cod_prod varchar (8),
		cod_tipopago varchar(8),
		total money not null)

	create table distrito (
		cod_dis varchar(8) constraint pk_distrito primary key,
		nom_dis varchar(40) not null)

	create table producto (
		cod_pro varchar(8) constraint pk_producto primary key,
		nom_pro varchar(40) not null,
		prec_venta numeric(10,2) not null,
		prec_compra numeric(10,2) not null,
		fecha_venc date not null,
		stock int not null,
		cod_prov varchar(8) not null)

	create table empleado (
		cod_emp varchar(8) constraint pk_empleado primary key,
		nom_emp varchar(40) not null,
		dir_emp varchar(40),
		cod_dis varchar(8) not null,
		cargo varchar(40) not null,
		edad int,
		tel char(9) not null,
		ingreso datetime not null,
		clave varchar(20) not null)

	create table factura (
		num_factura int identity(1,1) constraint pk_factura primary key,
		fecha datetime not null,
		cod_empl varchar(8) not null,
		cod_cli varchar(8) not null,
		num_ordenpedido int not null,
		subtotal money not null,
		descuento int,
		total money not null)

	create table proveedor (
		cod_prov varchar(8) constraint pk_proveedor primary key,
		nom_prov varchar(40),
		dir_prov varchar(50),
		telefono char(9),
		id_distrito varchar(8))

	alter table ordenpedido
		add constraint fk_cod_cli foreign key (cod_cli) references clientes

	alter table ordenpedido
		add constraint fk_cod_prod foreign key (cod_prod) references producto

	alter table ordenpedido
		add constraint fk_cod_emp foreign key (cod_emp) references empleado

	alter table clientes
		add constraint fk_cod_dis foreign key (cod_dis) references distrito

	alter table producto
		add constraint fk_prov foreign key (cod_prov) references proveedor

	alter table empleado
		add constraint fk_emp_dis foreign key (cod_dis) references distrito

	alter table factura
		add constraint fk_pedido foreign key (num_factura) references ordenpedido

	alter table usuario
		add constraint fk_emp foreign key(cod_emp) references empleado

	alter table distrito
		add constraint uq_nombre unique(nom_dis)

	alter table clientes
		add constraint uq_dni unique(dni)

	alter table clientes
		add constraint ch_sexo check (sexo in ('m','f'))