-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-02-2015 a las 13:07:13
-- Versión del servidor: 5.5.27
-- Versión de PHP: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `manempsa`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE IF NOT EXISTS `clientes` (
  `CIF` varchar(15) NOT NULL,
  `Nombre` varchar(100) NOT NULL,
  `Dirección` varchar(100) NOT NULL,
  `Tfno1` varchar(20) NOT NULL,
  `Tfno2` varchar(20) NOT NULL,
  PRIMARY KEY (`CIF`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`CIF`, `Nombre`, `Dirección`, `Tfno1`, `Tfno2`) VALUES
('B11223212', 'Seguros Segasa', 'C/ Ancha 2', '956344334', '629234323'),
('B22334466', 'Academia la Plata', 'C/ La Plata 10', '956302323', ''),
('B33221111', 'Papelería Cuatro', 'C/ Larga 8', '956305060', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `coches`
--

CREATE TABLE IF NOT EXISTS `coches` (
  `Matricula` varchar(10) NOT NULL,
  `Marca` varchar(50) NOT NULL,
  `Modelo` varchar(50) NOT NULL,
  `Año` int(11) NOT NULL,
  `DNI` varchar(15) NOT NULL,
  PRIMARY KEY (`Matricula`),
  KEY `DNI` (`DNI`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `coches`
--

INSERT INTO `coches` (`Matricula`, `Marca`, `Modelo`, `Año`, `DNI`) VALUES
('3322-ASR', 'SEAT', 'Ibiza', 2000, '21.123.123-A'),
('4433-ABB', 'CITROEN', 'Saxo', 2001, '12.321.567-B');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicios`
--

CREATE TABLE IF NOT EXISTS `servicios` (
  `Numero` int(11) NOT NULL AUTO_INCREMENT,
  `Fecha` date NOT NULL,
  `Tipo` varchar(100) NOT NULL,
  `Cantidad` double NOT NULL,
  `Comentario` text NOT NULL,
  `DNI` varchar(15) NOT NULL,
  `CIF` varchar(15) NOT NULL,
  PRIMARY KEY (`Numero`),
  UNIQUE KEY `Numero` (`Numero`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcado de datos para la tabla `servicios`
--

INSERT INTO `servicios` (`Numero`, `Fecha`, `Tipo`, `Cantidad`, `Comentario`, `DNI`, `CIF`) VALUES
(1, '2004-04-12', 'Limpieza', 300, '', '21.123.123-A', 'B11223212'),
(2, '2005-05-22', 'Fontanería', 238, 'Arreglo tuberías.', '12.321.567-B', 'B22334466'),
(3, '2005-12-21', 'Electricidad', 130, 'Revisión Cableado.', '21.123.123-A', 'B33221111'),
(4, '2006-11-10', 'Fontanería', 250, '', '12.321.567-B', 'B11223212');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trabajadores`
--

CREATE TABLE IF NOT EXISTS `trabajadores` (
  `DNI` varchar(15) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Apellido` varchar(50) NOT NULL,
  `Sueldo` double NOT NULL,
  `Fecha` date NOT NULL,
  `Matricula` varchar(10) NOT NULL,
  PRIMARY KEY (`DNI`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `trabajadores`
--

INSERT INTO `trabajadores` (`DNI`, `Nombre`, `Apellido`, `Sueldo`, `Fecha`, `Matricula`) VALUES
('12.321.567-B', 'Juan', 'Pérez', 1120, '2002-05-04', '4433-ABB'),
('21.123.123-A', 'Ana', 'Ruíz', 1200, '2002-03-02', '3322-ASR');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
