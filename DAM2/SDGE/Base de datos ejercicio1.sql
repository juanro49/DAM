﻿create database ejercicio1
	use ejercicio1
	go

	--Crear tablas
	create table dueños (
		f_nac date,
		f_carne date,
		nombre varchar(20),
		direccion varchar(30),
		telefono char(9),
		dni char(9) constraint pk_dni primary key);

	create table coches (
		marca varchar(20),
		modelo varchar(20),
		matricula varchar(8) constraint pk_matricula primary key,
		f_matri date,
		km int,
		propietario char(9) constraint fk_prop_dni references dueños);
	go

	--Insertar dueños
	insert into dueños
		values('01-01-1975', '01-01-2000', 'Paco', 'Mi casa 1', '666666666', '11111111A');
	insert into dueños
		values('02-02-1976', '02-02-2001', 'Paca', 'Mi casa 2', '654321987', '22222222B');
	insert into dueños
		values('03-03-1977', '03-03-2002', 'Francisco', 'Mi casa 3', '777777777', '33333333C');
	go
	
	--Insertar coches
	insert into coches
		values('Tesla', 'Model S', '0000ABC', '01-01-2018', 5000, '11111111A'),
		('Subaru', 'Impreza', '1111ABC', '02-02-2018', 4000, '22222222B'),
		('Seat', 'Marbella', 'BA2222Z', '03-03-2018', 3000, '22222222B'),
		('Renault', '4', 'CC3333A', '04-04-2018', 2000, '11111111A'),
		('McLaren', 'F1', '4444ABC', '05-05-2018', 1000, '22222222B');
	insert into coches
		values('Mitsubishi', 'Pajero', '5555ABC', '06-06-2018', 500);
	go
	
	--Listado de los coches
	select * from coches where propietario is not null
	go
	
	--Modificar los datos de un coche
	update coches
		set marca = 'Hummer',
		modelo = 'HX'
		where matricula = '5555ABC';
	go
	
	--Crear vista con todos los datos
	Create view vista as
		select * from coches c left join dueños d on c.propietario = d.dni

	select * from vista
	