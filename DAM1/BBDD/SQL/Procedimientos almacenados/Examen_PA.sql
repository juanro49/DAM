
------------------------------------------------------------------------
-- RECORDAD CAMBIAR EL NOMBRE DEL FICHERO CON VUESTRO NOMBRE Y APELLIDO.
------------------------------------------------------------------------


/* 3. Crear un procedimiento almacenado que calcule el presupuesto total de un centro, pasado como parámetro
   su código de centro, cuyos directores de departamento NO estén en funciones. Opcionalmente, se le podrá
   proporcionar el nombre de un departamento como segundo parámetro, en cuyo caso se deberá obtener el
   presupuesto de ese departamento. Como requisitos, se pide que se haga todo a través de una única consulta
   (SELECT) y que la columna de salida tenga como nombre "PRESUPUESTO". (2,5 puntos) */

   use temple
   go

   create proc pa_presupuesto_total
		@codCentro numeric(2,0),
		@nomDept varchar(20) = '%'
   as
		select sum(PRESU) "PRESUPUESTO"
		from TDEPTO
		where tdir != 'F' and numce = @codCentro and dnombre like '%' + @nomDept + '%'
   go

   exec pa_presupuesto_total 10, 'general'

GO
/* 4. Crear un procedimiento almacenado que calcule la suma total de salarios de un departamento cuyo nombre
   pasaremos como parámetro. Si el resultado de la suma es nulo se debe mostrar un mensaje explicativo. El
   resultado debe proporcionarse como parámetro de salida y, por lo tanto, también deben proporcionarse las
   sentencias necesarias para obtener el resultado de su ejecución y mostrarlo por pantalla. (2.5 puntos) */

   use temple
   go

   create proc pa_suma_salarios
		@nomdept varchar(20),
		@sumSalario numeric(6,2) output
   as
		set @sumSalario = (select sum(SALARIO)
							from TEMPLE
							where NUMDE in (select NUMDE
											from TDEPTO
											where DNOMBRE like '%' + @nomdept + '%'))
		if(@sumSalario is null)
			print 'La suma de los salarios es nula'

   go

   declare @sumaSal numeric(6,2)
   exec pa_suma_salarios 'general', @sumaSal out
   select @sumaSal "Suma Salario"



GO
/* 5. Crear un procedimiento almacenado que obtenga la extensión telefónica y el nombre del departamento de un
   empleado cuyo apellido (solo el apellido) pasaremos como parámetro. Ambos resultados deben proporcionarse
   como parámetros de salida y, por tanto, también deben proporcionarse las sentencias necesarias para obtener
   el resultado de su ejecución y mostrarlo por pantalla. Si no se obtiene ningún resultado (el empleado no
   existe) el procedimiento debe imprimir un mensaje indicando que no se han encontrado datos y, además,
   retornar el código de estado 1. (2.5 puntos) */

   use temple
   go

   create proc pa_ext_telef
		@apellido varchar(20),
		@extel numeric(3,0) out,
		@dnombre varchar(20) out
   as
		if ((select nombre from temple where nombre like '%' + @apellido + '%') is null)
			begin
				print 'No existe ese apellido en la base de datos'
				return 1
			end
		else
			begin
				select @extel = t.EXTEL, @dnombre = d.DNOMBRE
				from temple t inner join tdepto d on t.NUMDE = d.NUMDE
				where t.NOMBRE like '%' + @apellido + '%'
			end

   go
   declare @extelf numeric(3,0), @nomdept varchar(20)
   exec pa_ext_telef 'pons', @extelf out, @nomdept out
   select @extelf "Ext Telf", @nomdept "DNOMBRE"
   
