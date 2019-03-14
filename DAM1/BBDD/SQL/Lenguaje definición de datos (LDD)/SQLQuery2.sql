create database emp_dep
use emp_dep
	create table dep (
		dept_no int identity(10,10) constraint pk_dept_no primary key,
		dnombre varchar(30) not null,
		loc varchar(30) not null)

	create table emp (
		emp_no numeric(4),
		apellido varchar(30) not null,
		oficio varchar(20) not null,
		dir numeric(4),
		fecha_alt date default cast(getdate() as date) not null,
		salario money not null,
		comision money,
		dept_no int not null,
		constraint pk_emp_no primary key(emp_no),
		constraint fk_dept_no foreign key(dept_no) references dep(dept_no),
		constraint ck_oficio check(oficio in ('director','analista','presidente','empleado','vendedor')),
		constraint fk_dir foreign key(dir) references emp(emp_no))