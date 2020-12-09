USE [master]
GO
/***MOFIFICACIÓN BBDD******/
/****** Object:  Database [ajedrez]    Script Date: 06/02/2018 11:31:01 ******/
CREATE DATABASE [ajedrez]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'ajedrez', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SQLEXPRESS\MSSQL\DATA\ajedrez.mdf' , SIZE = 4288KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'ajedrez_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SQLEXPRESS\MSSQL\DATA\ajedrez_log.ldf' , SIZE = 1072KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [ajedrez] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [ajedrez].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [ajedrez] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [ajedrez] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [ajedrez] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [ajedrez] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [ajedrez] SET ARITHABORT OFF 
GO
ALTER DATABASE [ajedrez] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [ajedrez] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [ajedrez] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [ajedrez] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [ajedrez] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [ajedrez] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [ajedrez] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [ajedrez] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [ajedrez] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [ajedrez] SET  ENABLE_BROKER 
GO
ALTER DATABASE [ajedrez] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [ajedrez] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [ajedrez] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [ajedrez] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [ajedrez] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [ajedrez] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [ajedrez] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [ajedrez] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [ajedrez] SET  MULTI_USER 
GO
ALTER DATABASE [ajedrez] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [ajedrez] SET DB_CHAINING OFF 
GO
ALTER DATABASE [ajedrez] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [ajedrez] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [ajedrez] SET DELAYED_DURABILITY = DISABLED 
GO
USE [ajedrez]
GO
/****** Object:  Table [dbo].[arbitro]    Script Date: 06/02/2018 11:31:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[arbitro](
	[C_ARBITRO] [varchar](3) NOT NULL,
	[Q_AÑOS] [int] NULL DEFAULT (NULL),
PRIMARY KEY CLUSTERED 
(
	[C_ARBITRO] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[hotel]    Script Date: 06/02/2018 11:31:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[hotel](
	[C_HOTEL] [varchar](3) NOT NULL,
	[N_HOTEL] [varchar](250) NULL DEFAULT (NULL),
	[T_DIRECCION] [varchar](250) NULL DEFAULT (NULL),
	[NRO_TELEFONO] [numeric](12, 0) NULL DEFAULT (NULL),
PRIMARY KEY CLUSTERED 
(
	[C_HOTEL] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[jornada]    Script Date: 06/02/2018 11:31:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[jornada](
	[C_JORNADA] [varchar](3) NOT NULL,
	[D_FECHA_JORNADA] [date] NULL DEFAULT (NULL),
PRIMARY KEY CLUSTERED 
(
	[C_JORNADA] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[jugador]    Script Date: 06/02/2018 11:31:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[jugador](
	[C_JUGADOR] [varchar](3) NOT NULL,
	[Q_NIVEL] [int] NULL DEFAULT (NULL),
PRIMARY KEY CLUSTERED 
(
	[C_JUGADOR] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[medio_comunicacion]    Script Date: 06/02/2018 11:31:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[medio_comunicacion](
	[C_MEDIO] [varchar](3) NOT NULL,
	[N_MEDIO] [varchar](120) NULL DEFAULT (NULL),
PRIMARY KEY CLUSTERED 
(
	[C_MEDIO] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[pais]    Script Date: 06/02/2018 11:31:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[pais](
	[C_PAIS] [varchar](2) NOT NULL,
	[N_PAIS] [varchar](20) NULL DEFAULT (NULL),
	[N_FEDERACION] [varchar](120) NULL DEFAULT (NULL),
	[Q_CLUBS_AJEDREZ] [int] NULL DEFAULT (NULL),
PRIMARY KEY CLUSTERED 
(
	[C_PAIS] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[participante]    Script Date: 06/02/2018 11:31:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[participante](
	[C_ASOCIADO] [varchar](3) NOT NULL,
	[C_PAIS] [varchar](2) NOT NULL,
	[N_NOMBRE] [varchar](120) NULL DEFAULT (NULL),
	[T_DIRECCION] [varchar](250) NULL DEFAULT (NULL),
	[D_FECHA_NAC] [date] NULL DEFAULT (NULL),
PRIMARY KEY CLUSTERED 
(
	[C_ASOCIADO] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[participante_hotel]    Script Date: 06/02/2018 11:31:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[participante_hotel](
	[C_ASOCIADO] [varchar](3) NOT NULL,
	[C_HOTEL] [varchar](3) NOT NULL,
	[D_INICIO] [date] NOT NULL DEFAULT ('0000-00-00'),
	[D_FIN] [date] NULL DEFAULT (NULL),
PRIMARY KEY CLUSTERED 
(
	[C_ASOCIADO] ASC,
	[C_HOTEL] ASC,
	[D_INICIO] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[partida]    Script Date: 06/02/2018 11:31:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[partida](
	[NRO_PARTIDA] [varchar](3) NOT NULL,
	[C_HOTEL] [varchar](3) NOT NULL,
	[N_SALA] [varchar](120) NOT NULL,
	[C_ARBITRO] [varchar](3) NOT NULL,
	[C_JUGADOR2] [varchar](3) NOT NULL,
	[C_JORNADA] [varchar](3) NOT NULL,
	[C_JUGADOR1] [varchar](3) NOT NULL,
	[N_COLOR_J1] [varchar](50) NULL DEFAULT (NULL),
	[N_COLOR_J2] [varchar](50) NULL DEFAULT (NULL),
	[Q_ENTRADAS] [int] NULL DEFAULT (NULL),
PRIMARY KEY CLUSTERED 
(
	[NRO_PARTIDA] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[sala]    Script Date: 06/02/2018 11:31:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[sala](
	[C_HOTEL] [varchar](3) NOT NULL,
	[N_SALA] [varchar](120) NOT NULL,
	[Q_CAPACIDAD] [int] NULL DEFAULT (NULL),
PRIMARY KEY CLUSTERED 
(
	[C_HOTEL] ASC,
	[N_SALA] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[sala_medio_comunicacion]    Script Date: 06/02/2018 11:31:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[sala_medio_comunicacion](
	[C_HOTEL] [varchar](3) NOT NULL,
	[N_SALA] [varchar](120) NOT NULL,
	[C_MEDIO] [varchar](3) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[C_HOTEL] ASC,
	[N_SALA] ASC,
	[C_MEDIO] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[arbitro] ([C_ARBITRO], [Q_AÑOS]) VALUES (N'A09', 10)
INSERT [dbo].[arbitro] ([C_ARBITRO], [Q_AÑOS]) VALUES (N'A10', 8)
INSERT [dbo].[hotel] ([C_HOTEL], [N_HOTEL], [T_DIRECCION], [NRO_TELEFONO]) VALUES (N'H01', N'SHARATON', N'AV.LARCOMAR 1530', CAST(4256786 AS Numeric(12, 0)))
INSERT [dbo].[hotel] ([C_HOTEL], [N_HOTEL], [T_DIRECCION], [NRO_TELEFONO]) VALUES (N'H02', N'LOS DELFINES', N'AV.LARCOMAR 1530', CAST(4554846 AS Numeric(12, 0)))
INSERT [dbo].[hotel] ([C_HOTEL], [N_HOTEL], [T_DIRECCION], [NRO_TELEFONO]) VALUES (N'H03', N'MOVENPICK', N'AV.ALEMANIA 3450', CAST(4694856 AS Numeric(12, 0)))
INSERT [dbo].[hotel] ([C_HOTEL], [N_HOTEL], [T_DIRECCION], [NRO_TELEFONO]) VALUES (N'H04', N'SHARATON', N'AV.LAS AMERICAS 4346', CAST(4335766 AS Numeric(12, 0)))
INSERT [dbo].[jornada] ([C_JORNADA], [D_FECHA_JORNADA]) VALUES (N'J01', CAST(N'2017-03-06' AS Date))
INSERT [dbo].[jornada] ([C_JORNADA], [D_FECHA_JORNADA]) VALUES (N'J02', CAST(N'2017-03-07' AS Date))
INSERT [dbo].[jornada] ([C_JORNADA], [D_FECHA_JORNADA]) VALUES (N'J03', CAST(N'2017-03-08' AS Date))
INSERT [dbo].[jornada] ([C_JORNADA], [D_FECHA_JORNADA]) VALUES (N'J04', CAST(N'2017-03-09' AS Date))
INSERT [dbo].[jornada] ([C_JORNADA], [D_FECHA_JORNADA]) VALUES (N'J05', CAST(N'2017-04-17' AS Date))
INSERT [dbo].[jornada] ([C_JORNADA], [D_FECHA_JORNADA]) VALUES (N'J06', CAST(N'2017-04-18' AS Date))
INSERT [dbo].[jornada] ([C_JORNADA], [D_FECHA_JORNADA]) VALUES (N'J07', CAST(N'2017-04-20' AS Date))
INSERT [dbo].[jornada] ([C_JORNADA], [D_FECHA_JORNADA]) VALUES (N'J08', CAST(N'2017-04-21' AS Date))
INSERT [dbo].[jornada] ([C_JORNADA], [D_FECHA_JORNADA]) VALUES (N'J09', CAST(N'2017-04-23' AS Date))
INSERT [dbo].[jugador] ([C_JUGADOR], [Q_NIVEL]) VALUES (N'A01', 3)
INSERT [dbo].[jugador] ([C_JUGADOR], [Q_NIVEL]) VALUES (N'A02', 5)
INSERT [dbo].[jugador] ([C_JUGADOR], [Q_NIVEL]) VALUES (N'A03', 6)
INSERT [dbo].[jugador] ([C_JUGADOR], [Q_NIVEL]) VALUES (N'A04', 8)
INSERT [dbo].[jugador] ([C_JUGADOR], [Q_NIVEL]) VALUES (N'A05', 5)
INSERT [dbo].[jugador] ([C_JUGADOR], [Q_NIVEL]) VALUES (N'A06', 3)
INSERT [dbo].[jugador] ([C_JUGADOR], [Q_NIVEL]) VALUES (N'A07', 8)
INSERT [dbo].[jugador] ([C_JUGADOR], [Q_NIVEL]) VALUES (N'A08', 6)
INSERT [dbo].[medio_comunicacion] ([C_MEDIO], [N_MEDIO]) VALUES (N'M01', N'RADIO')
INSERT [dbo].[medio_comunicacion] ([C_MEDIO], [N_MEDIO]) VALUES (N'M02', N'TELEVISION')
INSERT [dbo].[medio_comunicacion] ([C_MEDIO], [N_MEDIO]) VALUES (N'M03', N'INTERNET')
INSERT [dbo].[pais] ([C_PAIS], [N_PAIS], [N_FEDERACION], [Q_CLUBS_AJEDREZ]) VALUES (N'P1', N'ALEMANIA', N'FEDERACION NACIONAL DE AJEDREZ DE ALEMANIA', 4)
INSERT [dbo].[pais] ([C_PAIS], [N_PAIS], [N_FEDERACION], [Q_CLUBS_AJEDREZ]) VALUES (N'P2', N'PERU', N'FEDERACION NACIONAL DE AJEDREZ DEL PERU', 4)
INSERT [dbo].[pais] ([C_PAIS], [N_PAIS], [N_FEDERACION], [Q_CLUBS_AJEDREZ]) VALUES (N'P3', N'MEXICO', N'FEDERACION NACIONAL DE AJEDREZ DE MEXICO', 5)
INSERT [dbo].[pais] ([C_PAIS], [N_PAIS], [N_FEDERACION], [Q_CLUBS_AJEDREZ]) VALUES (N'P4', N'ARGENTINA', N'EDERACION NACIONAL DE AJEDREZ DE ARGENTINA', 3)
INSERT [dbo].[participante] ([C_ASOCIADO], [C_PAIS], [N_NOMBRE], [T_DIRECCION], [D_FECHA_NAC]) VALUES (N'A01', N'P1', N'JULIO CETELLO', N'AV.PERSHING 2834', CAST(N'1984-04-15' AS Date))
INSERT [dbo].[participante] ([C_ASOCIADO], [C_PAIS], [N_NOMBRE], [T_DIRECCION], [D_FECHA_NAC]) VALUES (N'A02', N'P1', N'MARIA SILVA', N'AV.ANYESTER 2214', CAST(N'1988-05-12' AS Date))
INSERT [dbo].[participante] ([C_ASOCIADO], [C_PAIS], [N_NOMBRE], [T_DIRECCION], [D_FECHA_NAC]) VALUES (N'A03', N'P2', N'LUISA ALCANTARA', N'AV.LA MOLINA 2040', CAST(N'1986-07-12' AS Date))
INSERT [dbo].[participante] ([C_ASOCIADO], [C_PAIS], [N_NOMBRE], [T_DIRECCION], [D_FECHA_NAC]) VALUES (N'A04', N'P2', N'DONATELO PEDELO', N'AV.BEGONIAS 4114', CAST(N'1987-04-25' AS Date))
INSERT [dbo].[participante] ([C_ASOCIADO], [C_PAIS], [N_NOMBRE], [T_DIRECCION], [D_FECHA_NAC]) VALUES (N'A05', N'P3', N'FRANCIS DOMINGUEZ', N'AV.COLONIAL 3514', CAST(N'1984-10-15' AS Date))
INSERT [dbo].[participante] ([C_ASOCIADO], [C_PAIS], [N_NOMBRE], [T_DIRECCION], [D_FECHA_NAC]) VALUES (N'A06', N'P3', N'JULIAN LEGASPY', N'AV.CRISANTEMO 2334', CAST(N'1990-12-25' AS Date))
INSERT [dbo].[participante] ([C_ASOCIADO], [C_PAIS], [N_NOMBRE], [T_DIRECCION], [D_FECHA_NAC]) VALUES (N'A07', N'P4', N'SUSAN BACA', N'AV.CHEGUEVARA 2144', CAST(N'1985-05-10' AS Date))
INSERT [dbo].[participante] ([C_ASOCIADO], [C_PAIS], [N_NOMBRE], [T_DIRECCION], [D_FECHA_NAC]) VALUES (N'A08', N'P4', N'LULA TEVEZ', N'AV.JAZMIN 1540', CAST(N'1987-04-27' AS Date))
INSERT [dbo].[participante] ([C_ASOCIADO], [C_PAIS], [N_NOMBRE], [T_DIRECCION], [D_FECHA_NAC]) VALUES (N'A09', N'P1', N'TOROMEO VALDEZ', N'AV.RUISEÑORES 1340', CAST(N'1980-04-27' AS Date))
INSERT [dbo].[participante] ([C_ASOCIADO], [C_PAIS], [N_NOMBRE], [T_DIRECCION], [D_FECHA_NAC]) VALUES (N'A10', N'P2', N'GILBERT MENDEZ', N'AV.JAZMIN 2440', CAST(N'1979-04-27' AS Date))
INSERT [dbo].[participante_hotel] ([C_ASOCIADO], [C_HOTEL], [D_INICIO], [D_FIN]) VALUES (N'A01', N'H03', CAST(N'2017-03-05' AS Date), CAST(N'2017-03-09' AS Date))
INSERT [dbo].[participante_hotel] ([C_ASOCIADO], [C_HOTEL], [D_INICIO], [D_FIN]) VALUES (N'A02', N'H03', CAST(N'2017-03-05' AS Date), CAST(N'2017-03-09' AS Date))
INSERT [dbo].[participante_hotel] ([C_ASOCIADO], [C_HOTEL], [D_INICIO], [D_FIN]) VALUES (N'A03', N'H01', CAST(N'2017-04-15' AS Date), CAST(N'2017-04-23' AS Date))
INSERT [dbo].[participante_hotel] ([C_ASOCIADO], [C_HOTEL], [D_INICIO], [D_FIN]) VALUES (N'A04', N'H01', CAST(N'2017-04-15' AS Date), CAST(N'2017-04-23' AS Date))
INSERT [dbo].[participante_hotel] ([C_ASOCIADO], [C_HOTEL], [D_INICIO], [D_FIN]) VALUES (N'A05', N'H03', CAST(N'2017-03-05' AS Date), CAST(N'2017-03-09' AS Date))
INSERT [dbo].[participante_hotel] ([C_ASOCIADO], [C_HOTEL], [D_INICIO], [D_FIN]) VALUES (N'A06', N'H03', CAST(N'2017-03-05' AS Date), CAST(N'2017-03-09' AS Date))
INSERT [dbo].[participante_hotel] ([C_ASOCIADO], [C_HOTEL], [D_INICIO], [D_FIN]) VALUES (N'A07', N'H01', CAST(N'2017-04-15' AS Date), CAST(N'2017-04-23' AS Date))
INSERT [dbo].[participante_hotel] ([C_ASOCIADO], [C_HOTEL], [D_INICIO], [D_FIN]) VALUES (N'A08', N'H01', CAST(N'2017-04-15' AS Date), CAST(N'2017-04-23' AS Date))
INSERT [dbo].[participante_hotel] ([C_ASOCIADO], [C_HOTEL], [D_INICIO], [D_FIN]) VALUES (N'A09', N'H04', CAST(N'2017-04-15' AS Date), CAST(N'2017-04-23' AS Date))
INSERT [dbo].[participante_hotel] ([C_ASOCIADO], [C_HOTEL], [D_INICIO], [D_FIN]) VALUES (N'A10', N'H02', CAST(N'2017-03-15' AS Date), CAST(N'2017-03-09' AS Date))
INSERT [dbo].[partida] ([NRO_PARTIDA], [C_HOTEL], [N_SALA], [C_ARBITRO], [C_JUGADOR2], [C_JORNADA], [C_JUGADOR1], [N_COLOR_J1], [N_COLOR_J2], [Q_ENTRADAS]) VALUES (N'001', N'H04', N'SALA3', N'A09', N'A01', N'J05', N'A06', N'NEGRO', N'ROJO', 2)
INSERT [dbo].[partida] ([NRO_PARTIDA], [C_HOTEL], [N_SALA], [C_ARBITRO], [C_JUGADOR2], [C_JORNADA], [C_JUGADOR1], [N_COLOR_J1], [N_COLOR_J2], [Q_ENTRADAS]) VALUES (N'002', N'H04', N'SALA2', N'A09', N'A02', N'J06', N'A05', N'NEGRO', N'ROJO', 2)
INSERT [dbo].[partida] ([NRO_PARTIDA], [C_HOTEL], [N_SALA], [C_ARBITRO], [C_JUGADOR2], [C_JORNADA], [C_JUGADOR1], [N_COLOR_J1], [N_COLOR_J2], [Q_ENTRADAS]) VALUES (N'003', N'H02', N'SALA3', N'A10', N'A03', N'J02', N'A07', N'BLANCO', N'AZUL', 2)
INSERT [dbo].[partida] ([NRO_PARTIDA], [C_HOTEL], [N_SALA], [C_ARBITRO], [C_JUGADOR2], [C_JORNADA], [C_JUGADOR1], [N_COLOR_J1], [N_COLOR_J2], [Q_ENTRADAS]) VALUES (N'004', N'H02', N'SALA3', N'A10', N'A04', N'J04', N'A08', N'BLANCO', N'AZUL', 2)
INSERT [dbo].[sala] ([C_HOTEL], [N_SALA], [Q_CAPACIDAD]) VALUES (N'H02', N'SALA1', 40)
INSERT [dbo].[sala] ([C_HOTEL], [N_SALA], [Q_CAPACIDAD]) VALUES (N'H02', N'SALA2', 30)
INSERT [dbo].[sala] ([C_HOTEL], [N_SALA], [Q_CAPACIDAD]) VALUES (N'H02', N'SALA3', 25)
INSERT [dbo].[sala] ([C_HOTEL], [N_SALA], [Q_CAPACIDAD]) VALUES (N'H02', N'SALA4', 15)
INSERT [dbo].[sala] ([C_HOTEL], [N_SALA], [Q_CAPACIDAD]) VALUES (N'H04', N'SALA1', 40)
INSERT [dbo].[sala] ([C_HOTEL], [N_SALA], [Q_CAPACIDAD]) VALUES (N'H04', N'SALA2', 30)
INSERT [dbo].[sala] ([C_HOTEL], [N_SALA], [Q_CAPACIDAD]) VALUES (N'H04', N'SALA3', 20)
INSERT [dbo].[sala_medio_comunicacion] ([C_HOTEL], [N_SALA], [C_MEDIO]) VALUES (N'H02', N'SALA1', N'M01')
INSERT [dbo].[sala_medio_comunicacion] ([C_HOTEL], [N_SALA], [C_MEDIO]) VALUES (N'H02', N'SALA1', N'M02')
INSERT [dbo].[sala_medio_comunicacion] ([C_HOTEL], [N_SALA], [C_MEDIO]) VALUES (N'H02', N'SALA1', N'M03')
INSERT [dbo].[sala_medio_comunicacion] ([C_HOTEL], [N_SALA], [C_MEDIO]) VALUES (N'H02', N'SALA2', N'M02')
INSERT [dbo].[sala_medio_comunicacion] ([C_HOTEL], [N_SALA], [C_MEDIO]) VALUES (N'H02', N'SALA3', N'M01')
INSERT [dbo].[sala_medio_comunicacion] ([C_HOTEL], [N_SALA], [C_MEDIO]) VALUES (N'H02', N'SALA3', N'M03')
INSERT [dbo].[sala_medio_comunicacion] ([C_HOTEL], [N_SALA], [C_MEDIO]) VALUES (N'H02', N'SALA4', N'M02')
INSERT [dbo].[sala_medio_comunicacion] ([C_HOTEL], [N_SALA], [C_MEDIO]) VALUES (N'H02', N'SALA4', N'M03')
INSERT [dbo].[sala_medio_comunicacion] ([C_HOTEL], [N_SALA], [C_MEDIO]) VALUES (N'H04', N'SALA1', N'M01')
INSERT [dbo].[sala_medio_comunicacion] ([C_HOTEL], [N_SALA], [C_MEDIO]) VALUES (N'H04', N'SALA1', N'M02')
INSERT [dbo].[sala_medio_comunicacion] ([C_HOTEL], [N_SALA], [C_MEDIO]) VALUES (N'H04', N'SALA2', N'M01')
INSERT [dbo].[sala_medio_comunicacion] ([C_HOTEL], [N_SALA], [C_MEDIO]) VALUES (N'H04', N'SALA2', N'M02')
INSERT [dbo].[sala_medio_comunicacion] ([C_HOTEL], [N_SALA], [C_MEDIO]) VALUES (N'H04', N'SALA2', N'M03')
INSERT [dbo].[sala_medio_comunicacion] ([C_HOTEL], [N_SALA], [C_MEDIO]) VALUES (N'H04', N'SALA3', N'M01')
INSERT [dbo].[sala_medio_comunicacion] ([C_HOTEL], [N_SALA], [C_MEDIO]) VALUES (N'H04', N'SALA3', N'M03')
ALTER TABLE [dbo].[arbitro]  WITH CHECK ADD  CONSTRAINT [arbitro_ibfk_1] FOREIGN KEY([C_ARBITRO])
REFERENCES [dbo].[participante] ([C_ASOCIADO])
GO
ALTER TABLE [dbo].[arbitro] CHECK CONSTRAINT [arbitro_ibfk_1]
GO
ALTER TABLE [dbo].[jugador]  WITH CHECK ADD  CONSTRAINT [jugador_ibfk_1] FOREIGN KEY([C_JUGADOR])
REFERENCES [dbo].[participante] ([C_ASOCIADO])
GO
ALTER TABLE [dbo].[jugador] CHECK CONSTRAINT [jugador_ibfk_1]
GO
ALTER TABLE [dbo].[participante]  WITH CHECK ADD  CONSTRAINT [participante_ibfk_1] FOREIGN KEY([C_PAIS])
REFERENCES [dbo].[pais] ([C_PAIS])
GO
ALTER TABLE [dbo].[participante] CHECK CONSTRAINT [participante_ibfk_1]
GO
ALTER TABLE [dbo].[participante_hotel]  WITH CHECK ADD  CONSTRAINT [participante_hotel_ibfk_1] FOREIGN KEY([C_ASOCIADO])
REFERENCES [dbo].[participante] ([C_ASOCIADO])
GO
ALTER TABLE [dbo].[participante_hotel] CHECK CONSTRAINT [participante_hotel_ibfk_1]
GO
ALTER TABLE [dbo].[participante_hotel]  WITH CHECK ADD  CONSTRAINT [participante_hotel_ibfk_2] FOREIGN KEY([C_HOTEL])
REFERENCES [dbo].[hotel] ([C_HOTEL])
GO
ALTER TABLE [dbo].[participante_hotel] CHECK CONSTRAINT [participante_hotel_ibfk_2]
GO
ALTER TABLE [dbo].[partida]  WITH CHECK ADD  CONSTRAINT [partida_ibfk_2] FOREIGN KEY([C_ARBITRO])
REFERENCES [dbo].[arbitro] ([C_ARBITRO])
GO
ALTER TABLE [dbo].[partida] CHECK CONSTRAINT [partida_ibfk_2]
GO
ALTER TABLE [dbo].[partida]  WITH CHECK ADD  CONSTRAINT [partida_ibfk_3] FOREIGN KEY([C_JUGADOR2])
REFERENCES [dbo].[jugador] ([C_JUGADOR])
GO
ALTER TABLE [dbo].[partida] CHECK CONSTRAINT [partida_ibfk_3]
GO
ALTER TABLE [dbo].[partida]  WITH CHECK ADD  CONSTRAINT [partida_ibfk_4] FOREIGN KEY([C_JORNADA])
REFERENCES [dbo].[jornada] ([C_JORNADA])
GO
ALTER TABLE [dbo].[partida] CHECK CONSTRAINT [partida_ibfk_4]
GO
ALTER TABLE [dbo].[partida]  WITH CHECK ADD  CONSTRAINT [partida_ibfk_5] FOREIGN KEY([C_JUGADOR1])
REFERENCES [dbo].[jugador] ([C_JUGADOR])
GO
ALTER TABLE [dbo].[partida] CHECK CONSTRAINT [partida_ibfk_5]
GO
ALTER TABLE [dbo].[partida]  WITH CHECK ADD  CONSTRAINT [partida_ibfk_9] FOREIGN KEY([C_HOTEL], [N_SALA])
REFERENCES [dbo].[sala] ([C_HOTEL], [N_SALA])
GO
ALTER TABLE [dbo].[partida] CHECK CONSTRAINT [partida_ibfk_9]
GO
ALTER TABLE [dbo].[sala]  WITH CHECK ADD  CONSTRAINT [sala_ibfk_1] FOREIGN KEY([C_HOTEL])
REFERENCES [dbo].[hotel] ([C_HOTEL])
GO
ALTER TABLE [dbo].[sala] CHECK CONSTRAINT [sala_ibfk_1]
GO
ALTER TABLE [dbo].[sala_medio_comunicacion]  WITH CHECK ADD  CONSTRAINT [sala_medio_comunicacion_ibfk_1] FOREIGN KEY([C_MEDIO])
REFERENCES [dbo].[medio_comunicacion] ([C_MEDIO])
GO
ALTER TABLE [dbo].[sala_medio_comunicacion] CHECK CONSTRAINT [sala_medio_comunicacion_ibfk_1]
GO
ALTER TABLE [dbo].[sala_medio_comunicacion]  WITH CHECK ADD  CONSTRAINT [sala_medio_comunicacion_ibfk_3] FOREIGN KEY([C_HOTEL], [N_SALA])
REFERENCES [dbo].[sala] ([C_HOTEL], [N_SALA])
GO
ALTER TABLE [dbo].[sala_medio_comunicacion] CHECK CONSTRAINT [sala_medio_comunicacion_ibfk_3]
GO
USE [master]
GO
ALTER DATABASE [ajedrez] SET  READ_WRITE 
GO
