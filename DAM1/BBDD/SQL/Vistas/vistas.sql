/*1. Crear una vista para los departamentos 10 y 20*/
create view v1 as
select * from emp2 where dept_no in (10,30)

select * from v1

grant select on v1 to juanro


/*2. Crear una vista para los departamentos 10 y 30*/
create view v2 as
select * from emp2 where dept_no in (10,30)

select * from v2

grant select on v2 to juanro


/*3. Hacer un join entre las dos vistas anteriores.*/

create view v3 as
select v1.*
from v1 inner join v2 on v1.DEPT_NO=v2.DEPT_NO

select * from v3