-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-04-2016 a las 13:15:32
-- Versión del servidor: 5.5.27
-- Versión de PHP: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `dam_pruebas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administradores`
--

CREATE TABLE IF NOT EXISTS `administradores` (
  `Nombre` varchar(100) DEFAULT NULL,
  `Apellidos` varchar(200) DEFAULT NULL,
  `Usuario` varchar(100) NOT NULL,
  `Clave` varchar(100) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `administradores`
--

INSERT INTO `administradores` (`Nombre`, `Apellidos`, `Usuario`, `Clave`, `Email`) VALUES
(NULL, NULL, 'admin', 'admin', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `noticias`
--

CREATE TABLE IF NOT EXISTS `noticias` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TITULAR` varchar(256) DEFAULT NULL,
  `TEXTO` varchar(256) DEFAULT NULL,
  `FECHA` datetime DEFAULT NULL,
  `USUARIO` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `USUARIO` (`USUARIO`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Volcado de datos para la tabla `noticias`
--

INSERT INTO `noticias` (`ID`, `TITULAR`, `TEXTO`, `FECHA`, `USUARIO`) VALUES
(1, 'Hola', 'Esto es una noticia noticiosa ', '2013-10-09 01:30:38', NULL),
(2, 'Noticia de roma', 'claro que si es mi noticia que pasa aquí que no puedo poner mi noticia, o que ehhh', '2013-10-09 01:32:54', 'roma'),
(3, 'noticia romatutorials', 'esto es el textoooo', '2013-10-31 00:00:00', 'alfredo'),
(4, 'eeee', 'eeee', '2013-11-03 00:00:00', NULL),
(5, 'eeee', 'eeee', '2013-11-03 00:00:00', 'Juanjo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
  `NOMBRE` varchar(30) DEFAULT NULL,
  `APELLIDOS` varchar(120) DEFAULT NULL,
  `CALLE` varchar(100) DEFAULT NULL,
  `NUMERO` int(11) DEFAULT NULL,
  `CP` varchar(5) DEFAULT NULL,
  `TELEFONO` varchar(9) DEFAULT NULL,
  `EMAIL` varchar(256) DEFAULT NULL,
  `PROVINCIA` varchar(120) DEFAULT NULL,
  `USUARIO` varchar(30) NOT NULL DEFAULT '',
  `CLAVE` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`USUARIO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`NOMBRE`, `APELLIDOS`, `CALLE`, `NUMERO`, `CP`, `TELEFONO`, `EMAIL`, `PROVINCIA`, `USUARIO`, `CLAVE`) VALUES
('Alfredo', 'Lara', 'c/ sinagoga', 67, '13456', '987654678', 'alfredo@gmail.com', 'Cuenca', 'Alfredo', 'alfredo'),
('Juanjo', 'Villa', 'c/ napoleon', 23, '14567', '945678987', 'juanjito@gmail.com', 'Ciudad Real', 'Juanjo', 'juanjo'),
('David', 'Romera', 'C/ Nono', 5, '13249', '978654678', 'romera@gmail.com', 'Albacete', 'roma', 'roma');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `noticias`
--
ALTER TABLE `noticias`
  ADD CONSTRAINT `noticias_ibfk_1` FOREIGN KEY (`USUARIO`) REFERENCES `usuarios` (`USUARIO`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
