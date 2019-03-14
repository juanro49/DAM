CREATE DATABASE alquiler_coches;

USE alquiler_coches;


CREATE TABLE empleados (    
    usuario VARCHAR(10) PRIMARY KEY,
    contrasena VARCHAR(25) NOT NULL,
    tipo VARCHAR(10) not null,
    correo VARCHAR(50)
);

CREATE TABLE coches (
	matricula varchar(7) primary key,
    marca VARCHAR(15) NOT NULL,
    modelo VARCHAR(15) NOT NULL,
	precio_dia int not null
);

CREATE TABLE usuarios (    
    dni VARCHAR(9) PRIMARY KEY,
    nombre VARCHAR(25) NOT NULL,
    apellido VARCHAR(25),
    telefono numeric(9) NOT NULL,    
    correo VARCHAR(50)
);

CREATE TABLE alquileres (
    usuario VARCHAR(9),
	matricula varchar(7),	
    marca VARCHAR(15) NOT NULL,
    modelo VARCHAR(15) NOT NULL,
    f_alquiler DATE not null,
	f_devolucion DATE not null,
	precio int not null,
    constraint pk_alquileres primary key (usuario, matricula),
    constraint fk_dni FOREIGN KEY (usuario) REFERENCES usuarios(dni),
    constraint fk_matricula FOREIGN KEY (matricula) REFERENCES coches(matricula)
);

insert into empleados(usuario, contrasena, tipo, correo) values
('Jefe', 'jefe', 'Jefe', ''),
('Emp1','emp1', 'Vendedor', '');

insert into coches(matricula, marca, modelo, precio_dia) values
('AAA1234', 'Tesla', 'Model S', '299'),
('BBB5678', 'Renault', 'Clio', '59'),
('CCC9012', 'Ford', 'Kuga', '75'),
('DDD3456', 'Volkswagen', 'Golf', '69');

insert into usuarios(dni, nombre, apellido, correo, telefono) values
('11111111A', 'Eustaquio', 'Habichuelo', '', '123456789'),
('22222222B','Pepa', 'Pig', 'pepa@pig.es', '987654321');

insert into alquileres(usuario, matricula, marca, modelo, f_alquiler, f_devolucion, precio) values
('11111111A', 'AAA1234', 'Tesla', 'Model S', '2019-02-26', '2019-02-27', '299');

