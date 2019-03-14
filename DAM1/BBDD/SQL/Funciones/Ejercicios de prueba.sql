--Poner fecha en formato español

use hospital
go

create function Fn_FechaEspañol (@fecha date, @separador char(1))
	returns char(10)
as
	begin
		declare @fech char(10)
		set @fech = datename(dd,@fecha) + @separador + cast(month(@fecha) as varchar) + @separador + datename(yy, @fecha)
		return @fech
	end
go

select dbo.Fn_FechaEspañol(getdate(),'-')


--Otra forma

use hospital
go

alter function Fn_FechaEspañol (@fecha date, @separador char(1))
	returns char(10)
as
	begin
		return replicate(0,2 - len(datename(dd,@fecha))) + datename(dd,@fecha) + @separador + 
				replicate(0,2 - len(cast(month(@fecha) as varchar))) + cast(month(@fecha) as varchar) + @separador + datename(yy, @fecha)
	end
go

select apellido, dbo.Fn_FechaEspañol(fecha_nac, '/') "Fecha nacimiento"
from ENFERMO


--Calcular edad
use hospital
go

create function fn_CalcularAños(@fecha_ini date, @fecha_fin date)
	returns int
as
	begin
		if(@fecha_ini > @fecha_fin)
			begin
				declare @aux date
				set @aux = @fecha_ini
				set @fecha_ini = @fecha_fin
				set @fecha_fin = @aux
			end

		return (cast(convert(char(10), @fecha_fin, 112) as int) - convert(char(10), @fecha_ini, 112)) / 10000
	end
go

select apellido, dbo.fn_CalcularAños(fecha_nac, getdate()) "Edad"
from enfermo

/*Crear un procedimiento que introduciendo el nombre de un hospital y una sala diga 
si en ese hospital existe esa sala. Para ello vamos a usar dos funciones a las que 
llamaremos desde el procedimiento. Primero hay que comprobar que el hospital existe 
en la base de datos "1" o si no está "0". Segundo hay que comprobar si una sala es 
válida o no. Por último comprobar que la sala está en ese hospital*/

use hospital
go

create function fn_CompruebaHospital (@nombreHos varchar(15))
	returns int
as
	begin
		declare @retorno int
		if exists (select * from hospital where nombre = @nombreHos)
			set @retorno = 0
		else
			set @retorno = 1
		return @retorno
	end
go

select dbo.fn_CompruebaHospital('virgen de montaña')
go

create function fn_CompruebaSala (@nombreSal varchar(20))
	returns int
as
	begin
		declare @retorno int
		if (select distinct nombre from sala where nombre = @nombreSal) is not null
			set @retorno = 0
		else
			set @retorno = 1
		return @retorno
	end
go

select dbo.fn_CompruebaSala('cuidados intensivos')
go

create proc pa_Sala_en_Hospital
	@hospital varchar(15),
	@sala varchar(30),
	@mensaje varchar(60) out
as
	if dbo.fn_CompruebaHospital(@hospital) = 1
		set @mensaje = 'No existe ese hospital'
	else if dbo.fn_CompruebaSala(@sala) = 1
		set @mensaje = 'No existe esa sala'
	else if exists (select * 
					from hospital h inner join sala s on s.HOSPITAL_COD = h.HOSPITAL_COD
					where h.NOMBRE = @hospital and s.NOMBRE = @sala)
		set @mensaje = 'La sala ' + @sala + ' existe en el hospital ' + @hospital
	else
		set @mensaje = 'La sala ' + @sala + ' no existe en el hospital ' + @hospital
go

declare @hospital varchar(30), @sala varchar(30), @mensaje varchar(60)
exec pa_Sala_en_Hospital 'provincial', 'cuidados intensivos', @mensaje out
select @mensaje
go


/*Crear una función para validar un DNI*/

create function fn_valida_dni (@dni char(9))
	returns varchar(20)
as
	begin
		declare @letra char(1)
		declare @numero varchar(8)
		declare @resto int
		declare @letraobt char(1)
		declare @dnisalida varchar(20)

		set @dni = upper(@dni)
		--separamos la letra
		set @letra = substring(@dni, len(@dni), 1)
		--sacamos el número
		set @numero = SUBSTRING(@dni, 1, len(@dni) - 1)
		--dividimos el numero entre 23 para obtener el resto
		if(isnumeric(@numero) = 1)
			set @resto = @numero % 23
		else
			return 'Número incorrecto'
		--extraemos la letra que corresponde en la cadena
		set @letraobt = SUBSTRING('TRWAGMYFPDXBNJZSQVHLCKE', @resto + 1, 1)

		if(@letra = @letraobt)
			set @dnisalida = 'correcto'
		else
			set @dnisalida = 'error'

		return @dnisalida
	end
go

select dbo.fn_valida_dni('08891608s')

