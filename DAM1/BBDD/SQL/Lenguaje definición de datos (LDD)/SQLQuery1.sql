create database hospital2
	create table hospital2 (
		hospital_cod char(2) constraint pk_hospital2 primary key,
		nombre varchar(20) not null,
		direccion varchar(30) not null,
		telefono char(9) not null,
		num_cama numeric(3) not null,)

	create table sala (
		hospital_cod char(2) constraint fk_hosp_sala references hospital2,
		sala_cod char(1),
		nombre varchar(30) not null,
		num_cama numeric(3) not null,
		constraint pk_sala primary key (hospital_cod,sala_cod),
		constraint ck_num_cama check(num_cama>0))

	create table doctor (
		hospital_cod char(2) not null constraint fk_hosp_doctor foreign key references hospital2,
		doctor_no numeric(3) constraint pk_doctor primary key,
		apellido varchar(30) not null,
		especialidad varchar(20) not null)

	create table plantilla (
		hospital_cod char(2) not null,
		sala_cod char(1) not null,
		empleado_no char(4),
		apellido varchar(30) not null,
		funcion varchar(12) not null,
		turno char(1) not null,
		salario money not null,
		constraint fk_hos_sal_plan foreign key(hospital_cod,sala_cod) references sala,
		constraint pk_empleado_no primary key(empleado_no),
		constraint ck_funcion check(funcion in ('enfermero','enfermera','interno')),
		constraint ck_turno check(turno in ('m','t','n')))

	create table enfermo (
		inscripcion int primary key,
		apellido varchar(30),
		direccion varchar(30),
		fecha_nac date,
		sexo char(1) not null check(sexo in ('V','M')),
		nss int)

	create table ocupacion (
		inscripcion int constraint pk_inscripcion primary key
						constraint fk_inscripcion references enfermo,
		hospital_cod char(2) not null,
		sala_cod char(1) not null,
		cama int,
		constraint fk_hos_sala_ocu foreign key(hospital_cod,sala_cod) references sala,
		constraint uq_ocupacion unique(hospital_cod,sala_cod,cama))