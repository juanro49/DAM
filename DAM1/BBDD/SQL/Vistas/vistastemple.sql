/*3. Crear una vista llamada VJUBIL1 en la que aparezcan todos los datos de los empleados que cumplen 65 años de edad durante este año, de modo que pueden ser consultados por el director del departamento de personal.*/

create view v3 as
select *
from temple
where year(getdate()) - year(fecha_nac) = 65
and (user in (select cast(direc as char(3))
				from tdepto
				where dnombre = 'personal'))

grant select on v3 to public


/*4.	Crear una vista llamada VJUBIL3, en la que aparezcan todos los datos de los empleados que cumplen 65 años durante este año, de modo que puedan ser consultados por los empleados del departamento de personal.*/

create view v4 as
select *
from temple
where year(getdate()) - year(fecha_nac) = 65
and (user = (select cast(numem as char(3))
				from temple
				where numde in (select numde
								from tdepto
								where dnombre = 'personal')) or user = 'dbo')

grant select on v4 to public


/*5.	Se desea autorizar a cada director de departamento a ver todos los datos
 de los empleados de los departamentos que dirige, tanto en propiedad como en 
 funciones. Crear una vista para ello y autorizarla para consultas.*/

create view v5 as
select *
from temple e
where user in (select cast(direc as char(3))
				from tdepto
				where numde = e.numde)

grant select on v5 to public


/*6.	Se desean obtener el nombre de todos los departamentos con presupuesto
 inferior a 30.000€ por parte del director general de la empresa, que será la
 única persona que tenga derecho a ver dicha información. La salida se mostrará
 ordenada por el campo nombre y el mensaje de salida será 
 DEPARTAMENTO DE nombre_departamento.*/

 alter view v6 as
 select 'DEPARTAMENTO DE ' + dnombre departamento
 from tdepto
 where presu > 30000 and user in (select cast(direc as char(3))
									from tdepto
									where depde is null)

grant select on v6 to public


/*7.	El director inmediato de cada departamento, desea conocer el
 número, nombre y salario total (salario+comisión) de los empleados de 
 su departamento que superan el salario mínimo en 18.000€ mensuales. 
 (salario mínimo es sólo el salario).*/

alter view v7 as
select numem, nombre, salario+isnull(comision,0) salario
from temple e
where salario > (select min(salario)+1800
					from temple)
 and user = (select cast(direc as char(3))
				from tdepto
				where numde = e.numde)

grant select on v7 to public


/*8.	Los empleados de los departamentos 111 y 112, desean obtener un
 listado por orden alfabético de los departamentos, que contengan el nombre, 
 edad en años cumplidos, y la edad que tenían cuando ingresaron en la empresa. 
 Mostrar esta información tan sólo a los empleados de estos departamentos.*/
 
 create view v8 as
 select nombre, (cast (convert(char(10), getdate(),112) as int) - convert(char(10), fecha_nac, 112)) / 10000 edad_entrada
 from temple
 where numde in (111,112) and user in (select cast(numem as char(3))
										from temple
										where numde in (111,112))

grant select on v8 to public


/*9.	Claudita Fierro y Horacio Torres, tras un volcánico y fugaz noviazgo, 
han decidido unirse eternamente en matrimonio. La boda se celebrará dentro de 
dos días, y tomarán 20 días de vacaciones para el viaje de novios. La empresa 
entregará a cada uno como regalo  de bodas un 1% de su salario actual por 
cada año de servicio. Hallar: la fecha de la boda, la fecha en la que tienen 
que incorporarse a trabajar y el regalo de boda correspondiente a cada uno de 
ellos. Esta información podrá ser consultada por, cualquiera de los 
interesados, el director general y los jefes inmediatos de cada uno de ellos, 
pero estos, solamente verán la información correspondiente a su empleado.*/


create view v9 as
select nombre, convert(char(10),
getdate() + 2, 103) boda, convert(char(10),getdate() + 22,103) vuelta,
cast(((cast(convert(char(10), getdate(),112) as int) - (convert(char(10), fecha_alt, 112))) / 10000) * salario * 0.01 as numeric(5,2)) regalo
from temple e
where nombre in ('fierro, claudia', 'torres, horacio')
and (user in (select cast(numem as char(3))
				from temple
				where nombre in ('fierro, claudia', 'torres, horacio')
				or user in (select cast(direc as char(3))
							from tdepto
							where depde is null or numde=e.numde)))

grant select on v9 to public


/*10.	Azucena Muñoz recibió un préstamo para vivienda el día que ingresó en 
empresa, con vencimientos anuales a los 180 días del día y mes de ingreso. 
Hallar la fecha en que vence la anualidad del préstamo correspondiente al año 
actual. Esta información la puede visualizar la interesada, su jefe inmediato 
y cualquiera de los empleados del departamento de personal.*/

alter view v10 as
select convert(char(10), dateadd(dd, 180, dateadd(yy, (cast(convert(char(10), getdate(),112) as int) - (convert(char(10), fecha_alt,112))) / 10000, fecha_alt)),103) vencimiento, nombre
from temple t
where nombre = 'muñoz, azucena' and (user = cast(numem as char(3)) or user = (select cast(direc as char(3))
																				from tdepto
																				where t.numde = numde) or user in (select cast(numem as char(3))
																													from temple
																													where numde in (select numde
																																	from tdepto
																																	where dnombre='personal')))

grant select on v10 to public



/*11.	Los jefes de los departamentos 111 y 112, así como el director 
general, desean hallar la media de los años de servicio de los empleados de 
la empresa a día 31/12. El Director General visualizará la información de 
ambos departamentos y los jefes, visualizarán cada uno la suya. (no se 
tendrán en cuenta, aquellos empleados dados de alta después de la fecha, ni 
tampoco los datos de alta el 31/12).*/

create view v11 as
select numde, avg(year(getdate()) - year(fecha_alt)) media
from temple t
where fecha_alt < '31/12/' + cast(year(getdate()) - 1 as char(4)) and numde in (110,111)
group by numde
having (user in (select cast(direc as char(3))
				from tdepto
				where depde is null or t.numde=numde))

grant select on v11 to public


/*12.	El director general desea conocer, de los departamentos que tienen 
director en funciones, el número de empleados, la suma de sus salarios, de 
sus comisiones y el número de hijos.*/

create view v12 as
select dnombre, count(numem) num_empl, sum(salario) salario, sum(comision) comisiones, sum(numhi) hijos
from temple te right join tdepto td on te.numde=td.numde
where tdir='f'
group by dnombre
having user = (select cast(direc as char(10))
				from tdepto
				where depde is null)

grant select on v12 to public


/*13.	El director general, y los jefes de departamento desean conocer un 
listado de los empleados que han empezado a trabajar en 1988 o después. El 
director general todos y los jefes cada uno el suyo.*/

create view v13 as
select *
from temple t
where year(fecha_alt) >= 1988 and (user in (select cast(direc as char(3))
											from tdepto
											where depde is null or numde = t.numde))

grant select on v13 to public


/*17.	Se desea conocer la media salarial por hijo, respecto al total del 
salario, y respecto al salario y la comisión: es decir algo similar a:
Numhi	MediaS		Msalarialcomi
    1  	260			30
(los valores están en pesetas)
Esta información está restringida al director general, que visualizará los 
valores para todos los empleados de su empresa y los jefes cada uno la 
correspondiente a los miembros de su departamento.*/

create view v17 as
select NUMHI, cast(round(sum(salario)/sum(numhi),2) as numeric(7,2)) MediaS, cast(round(sum(SALARIO + isnull(COMISION,0))/sum(numhi),2) as numeric(7,2)) Mediasalarialcomi
from temple t
where numhi > 0 and user in (select cast(direc as char(3))
				from tdepto
				where depde is null or numde = t.numde)
group by numhi

grant select on v17 to public


/*18.	Los directores de cada uno de los departamentos, ubicados en la 
calle de Alcalá, en los que haya algún empleado con más de 10 años de 
antigüedad y la media de sus hijos por cada uno de los departamentos sea 
superior a 1, se pide conocer el salario medio de estos empleados. Esta 
información la podrán visualizar los jefes de departamento.*/

select cast(round(avg(salario),2) as money) as 'Media Salarial'
from temple
where numde in (select numde
				from tdepto
				where numce = (select numce
								from tcentro
								where señas like '%alcala%')) and year(getdate()) - year(fecha_alt) > 10
group by numde
having avg(numhi) > 1