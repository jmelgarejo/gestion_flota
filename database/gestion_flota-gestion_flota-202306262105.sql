-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: gestion_flota
-- ------------------------------------------------------
-- Server version	5.5.5-10.3.39-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `asignar_administrativos`
--

DROP TABLE IF EXISTS `asignar_administrativos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `asignar_administrativos` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `apellido` varchar(255) DEFAULT NULL,
  `create_at` date DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `patente` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asignar_administrativos`
--

LOCK TABLES `asignar_administrativos` WRITE;
/*!40000 ALTER TABLE `asignar_administrativos` DISABLE KEYS */;
INSERT INTO `asignar_administrativos` VALUES (1,'Guzman','2023-01-01','Asignado','Andres','VKCG-45'),(2,'Vasquez','2023-01-01','Asignado','Eddie','AMDS-12');
/*!40000 ALTER TABLE `asignar_administrativos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `camion`
--

DROP TABLE IF EXISTS `camion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `camion` (
  `id_camion` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `vehiculo_id` int(11) DEFAULT NULL,
  `capacidad` float(9,2) DEFAULT NULL,
  `tipo` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id_camion`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `camion`
--

LOCK TABLES `camion` WRITE;
/*!40000 ALTER TABLE `camion` DISABLE KEYS */;
INSERT INTO `camion` VALUES (1,2,5236.20,'remolque'),(2,3,4455.98,'remolque'),(3,4,3465.47,'remolque'),(4,5,7066.26,'cisterna'),(5,6,9383.79,'frigorífico'),(6,7,2040.17,'frigorífico'),(7,8,8988.19,'remolque'),(8,9,9323.06,'cisterna'),(9,10,6910.10,'remolque'),(11,1,9159.32,'cisterna');
/*!40000 ALTER TABLE `camion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `carga`
--

DROP TABLE IF EXISTS `carga`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carga` (
  `id_carga` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `solicitud_id` int(11) DEFAULT NULL,
  `tipo` varchar(50) DEFAULT NULL,
  `peso` float(11,2) DEFAULT NULL,
  `dimension` varchar(100) DEFAULT NULL,
  `detalle` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id_carga`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carga`
--

LOCK TABLES `carga` WRITE;
/*!40000 ALTER TABLE `carga` DISABLE KEYS */;
/*!40000 ALTER TABLE `carga` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `id_cliente` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `persona_id` int(11) DEFAULT NULL,
  `razon_social` varchar(100) DEFAULT NULL,
  `direccion_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,4,'Empresa A',1),(2,5,'Empresa B',2),(3,6,'Empresa C',3),(4,7,'Empresa D',4),(5,8,'Empresa E',5),(6,9,'Empresa F',6),(7,10,'Empresa G',7),(8,11,'Empresa H',8),(9,12,'Empresa I',9),(10,13,'Empresa J',10),(11,4,'Empresa A',1),(12,5,'Empresa B',2),(13,6,'Empresa C',3),(14,7,'Empresa D',4),(15,8,'Empresa E',5),(16,9,'Empresa F',6),(17,10,'Empresa G',7),(18,11,'Empresa H',8),(19,12,'Empresa I',9),(20,13,'Empresa J',10);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comuna`
--

DROP TABLE IF EXISTS `comuna`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comuna` (
  `id_comuna` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nombre_comuna` varchar(100) DEFAULT NULL,
  `provincia_id` int(10) DEFAULT NULL,
  `region_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`id_comuna`)
) ENGINE=InnoDB AUTO_INCREMENT=16306 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comuna`
--

LOCK TABLES `comuna` WRITE;
/*!40000 ALTER TABLE `comuna` DISABLE KEYS */;
INSERT INTO `comuna` VALUES (1101,'IQUIQUE',11,1),(1102,'CAMINA',11,1),(1103,'COLCHANE',11,1),(1104,'HUARA',11,1),(1105,'PICA',11,1),(1106,'POZO ALMONTE',11,1),(1107,'ALTO HOSPICIO',11,1),(1201,'ARICA',12,1),(1202,'CAMARONES',12,1),(1301,'PUTRE',13,1),(1302,'GENERAL LAGOS',13,1),(1401,'POZO ALMONTE',14,1),(1402,'CAMINA',14,1),(1403,'COLCHANE',14,1),(1404,'HUARA',14,1),(1405,'PICA',14,1),(2101,'ANTOFAGASTA',21,2),(5801,'QUILPUE',58,5),(5802,'LIMACHE',58,5),(5803,'OLMUE',58,5),(5804,'VILLA ALEMANA',58,5),(8112,'HUALPEN',81,8),(8314,'ALTO BIO BIO',83,8),(9108,'LAUTARO',91,9),(9109,'LONCOCHE',91,9),(9110,'MELIPEUCO',91,9),(9111,'NUEVA IMPERIAL',91,9),(9112,'PADRE LAS CASAS',91,9),(9113,'PERQUENCO',91,9),(9114,'PITRUFQUEN',91,9),(9115,'PUCON',91,9),(9116,'SAAVEDRA',91,9),(9117,'TEODORO SCHMIDT',91,9),(9118,'TOLTEN',91,9),(9119,'VILCUN',91,9),(9120,'VILLARRICA',91,9),(9121,'CHOLCHOL',91,9),(9201,'ANGOL',92,9),(9202,'COLLIPULLI',92,9),(9203,'CURACAUTIN',92,9),(9204,'ERCILLA',92,9),(9205,'LONQUIMAY',92,9),(9206,'LOS SAUCES',92,9),(9207,'LUMACO',92,9),(9208,'PUREN',92,9),(9209,'RENAICO',92,9),(9210,'TRAIGUEN',92,9),(9211,'VICTORIA',92,9),(10101,'PUERTO MONTT',101,10),(10102,'CALBUCO',101,10),(10103,'COCHAMO',101,10),(10104,'FRESIA',101,10),(10105,'FRUTILLAR',101,10),(10106,'LOS MUERMOS',101,10),(10107,'LLANQUIHUE',101,10),(10108,'MAULLIN',101,10),(10109,'PUERTO VARAS',101,10),(10201,'CASTRO',102,10),(10202,'ANCUD',102,10),(10203,'CHONCHI',102,10),(10204,'CURACO DE VELEZ',102,10),(10205,'DALCAHUE',102,10),(10206,'PUQUELDON',102,10),(10207,'QUEILEN',102,10),(10208,'QUELLON',102,10),(10209,'QUEMCHI',102,10),(10210,'QUINCHAO',102,10),(10301,'OSORNO',103,10),(10302,'PUERTO OCTAY',103,10),(10303,'PURRANQUE',103,10),(10304,'PUYEHUE',103,10),(10305,'RIO NEGRO',103,10),(10306,'SAN JUAN DE LA COSTA',103,10),(10307,'SAN PABLO',103,10),(10401,'CHAITEN',104,10),(10402,'FUTALEUFU',104,10),(10403,'HUALAIHUE',104,10),(10404,'PALENA',104,10),(10501,'VALDIVIA',105,10),(10502,'CORRAL',105,10),(10503,'FUTRONO',105,10),(10504,'LA UNION',105,10),(10505,'LAGO RANCO',105,10),(10506,'LANCO',105,10),(10507,'LOS LAGOS',105,10),(10508,'MAFIL',105,10),(10509,'MARIQUINA',105,10),(10510,'PAILLACO',105,10),(10511,'PANGUIPULLI',105,10),(10512,'RIO BUENO',105,10),(11101,'COYHAIQUE',111,11),(11102,'LAGO VERDE',111,11),(11201,'AYSEN',112,11),(11202,'CISNES',112,11),(11203,'GUAITECAS',112,11),(11301,'COCHRANE',113,11),(11302,'O HIGGINS',113,11),(11303,'TORTEL',113,11),(11401,'CHILE CHICO',114,11),(11402,'RIO IBANEZ',114,11),(12101,'PUNTA ARENAS',121,12),(12102,'LAGUNA BLANCA',121,12),(12103,'RIO VERDE',121,12),(12104,'SAN GREGORIO',121,12),(12201,'CABO DE HORNOS',122,12),(12202,'ANTARTICA',122,12),(12301,'PORVENIR',123,12),(12302,'PRIMAVERA',123,12),(12303,'TIMAUKEL',123,12),(12401,'NATALES',124,12),(12402,'TORRES DEL PAINE',124,12),(13101,'SANTIAGO',131,13),(13102,'CERRILLOS',131,13),(13103,'CERRO NAVIA',131,13),(13104,'CONCHALI',131,13),(13105,'EL BOSQUE',131,13),(13106,'ESTACION CENTRAL',131,13),(13107,'HUECHURABA',131,13),(13108,'INDEPENDENCIA',131,13),(13109,'LA CISTERNA',131,13),(13110,'LA FLORIDA',131,13),(13111,'LA GRANJA',131,13),(13112,'LA PINTANA',131,13),(13113,'LA REINA',131,13),(13114,'LAS CONDES',131,13),(13115,'LO BARNECHEA',131,13),(13116,'LO ESPEJO',131,13),(13117,'LO PRADO',131,13),(13118,'MACUL',131,13),(13119,'MAIPU',131,13),(13120,'NUNOA',131,13),(13121,'PEDRO AGUIRRE CERDA',131,13),(13122,'PENALOLEN',131,13),(13123,'PROVIDENCIA',131,13),(13124,'PUDAHUEL',131,13),(13125,'QUILICURA',131,13),(13126,'QUINTA NORMAL',131,13),(13127,'RECOLETA',131,13),(13128,'RENCA',131,13),(13129,'SAN JOAQUIN',131,13),(13130,'SAN MIGUEL',131,13),(13131,'SAN RAMON',131,13),(13132,'VITACURA',131,13),(13201,'PUENTE ALTO',132,13),(13202,'PIRQUE',132,13),(13203,'SAN JOSE DE MAIPO',132,13),(13301,'COLINA',133,13),(13302,'LAMPA',133,13),(13303,'TILTIL',133,13),(13401,'SAN BERNARDO',134,13),(13402,'BUIN',134,13),(13403,'CALERA DE TANGO',134,13),(13404,'PAINE',134,13),(13501,'MELIPILLA',135,13),(13502,'ALHUE',135,13),(13503,'CURACAVI',135,13),(13504,'MARIA PINTO',135,13),(13505,'SAN PEDRO',135,13),(13601,'TALAGANTE',136,13),(13602,'EL MONTE',136,13),(13603,'ISLA DE MAIPO',136,13),(13604,'PADRE HURTADO',136,13),(13605,'PENAFLOR',136,13),(14101,'VALDIVIA',141,14),(14102,'CORRAL',141,14),(14103,'LANCO',141,14),(14104,'LOS LAGOS',141,14),(14105,'MAFIL',141,14),(14106,'MARIQUINA',141,14),(14107,'PAILLACO',141,14),(14108,'PANGUIPULLI',141,14),(14201,'LA UNION',142,14),(14202,'FUTRONO',142,14),(14203,'LAGO RANCO',142,14),(14204,'RIO BUENO',142,14),(15101,'ARICA',151,15),(15102,'CAMARONES',151,15),(15201,'PUTRE',152,15),(15202,'GENERAL LAGOS',152,15),(16101,'CHILLAN',161,16),(16102,'BULNES',161,16),(16103,'CHILLAN VIEJO',161,16),(16104,'EL CARMEN',161,16),(16105,'PEMUCO',161,16),(16106,'PINTO',161,16),(16107,'QUILLON',161,16),(16108,'SAN IGNACIO',161,16),(16109,'YUNGAY',161,16),(16201,'QUIRIHUE',162,16),(16202,'COBQUECURA',162,16),(16203,'COELEMU',162,16),(16204,'NINHUE',162,16),(16205,'PORTEZUELO',162,16),(16206,'RANQUIL',162,16),(16207,'TREGUACO',162,16),(16301,'SAN CARLOS',163,16),(16302,'COIHUECO',163,16),(16303,'NIQUEN',163,16),(16304,'SAN FABIAN',163,16),(16305,'SAN NICOLAS',163,16);
/*!40000 ALTER TABLE `comuna` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `conductor`
--

DROP TABLE IF EXISTS `conductor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `conductor` (
  `id_conductor` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `empleado_id` int(11) DEFAULT NULL,
  `tipo_licencia` varchar(500) NOT NULL,
  `numero_licencia` varchar(500) NOT NULL,
  `fecha_vencimiento` datetime NOT NULL,
  PRIMARY KEY (`id_conductor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conductor`
--

LOCK TABLES `conductor` WRITE;
/*!40000 ALTER TABLE `conductor` DISABLE KEYS */;
/*!40000 ALTER TABLE `conductor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `direccion`
--

DROP TABLE IF EXISTS `direccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `direccion` (
  `id_direccion` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `calle_numero` varchar(100) DEFAULT NULL,
  `adicional` varchar(100) DEFAULT NULL,
  `region_id` int(10) DEFAULT NULL,
  `provincia_id` int(10) DEFAULT NULL,
  `comuna_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`id_direccion`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `direccion`
--

LOCK TABLES `direccion` WRITE;
/*!40000 ALTER TABLE `direccion` DISABLE KEYS */;
INSERT INTO `direccion` VALUES (1,'Avenida Libertador Bernardo O\'Higgins 123','Piso 4',13,131,13101),(2,'Calle San Martín 456','Departamento 2B',5,51,51103),(3,'Avenida Los Conquistadores 789',NULL,8,81,81002),(4,'Calle 12 de Octubre 987','Oficina 10',6,61,61001),(5,'Avenida España 456','Piso 7',14,141,14101),(6,'Calle Nueva 321',NULL,3,31,31005),(7,'Avenida Central 789','Casa 15',7,71,71004),(8,'Calle Principal 654','Departamento 3C',12,121,12102),(9,'Avenida Sur 987',NULL,2,21,21003),(10,'Calle Norte 123','Oficina 5',10,101,10101),(11,'Avenida Libertador Bernardo O\'Higgins 123','Piso 4',13,131,13101),(12,'Calle San Martín 456','Departamento 2B',5,51,51103),(13,'Avenida Los Conquistadores 789',NULL,8,81,81002),(14,'Calle 12 de Octubre 987','Oficina 10',6,61,61001),(15,'Avenida España 456','Piso 7',14,141,14101),(16,'Calle Nueva 321',NULL,3,31,31005),(17,'Avenida Central 789','Casa 15',7,71,71004),(18,'Calle Principal 654','Departamento 3C',12,121,12102),(19,'Avenida Sur 987',NULL,2,21,21003),(20,'Calle Norte 123','Oficina 5',10,101,10101);
/*!40000 ALTER TABLE `direccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleado` (
  `id_empleado` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `persona_id` int(11) DEFAULT NULL,
  `tipo_empleado` varchar(50) DEFAULT NULL,
  `tipo_contrato` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_empleado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado`
--

LOCK TABLES `empleado` WRITE;
/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `id_login` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `usuario` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `perfil_id` int(11) DEFAULT NULL,
  `persona_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_login`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES (1,'admin@admin.cl','21232f297a57a5a743894a0e4a801fc3',1,1),(3,'admin@admin.cl','21232f297a57a5a743894a0e4a801fc3',1,1);
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `perfil`
--

DROP TABLE IF EXISTS `perfil`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `perfil` (
  `id_perfil` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_perfil` varchar(100) DEFAULT NULL,
  `descripcion_perfil` varchar(100) DEFAULT NULL,
  `codigo_perfil` varchar(100) DEFAULT NULL,
  `estado` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_perfil`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perfil`
--

LOCK TABLES `perfil` WRITE;
/*!40000 ALTER TABLE `perfil` DISABLE KEYS */;
INSERT INTO `perfil` VALUES (1,'admin','admin','admin','activo'),(2,'admin','admin','admin','activo'),(3,'admin','admin','admin','activo');
/*!40000 ALTER TABLE `perfil` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `persona` (
  `id_persona` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `run` int(10) DEFAULT NULL,
  `dv` varchar(1) DEFAULT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `primer_apellido` varchar(100) DEFAULT NULL,
  `segundo_apellido` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_persona`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` VALUES (1,1,'9','admin','admin','admin'),(4,18768234,'5','Juan','Pérez','González'),(5,11485327,'4','María','López','García'),(6,15894679,'2','Pedro','Rodríguez','Hernández'),(7,18672391,'0','Carolina','González','Ramírez'),(8,14986735,'9','Alejandro','Torres','Fuentes'),(9,13127466,'1','Camila','Mendoza','Soto'),(10,17354982,'6','Patricia','Silva','Vargas'),(11,19236718,'3','Ricardo','Gómez','Fernández'),(12,17548362,'7','Laura','Muñoz','Pérez'),(13,13297548,'8','Gabriel','Cordero','Vega'),(14,1,'9','admin','admin','admin'),(15,18768234,'5','Juan','Pérez','González'),(16,11485327,'4','María','López','García'),(17,15894679,'2','Pedro','Rodríguez','Hernández'),(18,18672391,'0','Carolina','González','Ramírez'),(19,14986735,'9','Alejandro','Torres','Fuentes'),(20,13127466,'1','Camila','Mendoza','Soto'),(21,17354982,'6','Patricia','Silva','Vargas'),(22,19236718,'3','Ricardo','Gómez','Fernández'),(23,17548362,'7','Laura','Muñoz','Pérez'),(24,13297548,'8','Gabriel','Cordero','Vega');
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `planificacion`
--

DROP TABLE IF EXISTS `planificacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `planificacion` (
  `id_planificacion` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `conductor_id` int(11) DEFAULT NULL,
  `camion_id` int(11) DEFAULT NULL,
  `fecha_creacion` datetime DEFAULT NULL,
  `fecha_planificacion` datetime DEFAULT NULL,
  `hora_salida` time DEFAULT NULL,
  `hora_retorno` time DEFAULT NULL,
  `estado` varchar(50) DEFAULT NULL,
  `origen` varchar(100) DEFAULT NULL,
  `destino` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_planificacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `planificacion`
--

LOCK TABLES `planificacion` WRITE;
/*!40000 ALTER TABLE `planificacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `planificacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `provincia`
--

DROP TABLE IF EXISTS `provincia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `provincia` (
  `id_provincia` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nombre_provincia` varchar(100) DEFAULT NULL,
  `region_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`id_provincia`)
) ENGINE=InnoDB AUTO_INCREMENT=164 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `provincia`
--

LOCK TABLES `provincia` WRITE;
/*!40000 ALTER TABLE `provincia` DISABLE KEYS */;
INSERT INTO `provincia` VALUES (11,'IQUIQUE',1),(12,'ARICA',1),(13,'PARINACOTA',1),(14,'TAMARUGAL',1),(21,'ANTOFAGASTA',2),(22,'EL LOA',2),(23,'TOCOPILLA',2),(31,'COPIAPO',3),(32,'CHANARAL',3),(33,'HUASCO',3),(41,'ELQUI',4),(42,'CHOAPA',4),(43,'LIMARI',4),(51,'VALPARAISO',5),(52,'ISLA DE PASCUA',5),(53,'LOS ANDES',5),(54,'PETORCA',5),(55,'QUILLOTA',5),(56,'SAN ANTONIO',5),(57,'SAN FELIPE',5),(58,'MARGA MARGA ',5),(61,'CACHAPOAL',6),(62,'CARDENAL CARO',6),(63,'COLCHAGUA',6),(71,'TALCA',7),(72,'CAUQUENES',7),(73,'CURICO',7),(74,'LINARES',7),(81,'CONCEPCION',8),(82,'ARAUCO',8),(83,'BIOBIO',8),(84,'NUBLE',8),(91,'CAUTIN',9),(92,'MALLECO',9),(101,'LLANQUIHUE',10),(102,'CHILOE',10),(103,'OSORNO',10),(104,'PALENA',10),(105,'VALDIVIA',10),(111,'COYHAIQUE',11),(112,'AYSEN',11),(113,'CAPITAN PRAT',11),(114,'GENERAL CARRERA',11),(121,'MAGALLANES',12),(122,'ANTARTICA CHILENA',12),(123,'TIERRA DEL FUEGO',12),(124,'ULTIMA ESPERANZA',12),(131,'SANTIAGO',13),(132,'CORDILLERA',13),(133,'CHACABUCO',13),(134,'MAIPO',13),(135,'MELIPILLA',13),(136,'TALAGANTE',13),(141,'VALDIVIA',14),(142,'RANCO',14),(151,'ARICA',15),(152,'PARINACOTA',15),(161,'DIGUILLIN',16),(162,'ITATA',16),(163,'PUNILLA',16);
/*!40000 ALTER TABLE `provincia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `region`
--

DROP TABLE IF EXISTS `region`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `region` (
  `id_region` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nombre_region` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_region`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `region`
--

LOCK TABLES `region` WRITE;
/*!40000 ALTER TABLE `region` DISABLE KEYS */;
INSERT INTO `region` VALUES (1,'REGION DE TARAPACA'),(2,'REGION DE ANTOFAGASTA'),(3,'REGION DE ATACAMA'),(4,'REGION DE COQUIMBO'),(5,'REGION DE VALPARAISO'),(6,'REGION DEL LIB. GRAL. BERNARDO O HIGGINS'),(7,'REGION DEL MAULE'),(8,'REGION DEL BIOBIO'),(9,'REGION DE DE LA ARAUCANIA'),(10,'REGION DE LOS LAGOS'),(11,'REGION DE AYSEN DEL GRAL. CARLOS IBANEZ'),(12,'REGION DE MAGALLANES Y LA ANTARTICA'),(13,'REGION METROPOLITANA DE SANTIAGO'),(14,'REGION DE LOS RIOS'),(15,'REGION DE ARICA Y PARINACOTA'),(16,'REGION DE NUBLE');
/*!40000 ALTER TABLE `region` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registrar_salidas`
--

DROP TABLE IF EXISTS `registrar_salidas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `registrar_salidas` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_at` date DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `patente` varchar(255) DEFAULT NULL,
  `salida` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registrar_salidas`
--

LOCK TABLES `registrar_salidas` WRITE;
/*!40000 ALTER TABLE `registrar_salidas` DISABLE KEYS */;
INSERT INTO `registrar_salidas` VALUES (1,'2023-01-01','normal','VKCG-45','si'),(2,'1900-01-01','normal','AMDS-13','no');
/*!40000 ALTER TABLE `registrar_salidas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `solicitud`
--

DROP TABLE IF EXISTS `solicitud`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `solicitud` (
  `id_solicitud` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cliente_id` int(11) DEFAULT NULL,
  `planificacion_id` int(11) DEFAULT NULL,
  `estado` varchar(50) DEFAULT NULL,
  `origen` varchar(100) DEFAULT NULL,
  `destino` varchar(100) DEFAULT NULL,
  `fecha_solicitud` datetime DEFAULT NULL,
  `fecha_entrega` datetime DEFAULT NULL,
  PRIMARY KEY (`id_solicitud`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `solicitud`
--

LOCK TABLES `solicitud` WRITE;
/*!40000 ALTER TABLE `solicitud` DISABLE KEYS */;
INSERT INTO `solicitud` VALUES (1,1,1,'Pendiente','Santiago','Valparaíso','2023-05-30 10:00:00','2023-06-01 14:00:00'),(2,2,1,'Completado','Concepción','Temuco','2023-05-29 15:30:00','2023-05-31 09:45:00'),(3,3,2,'Pendiente','Antofagasta','Calama','2023-05-28 18:45:00','2023-06-02 11:30:00'),(4,4,2,'Completado','Valdivia','Puerto Montt','2023-05-27 12:15:00','2023-05-30 16:20:00'),(5,1,3,'Cancelado','La Serena','Coquimbo','2023-05-26 09:30:00',NULL),(6,3,3,'Pendiente','Rancagua','Curicó','2023-05-25 17:00:00','2023-05-28 10:10:00'),(7,2,4,'Completado','Iquique','Arica','2023-05-24 13:45:00','2023-05-26 19:30:00'),(8,4,4,'Completado','Punta Arenas','Puerto Natales','2023-05-23 10:20:00','2023-05-25 14:45:00'),(9,1,5,'Pendiente','Valdivia','Osorno','2023-05-22 16:30:00','2023-05-26 09:00:00'),(10,3,5,'Pendiente','Antofagasta','Iquique','2023-05-21 11:55:00','2023-05-24 13:15:00');
/*!40000 ALTER TABLE `solicitud` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehiculo`
--

DROP TABLE IF EXISTS `vehiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehiculo` (
  `id_vehiculo` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `patente` varchar(10) DEFAULT NULL,
  `numero_motor` varchar(30) DEFAULT NULL,
  `fecha_revision_tecnica` datetime DEFAULT NULL,
  `marca` varchar(30) DEFAULT NULL,
  `anio` int(4) DEFAULT NULL,
  `modelo` varchar(50) DEFAULT NULL,
  `concesionario` varchar(100) DEFAULT NULL,
  `aseguradora` varchar(100) DEFAULT NULL,
  `poliza` varchar(30) DEFAULT NULL,
  `fecha_poliza` datetime DEFAULT NULL,
  `fecha_ingreso` datetime DEFAULT NULL,
  `fecha_baja` datetime DEFAULT NULL,
  `tipo` varchar(10) DEFAULT NULL,
  `estado` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_vehiculo`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehiculo`
--

LOCK TABLES `vehiculo` WRITE;
/*!40000 ALTER TABLE `vehiculo` DISABLE KEYS */;
INSERT INTO `vehiculo` VALUES (1,'ABC-12340','12345678900','2023-01-01 00:00:00','Marca0',2011,'Modelo0','Concesionario0','Aseguradora0','Poliza0','2023-01-01 00:00:00','2023-01-01 00:00:00',NULL,'Camion','Activo'),(2,'ABC-12341','12345678901','2023-01-02 00:00:00','Marca1',2023,'Modelo1','Concesionario1','Aseguradora1','Poliza1','2023-01-02 00:00:00','2023-01-02 00:00:00',NULL,'Camion','Activo'),(3,'ABC-12342','12345678902','2023-01-03 00:00:00','Marca2',2006,'Modelo2','Concesionario2','Aseguradora2','Poliza2','2023-01-03 00:00:00','2023-01-03 00:00:00',NULL,'Camion','Activo'),(4,'ABC-12343','12345678903','2023-01-04 00:00:00','Marca3',2017,'Modelo3','Concesionario3','Aseguradora3','Poliza3','2023-01-04 00:00:00','2023-01-04 00:00:00',NULL,'Camion','Activo'),(5,'ABC-12344','12345678904','2023-01-05 00:00:00','Marca4',2007,'Modelo4','Concesionario4','Aseguradora4','Poliza4','2023-01-05 00:00:00','2023-01-05 00:00:00',NULL,'Camion','Activo'),(6,'ABC-12345','12345678905','2023-01-06 00:00:00','Marca5',2003,'Modelo5','Concesionario5','Aseguradora5','Poliza5','2023-01-06 00:00:00','2023-01-06 00:00:00',NULL,'Camion','Activo'),(7,'ABC-12346','12345678906','2023-01-07 00:00:00','Marca6',2012,'Modelo6','Concesionario6','Aseguradora6','Poliza6','2023-01-07 00:00:00','2023-01-07 00:00:00',NULL,'Camion','Activo'),(8,'ABC-12347','12345678907','2023-01-08 00:00:00','Marca7',2008,'Modelo7','Concesionario7','Aseguradora7','Poliza7','2023-01-08 00:00:00','2023-01-08 00:00:00',NULL,'Camion','Activo'),(9,'ABC-12348','12345678908','2023-01-09 00:00:00','Marca8',2018,'Modelo8','Concesionario8','Aseguradora8','Poliza8','2023-01-09 00:00:00','2023-01-09 00:00:00',NULL,'Camion','Activo'),(10,'ABC-12349','12345678909','2023-01-10 00:00:00','Marca9',2009,'Modelo9','Concesionario9','Aseguradora9','Poliza9','2023-01-10 00:00:00','2023-01-10 00:00:00',NULL,'Camion','Activo'),(11,'ABC-12350','12345678910','2023-01-11 00:00:00','Marca10',2020,'Modelo10','Concesionario10','Aseguradora10','Poliza10','2023-01-11 00:00:00','2023-01-11 00:00:00',NULL,'Camion','Activo');
/*!40000 ALTER TABLE `vehiculo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'gestion_flota'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-26 21:05:21
