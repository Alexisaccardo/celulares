-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-09-2023 a las 17:51:00
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `celulares`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `marcascelulares`
--

CREATE TABLE `marcascelulares` (
  `codigo` int(30) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `puntuacion` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `marcascelulares`
--

INSERT INTO `marcascelulares` (`codigo`, `nombre`, `puntuacion`) VALUES
(12345, 'iPhone', 3),
(5432, 'Motorola', 1),
(54321, 'Samsung', 2),
(1234, 'Xiaomi', 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `marcascelulares`
--
ALTER TABLE `marcascelulares`
  ADD PRIMARY KEY (`nombre`) USING BTREE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
