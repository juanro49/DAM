/*1*/

select (select N_NOMBRE
		from participante
		where C_ASOCIADO=c_jugador2) nombre, convert(char(10),(select D_FECHA_JORNADA
																from jornada
																where c_jornada=p.C_JORNADA), 103) fecha
from partida p
where c_jugador1 ='A05'
union
select (select N_NOMBRE
		from participante
		where C_ASOCIADO=c_jugador1) nombre, convert(char(10),(select D_FECHA_JORNADA
																from jornada
																where c_jornada=p.C_JORNADA), 103) fecha
from partida p
where c_jugador2 ='A05'

/*2*/

select N_NOMBRE, (select n_pais
					from pais
					where c_pais=p.c_pais) pais, (cast(convert(char(10), getdate(), 112) as int) - convert(char(10), D_FECHA_NAC, 112))/10000 edad
from participante p


/*3*/

select top 2(select N_HOTEL
				from hotel
				where C_HOTEL=ph.C_HOTEL) nombre 
from participante_hotel ph
group by c_hotel
order by count(c_asociado) desc