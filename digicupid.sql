-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-05-2022 a las 16:40:48
-- Versión del servidor: 10.4.17-MariaDB
-- Versión de PHP: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `digicupid`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `megusta`
--

CREATE TABLE `megusta` (
  `USUARIO1` varchar(20) NOT NULL,
  `USUARIO2` varchar(20) NOT NULL,
  `FECHA` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nomegusta`
--

CREATE TABLE `nomegusta` (
  `USUARIO1` varchar(20) NOT NULL,
  `USUARIO2` varchar(20) NOT NULL,
  `FECHA` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `NOMBRE` varchar(20) DEFAULT NULL,
  `CORREOELECTRONICO` varchar(35) DEFAULT NULL,
  `NOMBREUSUARIO` varchar(20) NOT NULL,
  `FOTO` varchar(100) DEFAULT NULL,
  `CONTRASEÑA` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`NOMBRE`, `CORREOELECTRONICO`, `NOMBREUSUARIO`, `FOTO`, `CONTRASEÑA`) VALUES
('Andrea', 'Andrea@gmail.com', 'AndreaAngel97', NULL, 'andrea123'),
('Juanma', 'juanma@yisus.es', 'Juanmita123', NULL, '12345'),
('Paco', 'Paquito@csgo.in', 'TheMirageTank', NULL, 'paco777');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `megusta`
--
ALTER TABLE `megusta`
  ADD PRIMARY KEY (`USUARIO1`,`USUARIO2`),
  ADD KEY `USUARIO2` (`USUARIO2`);

--
-- Indices de la tabla `nomegusta`
--
ALTER TABLE `nomegusta`
  ADD PRIMARY KEY (`USUARIO1`,`USUARIO2`),
  ADD KEY `USUARIO2` (`USUARIO2`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`NOMBREUSUARIO`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `megusta`
--
ALTER TABLE `megusta`
  ADD CONSTRAINT `megusta_ibfk_1` FOREIGN KEY (`USUARIO1`) REFERENCES `usuario` (`NOMBREUSUARIO`),
  ADD CONSTRAINT `megusta_ibfk_2` FOREIGN KEY (`USUARIO2`) REFERENCES `usuario` (`NOMBREUSUARIO`);

--
-- Filtros para la tabla `nomegusta`
--
ALTER TABLE `nomegusta`
  ADD CONSTRAINT `nomegusta_ibfk_1` FOREIGN KEY (`USUARIO1`) REFERENCES `usuario` (`NOMBREUSUARIO`),
  ADD CONSTRAINT `nomegusta_ibfk_2` FOREIGN KEY (`USUARIO2`) REFERENCES `usuario` (`NOMBREUSUARIO`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
