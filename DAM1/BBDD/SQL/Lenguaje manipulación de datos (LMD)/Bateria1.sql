/*4. Mostrar para todos los hospitales, el código de hospital, el nombre del hospital y el
nombre abreviado en tres letras (a este campo, podemos llamarle ABR). Obtener la
recuperación ordenada por ABR.*/

select hospital_cod,nombre,left(REPLACE(nombre,' ',''),3) ABR,SUBSTRING(NOMBRE,1,3) ABR
from HOSPITAL
order by 3


/*5. En la tabla DOCTOR, otorgar a Cardiología el código 1, a Psiquiatría el 2, a pediatría el
3 y el cualquier otra especialidad el 4. Recuperar todos los doctores, su especialidad y el
código correspondiente.*/


select apellido, especialidad, case especialidad
								when 'cardiologia' then 1
								when 'psiquiatria' then 2
								when 'pediatria' then 3
								else 4 end codigo
from doctor


/*6. Hacer un listado del nombre de los pacientes y la posición de la primera "a" que aparezca
en el apellido, tomando como referencia la primera letra del mismo.*/

select apellido, charindex('a', apellido, 1) "primera a"
from enfermo


/*7. Queremos conseguir un listado de la siguiente forma:
COMENTARIO
El departamento de CONTABILIDAD está en SEVILLA
El departamento de INVESTIGACION está en MADRID
El departamento de VENTAS está en BARCELONA
El departamento de PRODUCCION está en BILBAO*/

select 'El departamento de ' +upper(dnombre) + ' está en ' +upper(loc) COMENTARIO
from dep2


/*8. Para cada empleado cuyo apellido contenga una "N", queremos que nos devuelva "nnn",
pero sólo para la primera ocurrencia de "N". La salida estará ordenada por apellido en
orden descendente.*/

select apellido, left(apellido, charindex('n', apellido) - 1) + 'nnn' + right(apellido, len(apellido) - charindex('n', apellido))
from EMP2
where APELLIDO like '%n%'


/*9. Para cada empleado se pide que salga su salario total (salario más comisión) y luego su
salario fragmentado, es decir unidades de mil, centenas, decenas y unidades. (No se han
contemplado valores decimales en los salarios y se presupone que todos son de 3 y 4
dígitos). La salida se ordenará por salario en orden ascendente y apellido en orden
descendente.*/

SELECT apellido, salario + isnull(comision, 0) salario_total,
	substring(cast(salario + isnull(comision, 0) as nvarchar(7)), 1, 1) M,
	substring(cast(salario + isnull(comision, 0) as nvarchar(7)), 2, 1) C,
	substring(cast(salario + isnull(comision, 0) as nvarchar(7)), 3, 1) D,
	substring(cast(salario + isnull(comision, 0) as nvarchar(7)), 4, 1) U
from emp2
where salario + isnull(comision, 0) >= 1000
union
SELECT apellido, salario + isnull(comision, 0) salario_total,
	0 M,
	substring(cast(salario + isnull(comision, 0) as nvarchar(7)), 1, 1) C,
	substring(cast(salario + isnull(comision, 0) as nvarchar(7)), 2, 1) D,
	substring(cast(salario + isnull(comision, 0) as nvarchar(7)), 3, 1) U
from emp2
where salario + isnull(comision, 0) < 1000


/*10. Para cada empleado que no tenga comisión o cuya comisión sea mayor del 15% de su
salario, se pide el salario total que tiene. Esto es, si tiene comisión, su salario más la
comisión, si no la tiene su salario más el 15% del mismo. La salidas se ordenará por
oficio y salario en orden descendente.*/

select apellido, salario + isnull(comision, salario * 0.15) salario, OFICIO
from emp2
where comision is null or comision > salario * 0.15
order by oficio, salario desc


/*11. Encuentre todas las enfermera y enfermeros indicando el salario mensual de cada uno.
(Todos los salarios que aparecen en la base de datos son anuales y no se consideran las
pagas extraordinarias).*/

select apellido, round(salario/12, 2) "salario mensual"
from plantilla
where FUNCION like 'e%'


/*12.  ¿Qué fecha fue hace tres semanas? (en otro gestor en la from iría la pseudotabla dual).*/

select convert(varchar(15), getdate() -21, 103)
select convert(varchar(15), dateadd(ww,-3,getdate()), 103)


/*13. Se pude el nombre, oficio y fecha de alta del personal del departamento 20 que gana más
de 15.000€, mensuales. La salida tendrá el siguiente formato:*/

select apellido, oficio, datename(DW, FECHA_ALT) + ' ' + datename(MM, fecha_alt) + ' ' + datename(DD, fecha_alt) + ' de ' + datename(yy, fecha_alt) + ' ' + convert(char(5), fecha_alt, 114) "fecha_alt", cast(SALARIO as char(10)) + '€' "salario"
from emp2
where DEPT_NO=20 and salario>1500


/*14.  Se pide el nombre, oficio y día de la semana en que han sido dados de alta los empleados
de la empresa, peso sólo aquellos cuyo día de alta haya sido entre martes y jueves.
Ordenar la salida por el campo oficio. (Cuidado con el gestor, en España el primer día de
la semana es el lunes, pero en Inglaterra es el Domingo, en nuestro caso el formato es el
español).*/

select apellido, oficio, datename(dw, fecha_alt) "dia de la semana"
from emp2
where datepart(dw, fecha_alt) in (2,3,4)
order by datepart(dw, fecha_alt)


/*15. Para todos los empleados, obtener el día que fueron dados de alta en la empresa (Lunes,
Martes,...Viernes). Los días no laborables aparecerán como „Fin de Semana?. La salida
estará ordenada por el día de la semana y deberá mostrar el apellido y oficio de cada
empleado además del día correspondiente.*/

select apellido, oficio, case datepart(dw, fecha_alt) 
when 6 then 'Fin de semana'
when 7 then 'Fin de semana'
else datename(dw, fecha_alt) end "dia de la semana"
from EMP2
order by datepart(dw, fecha_alt)


/*31.  Listar, a partir de las tablas EMP2 y DEPT2, el nombre de cada empleado, su oficio, su
número de departamento y el nombre del departamento en el que trabajan.(Obtener la
salida ordenada por número de departamento).*/

select apellido, oficio, dept_no, (select dnombre from dep2 where dept_no=e.dept_no) departamento
from emp2 e
order by dept_no

select apellido, oficio, e.dept_no, dnombre
from emp2 e inner join dep2 d on e.dept_no=d.dept_no
order by dept_no


/*32. Seleccionar los nombres, profesiones y localidades de los departamentos donde trabajan
los analistas.*/

select apellido, oficio, LOC, DNOMBRE
from EMP2, DEP2
where OFICIO='analista'


/*33. Se desea conocer el nombre y el oficio de todos aquellos empleados que trabajan en
Madrid. La salida estará ordenada por el campo oficio.*/

select apellido, oficio, LOC
from EMP2, DEP2
where LOC='Madrid'
order by OFICIO


/*41. Obtener el apellido, departamento y oficio de aquellos empleados que tengan un oficio
que esté en el departamento 20 y que no sea ninguno de los oficios que están en el
departamento de VENTAS.*/

select apellido, d.dnombre, e.DEPT_NO, OFICIO
from EMP2 e,DEP2 d
where oficio in(select oficio from emp2 where dept_no = 20) and oficio not in(select oficio from emp2 where dept_no in(select DEPT_NO from DEP2 where dnombre = 'ventas'))
--no va

/*45.  Presentar los nombres y oficios de los empleados que tienen el mismo trabajo que
JIMENEZ.*/

select apellido, oficio
from EMP2
where oficio in (select oficio from emp2 where apellido='jimenez')


/*47.  Presentar los nombre y oficios de todos los empleados del departamento 20, cuyo trabajo
sea idéntico al de cualquiera de los empleados del departamento de VENTAS.*/

select apellido, oficio
from emp2
where DEPT_NO = 20 and oficio in (select oficio from emp2 where dept_no in (select dept_no from DEP2 where dnombre = 'ventas'))


/**/
select dnombre, loc
from dep2
where dept_no in (select dept_no from emp2 where oficio='analista')

/*32. Seleccionar los nombres, profesiones y localidades de los departamentos donde trabajan
los analistas.*/

select apellido, oficio, (select loc from dep2 where dept_no=e.dept_no) loc
from emp2 e
where dept_no in (select dept_no from emp2 where oficio='analista')


/*33.  Se desea conocer el nombre y el oficio de todos aquellos empleados que trabajan en
Madrid. La salida estará ordenada por el campo oficio.*/

select apellido, oficio
from emp2
where dept_no in (select dept_no from dep2 where loc='madrid')
order by oficio


/*41. Obtener el apellido, departamento y oficio de aquellos empleados que tengan un oficio
que esté en el departamento 20 y que no sea ninguno de los oficios que están en el
departamento de VENTAS.*/

select apellido, dept_no, oficio, (select dnombre from dep2 where dept_no=e.dept_no) departamento
from emp2 e
where oficio in (select oficio from emp2 where dept_no=20)
and oficio not in (select oficio from emp2 where dept_no in (select dept_no from dep2 where dnombre='ventas'))

/*45. Presentar los nombres y oficios del los empleados que tienen el mismo trabajo que
JIMENEZ.*/

select apellido, oficio
from emp2
where oficio = (select oficio from emp2 where apellido='jimenez') and apellido !='jimenez'

/*47  Presentar los nombre y oficios de todos los empleados del departamento 20, cuyo trabajo
sea idéntico al de cualquiera de los empleados del departamento de VENTAS.*/

select apellido, oficio
from emp2
where dept_no=20 and oficio in (select oficio from emp2 where dept_no in
									(select dept_no from dep2 where dnombre='ventas'))


/*66 Indique todos los pacientes que tienen una "s" en su apellido, pero que esta letra no sea la
primera.*/

select apellido
from emp2
where apellido not like 's%' and apellido like '%s%'


/*67. Recuperar el nombre de la sala, el código de la sala y el código del hospital para aquellas
salas que no se encuentran en los hospitales 13 o 18.*/

select nombre, SALA_COD, HOSPITAL_COD
from sala
where HOSPITAL_COD not like '13' and HOSPITAL_COD not like '18'


/*68. Recuerde todo el personal por el turno en el que trabajan, indicando nombre de cada
persona, su función y su turno.*/

select APELLIDO, TURNO, FUNCION
from PLANTILLA
order by turno


/*69. Muestre, por funciones y en orden descendente de salario, los trabajos y los salarios de
los empleados del hospital.*/

select APELLIDO, FUNCION, SALARIO
from PLANTILLA
order by SALARIO desc


/*70. Encuentre a todas las enfermeras y los internos indicando el salario mensual de cada uno.*/

select APELLIDO, FUNCION, salario/12 salario_mensual
from PLANTILLA
where FUNCION='enfermera' or FUNCION='interno'

/*72. Los empleados de la empresa, reciben el día de su aniversario (en la empresa), 12 €, por
cada 5 años cumplidos. Mostrar el nombre del empleado que cumple años, en el día de
hoy, y la cantidad de dinero a recibir.*/

SELECT APELLIDO, 12 * ((year(getdate()) - year(fecha_alt)) / 5) regalo
from EMP2
where day(getdate())=day(fecha_alt) and month(getdate())=month(fecha_alt)


/*73. ¿Cuántos días hace que celebraste tu último cumpleaños?*/

select case when datediff(dd, '09/06/' + datename(yy, getdate()), getdate()) < 0
			then datediff(dd, '09/06/' + datename(yy, dateadd(yy, -1, getdate())), getdate())
			when datediff(dd, '09/06/' + datename(yy, getdate()), getdate()) > 0
			then datediff(dd, '09/06/' + datename(yy, getdate()), getdate())
			else 0
			end


/*74. ¿Cuántos días falta para que llegue Navidad?*/

select case when datediff(dd, getdate(), '25/12/' + datename(yy, getdate())) < 0
			then datediff(dd, getdate(), '25/12/' + datename(yy, dateadd(yy, -1, getdate())))
			when datediff(dd, getdate(), '25/12/' + datename(yy, getdate())) > 0
			then datediff(dd, getdate(), '25/12/' + datename(yy, getdate()))
			else 0
			end


/*75. Recuperar empleado y función, con un guión entre ellos, usando “Empleado y Función”
como cabecera de la columna.*/

select apellido + '-' + oficio "empleado y funcion"
from emp2


/*75b. Igual que el anterior pero solo en mayúsculas la inicial*/

select upper(left(apellido,1)) + lower(substring(apellido, 2, len(apellido))) + '-' +  
		upper(left(oficio,1)) + lower(substring(oficio, 2, len(oficio))) "empleado y funcion"
from emp2


/*Calcular edad*/

select apellido, (cast(convert(char(10), getdate(), 112) as int) - convert(char(10), fecha_nac, 112))/10000 edad
from enfermo


/*79. Recuperar todas las personas (nombre y número de empleado) que trabajan para Negro,
excepto Tovar y Jiménez.*/

select emp_no, APELLIDO 
from emp2
where dir=7698 and apellido != 'tovar' and apellido !='jimeno'


/*80. Listar a partir de la base de datos de hospital, el nombre de cada empleado, su trabajo y la
localización de su puesto de trabajo (nombre del hospital y código de la sala).*/

select APELLIDO, FUNCION, (select NOMBRE from HOSPITAL where HOSPITAL_COD = plantilla.HOSPITAL_COD) + ' sala ' + cast(SALA_COD as char) "Puesto de trabajo"
from PLANTILLA


/*81. Repetir la misma lista, excepto que en esta ocasión, se obtendrá el nombre de la sala y el
código del hospital.*/

select APELLIDO, FUNCION, ('Hospital ' + cast(HOSPITAL_COD as varchar) + ' sala ' + (select distinct NOMBRE from SALA where SALA_COD = plantilla.SALA_COD)) "Puesto de trabajo"
from PLANTILLA


/*85. Se desea saber, el nombre del jefe, y los subordinados del mismo (número de empleado y
nombre)*/

select j.apellido jefe, e.apellido subordinado, e.emp_no
from emp2 j join emp2 e on e.dir=j.emp_no


/*86. ¿Qué empleados del hospital, atendieron anoche a "Neal R"?*/

select apellido, hospital_cod, sala_cod
from plantilla p
where turno='n' and hospital_cod in (
			select hospital_cod
			from ocupacion
			where sala_cod=p.sala_cod and inscripcion in (
						select inscripcion
						from enfermo
						where apellido like '%neal%'))


/*16. Obtener media salarial de los analistas*/

select avg(salario) "media de los analistas", oficio
from emp2
where oficio='analista'
group by oficio


/*17. Encontrar el salario más alto y más bajo de la tabla empleados, así como la diferencia
entre ambos.*/

select max(salario) máximo, min(salario) mínimo, max(salario) - min(salario) diferencia
from emp2


/*18. Calcular el número de oficios diferentes que hay, en total, en los departamentos 10 y 20
de la empresa.*/

select count(distinct oficio) oficios, d.DEPT_NO
from emp2 e right join dep2 d on d.dept_no = e.dept_no
where d.dept_no in (10,20)
group by d.dept_no


/*19. Calcular el número de personas que realizan cada oficio en cada departamento. La salida
deberá mostrar: Número de Dpto. Oficio y número de empleados que lo desempeñan.*/

select count(emp_no) personas, isnull(OFICIO,'') oficio, dep2.dept_no
from emp2 right join dep2 on dep2.DEPT_NO=emp2.DEPT_NO
group by OFICIO, dep2.DEPT_NO


/*20. Buscar qué departamentos tienen más de cuatro personas trabajando.*/

select (select dnombre from dep2 where e.dept_no=DEPT_NO) departamento
from emp2 e
group by DEPT_NO
having count(emp_no) > 4


/*21. Buscar qué departamentos tienen más de dos personas trabajando en la misma profesión.*/

select (select dnombre from dep2 where emp2.dept_no=DEPT_NO) departamento
from emp2
group by oficio, DEPT_NO
having count(oficio) > 2


/*22. Se desea saber el número de empleados por departamento que tienen el oficio de
„EMPLEADO‟, la salida se ordenará por número de departamento.*/

select dnombre, (select count(oficio) from emp2 where DEPT_NO=DEP2.DEPT_NO and oficio='empleado') empleados
from DEP2


/*23. Se desea saber, el salario total (salario+comisión) medio anual de los vendedores de
nuestra empresa.*/

select apellido, salario+isnull(comision,0)
from emp2
where oficio='vendedor'

/*24. Se desea saber el salario total (salario+comisión) medio anual, tanto de los empleados
como de los vendedores de nuestra empresa. La salida tendrá el siguiente formato:

			OFICIO		SALARIO MEDIO ANUAL
			EMPLEADO		810.61
			VENDEDOR		1523.56*/

select oficio, avg(salario+isnull(comision,0)) salario
from emp2
where oficio in ('empleado', 'vendedor')
group by oficio


/*25. Se desea saber para cada departamento y en cada oficio, el máximo salario y la suma
total de los salarios, pero sólo de aquellos cuya suma salarial supere o sea igual al 50%
de su máximo salario. En el muestreo, sólo se estudiaron aquellos empleados que no
tengan comisión o la tengan menor que el 25% de su salario. La salida tendrá el siguiente
formato:

DEPT_NO	OFICIO	SUMA	MÁXIMO*/

select dept_no, oficio, sum(salario) suma, max(salario) máximo
from emp2
where comision < (salario / 4) or comision is null
group by dept_no, oficio
having sum(salario) >= (max(salario) / 2)


/*26. Se desea saber para cada oficio, dentro de cada año de alta distinto que existe en nuestra
empresa, el número de empleados y la media salarial que tiene. Para este estudio no se
tendrá en cuenta a los empleados que no hayan sido dados de alta en un día laboral.
Además sólo se desea saber estos datos, de aquellos oficios y años que tienen más de un
empleado. La salida se obtendrá ordenada por año de alta y media salarial
correspondiente, en orden ascendente.*/

select distinct year(fecha_alt) año, oficio, count(emp_no) empleados, avg(salario) media_salarial
from emp2
where datepart(dw, FECHA_ALT) not in (6,7)
group by year(fecha_alt), oficio
having count(emp_no) > 1
order by avg(salario)


/*30. Queremos saber el máximo y el mínimo y la media salarial, de cada uno de los
departamentos. La salida tendrá el siguiente formato:
		COMENTARIO		VALOR		DEPT_NO
		Máximo-->		3906.57		10
		Media-->		2278.93		10
		Media-->		1015.71		10*/

select 'Máximo-->' comentario, max(salario) valor, dept_no
from emp2
group by DEPT_NO
union
select 'Mínimo-->' comentario, min(salario) valor, dept_no
from emp2
group by DEPT_NO
union
select 'Media-->' comentario, avg(salario) valor, dept_no
from emp2
group by DEPT_NO
order by dept_no


/*34. Se desea conocer cuántos empleados existen en cada departamento. Devolviendo una
salida como la que se presenta y ordenando la salida en orden decreciente de número de
empleados.*/

select dept_no, dnombre, (select count(emp_no)
							from emp2
							where dept_no = dep2.dept_no) n_emp
from DEP2

select d.dept_no, dnombre, count(emp_no) n_emp
from emp2 e right join dep2 d on e.DEPT_NO = d.DEPT_NO
group by d.DEPT_NO, dnombre
order by n_emp desc


/*35. Se desea conocer, tanto para el departamento de VENTAS, como para el de
CONTABILIDAD, su máximo, su mínimo y su media salarial, así como el número de
empleados en cada departamento. La salida estará ordenada por el nombre de
departamento, y deberá presentar la siguiente forma:*/

select DNOMBRE, isnull(max(salario),0) smax, isnull(min(salario),0) smin, isnull(avg(salario),0) smed, count(emp_no) n_emp
from emp2 e right join dep2 d on d.DEPT_NO = e.DEPT_NO
where DNOMBRE = 'ventas' or DNOMBRE = 'contabilidad'
group by DNOMBRE
order by DNOMBRE

/*36. Se desea conocer el máximo salario que existe en cada sala de cada hospital, dando el
resultado como sigue: HOSPITAL, SALA, MAXIMO.*/

select HOSPITAL_COD, SALA_COD, max(SALARIO) maxsalario
from PLANTILLA
group by HOSPITAL_COD, SALA_COD


/*38. Se desea conocer para todos los departamentos existentes, el mínimo salario de cada uno
de ellos, mostrando Nombre de Departamento y Mínimo. Para el muestreo del mínimo
salario, no queremos tener en cuenta, a las personas cuyo oficio es el de empleado. La
salida se ordenará por el campo salario descendentemente.*/

select dnombre, (select isnull(min(salario),0)
					from emp2 where OFICIO != 'empleado' and dept_no=d.dept_no) minimo
from dep2 d
order by minimo desc


/*48. Se desea conocer todos los empleados de los departamentos , que no ganan ni el máximo
ni el mínimo salarial de la empresa.*/

select APELLIDO
from emp2
where (select max(salario) from emp2) != SALARIO and (select min(salario) from emp2) != SALARIO


/*28. Se desea obtener un informe matriz como el que se presenta, en el que la coordenada
vertical hace referencia a los distintos oficios existentes en la empresa, y la coordenada
horizontal a los distintos departamentos. Los valores de la matriz, indicaran la suma de
salarios por oficio y departamento. La última columna indica la suma total de salarios por
Oficio.*/

select oficio,
sum(case dept_no when 10 then salario else 0 end) dep10,
sum(case dept_no when 20 then salario else 0 end) dep20,
sum(case dept_no when 30 then salario else 0 end) dep30,
sum(case dept_no when 40 then salario else 0 end) dep40,
sum(salario) total
from emp2
group by oficio
order by total desc


/*29. Se desea saber para cada departamento y oficio, la suma total de comisiones, teniendo en
cuenta que para los empleados que no tienen comisión, se les asignará:
o El 10% de su salario si son del departamento 10.
o El 15% de su salario si son del departamento 20.
o El 17% de su salario si son del departamento 30.
o De cualquier otro departamento se le asignará el 5% de su salario.
No se tendrán en cuenta a los empleados que hayan sido dados de alta después de 1981,
ni al que abstente el cargo de „PRESIDENTE‟.
En la salida se mostrarán los siguientes datos: DEP_NO, OFICIO, SUMA DE
COMISIONES.*/

select dept_no, oficio,
case dept_no when 10 then sum(isnull(comision,SALARIO * 0.10))
				when 20 then sum(isnull(comision,SALARIO * 0.15))
				when 30 then sum(isnull(comision,SALARIO * 0.17))
				else sum(isnull(comision, salario * 0.05)) end suma
from emp2
where year(fecha_alt) <= 1981 and oficio != 'presidente'
group by dept_no, oficio


/*42. Obtener el número de empleado, número de departamento y apellido de todos los
empleados que trabajan en el departamento 20 o 30 y su salario sea mayor que dos veces
el mínimo de la empresa. No queremos que el oficio sea PRESIDENTE.*/

select emp_no, dept_no, apellido 
from emp2
where dept_no in (20,30) and salario > (select min(salario) * 2 from emp2) and oficio != 'presidente'


/*43. Encontrar a las personas que ganan 3.000 € más que el miembro del personal de sueldo
más alto del turno de mañana y que tenga el mismo trabajo que el señor Nuñez.*/

select apellido, salario
from plantilla
where salario > (select max(salario) from plantilla where turno = 'm') + 3000 and funcion = (select funcion from plantilla where apellido like '%nuñ%')


/*44. Queremos averiguar el apellido del individuo más antiguo de la empresa.*/

select apellido
from emp2
where fecha_alt = (select min(fecha_alt) from emp2)

/*46. Queremos conocer el apellido, oficio, salario y departamento en el que trabajan, de todos
los individuos cuyo salario sea mayor que el mayor salario del departamento 30.*/

select apellido, oficio, salario, (select dnombre from dep2 where dept_no=e.dept_no) departamento
from emp2 e
where salario > (select max(salario) from emp2 where dept_no=30)


/*50. Se desea averiguar el número de oficios por departamento, sin tener en cuenta en el
muestreo a aquellos individuos que están en alguno de los departamentos que contienen
VENDEDORES. La salida mostrará NUMERO, NUM_DEPT, NOMBRE y estará
ordenada por el número de oficios de forma descendente.*/

select dept_no, dnombre, (select count(distinct oficio)
							from emp2 where d.dept_no=dept_no
										and dept_no not in(select dept_no
															from emp2
															where oficio = 'vendedor')) of_dept
from dep2 d
order by 3 desc


/*51. Formar en el formato que se indica, el apellido, departamento y sueldo del empleado que
más gana y la empresa y el que menos.
DEP	MAXIMO	APELLIDO	DEP	MINIMO	APELLIDO
10	3906	REY			20	625		SANCHEZ*/

select ma.dept_no dep, ma.salario maximo, ma.apellido, mi.dept_no dep, mi.salario minimo, mi.apellido
from emp2 ma, emp2 mi
where ma.salario = (select max(salario) from emp2) and mi.salario = (select min(salario) from emp2)


/*52. Mostrar el nombre del departamento y número de empleados que se dieron de alta en el
mes de Diciembre, del departamento que más empleados dio de alta dicho mes.*/

select dnombre, count(e.dept_no) empleados
from emp2 e right join dep2 d on d.dept_no=e.dept_no
where month(fecha_alt)=12
group by dnombre
having count(emp_no) = (select top 1 count(*)
						from emp2
						where MONTH(fecha_alt)=12
						group by dept_no
						order by count(emp_no) desc)


/*54. Queremos saber: nombre y número de departamento, apellido y fecha de alta, del
empleado más joven de cada departamento.*/

select (select dnombre
		from dep2
		where e.dept_no=dept_no) departamento, apellido, convert(char(10),fecha_alt,103) fecha_alt
from emp2 e
where fecha_alt = (select min(fecha_alt)
					from emp2
					where e.dept_no=dept_no)


/*55. Se desea saber el nombre, oficio y departamento del empleado que más gana del
departamento con media salarial más alta.*/

select apellido, oficio, dept_no
from emp2
where salario in (select max(salario)
					from emp2
					where dept_no in (select dept_no
										from emp2
										where salario in (select max(salario)
															from emp2
															group by dept_no
															having avg(salario) = (select top 1 avg(salario)
																					from emp2
																					group by dept_no
																					order by 1 desc))))


/*58. Cambiar al paciente número 74835, la dirección a Alcalá 411.*/

begin tran
update enfermo set direccion='Alcalá 411' where INSCRIPCION = 74835

select * from enfermo where INSCRIPCION = 74835
rollback
select * from enfermo where INSCRIPCION = 74835


/*59. Poner todas las direcciones de la tabla enfermo a NULL.*/

begin tran
update enfermo set direccion = null

select * from enfermo
rollback
select * from enfermo


/*60. Igualar la dirección y fecha de nacimiento del paciente 10995 a los valores de las
columnas correspondientes almacenadas para el paciente 14024.*/

begin tran
update enfermo
set direccion = (select DIRECCION
					from enfermo
					where INSCRIPCION = 18044), FECHA_NAC = (select FECHA_NAC
																from enfermo
																where INSCRIPCION = 18044)
where INSCRIPCION = 10995

select inscripcion, DIRECCION, FECHA_NAC from enfermo where INSCRIPCION in (10995, 18044) 
rollback
select inscripcion, DIRECCION, FECHA_NAC from enfermo where INSCRIPCION in (10995, 18044)


/*61. En todos los hospitales se ha recibido un aumento de presupuesto, por lo que se
incrementará el número de camas disponible en un 10%. Da un error ¿por qué?*/

begin tran
update hospital
set NUM_CAMA = NUM_CAMA + (NUM_CAMA * 0.1)

select * from hospital
rollback
select * from hospital


/*62. Insertar en la tabla plantilla al enfermero GARCIA J. Con salario de 18000 € y un
número de empleado 1234. Trabaja en el hospital 22 y sala 2.*/

begin tran
insert into plantilla (funcion, apellido, salario, empleado_no, hospital_cod, sala_cod)
values ('enfermero', 'García J.', 18000, 1234, 22, 2)

select * from plantilla
rollback
select * from plantilla

/*63. Insertar en la misma fila anterior sin indicar los campos que insertarán los valores ¿por
qué no se indican?*/

begin tran
insert into plantilla
values (22, 2, 1234, 'García J.', 'enfermero', null, 18000)

select * from plantilla
rollback
select * from plantilla