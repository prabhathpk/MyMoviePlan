-- MySQL dump 10.13  Distrib 5.6.23, for Win64 (x86_64)
--
-- Host: localhost    Database: movie-ticket-sp
-- ------------------------------------------------------
-- Server version	5.6.25-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `m_invoice_detail`
--

DROP TABLE IF EXISTS `m_invoice_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `m_invoice_detail` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CREATED_BY` varchar(255) DEFAULT NULL,
  `CREATED_DATETIME` datetime DEFAULT NULL,
  `MODIFIED_BY` varchar(255) DEFAULT NULL,
  `MODIFIED_DATETIME` datetime DEFAULT NULL,
  `DATE` date DEFAULT NULL,
  `INVOICE_NUMBER` varchar(225) DEFAULT NULL,
  `MOVIE_NAME` varchar(225) DEFAULT NULL,
  `PRICE` varchar(225) DEFAULT NULL,
  `SCREEN_NO` varchar(225) DEFAULT NULL,
  `SHOW_TIME` varchar(225) DEFAULT NULL,
  `THEATER_NAME` varchar(225) DEFAULT NULL,
  `SEAT_NO` varchar(225) DEFAULT NULL,
  `USER_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=39 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `m_invoice_detail`
--

LOCK TABLES `m_invoice_detail` WRITE;
/*!40000 ALTER TABLE `m_invoice_detail` DISABLE KEYS */;
INSERT INTO `m_invoice_detail` VALUES (38,NULL,NULL,NULL,NULL,'2021-05-27','49942','KGF two','200','2','06:00 PM','NMS Cinemas','3',3),(37,NULL,NULL,NULL,NULL,'2021-05-27','49942','KGF two','200','2','06:00 PM','NMS Cinemas','2',3),(36,NULL,NULL,NULL,NULL,'2021-05-23','49942','KGF two','200','2','06:00 PM','NMS Cinemas','1',3),(35,NULL,NULL,NULL,NULL,'2021-10-20','38592','atrangi re','200','2','12:00 PM','NMS Cinemas,udupi','2',2),(34,NULL,NULL,NULL,NULL,'2021-05-19','38592','atrangi re','200','2','12:00 PM','NMS Cinemas,udupi','1',2);
/*!40000 ALTER TABLE `m_invoice_detail` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-28 13:40:02
