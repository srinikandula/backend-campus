CREATE TABLE IF NOT EXISTS `process_node` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `node_name` varchar(150) NOT NULL,
  `description` text NOT NULL,
  `type_of_node` varchar(10) NOT NULL COMMENT 'Decision,Activity',
  `trigger_type` char(15) NOT NULL COMMENT 'And, Or,AUTO,SINGLE',
  `bk_trigger_type` char(15) NOT NULL,
  `process_id` int(11) NOT NULL,
  `creationdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `risk_score` double(10,2) NOT NULL,
  `control_score` double(10,2) NOT NULL,
  `total_score` double(10,2) NOT NULL,
  `open_risk_score` double(10,2) NOT NULL,
  `client_id` int(11) NOT NULL,
  `assignment_id` int(11) NOT NULL,
  `domain_id` int(11) NOT NULL,
  `link_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `node_name` (`node_name`,`process_id`,`assignment_id`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
ALTER DATABASE `anyaudit_olddb` CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_VALUE_ON_ZERO' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`%`*/ /*!50003 TRIGGER `score_updation` BEFORE UPDATE ON `process_node` FOR EACH ROW BEGIN
 IF (NEW.risk_score=0 ) THEN       
set NEW.control_score =0;
 ELSE
set NEW.control_score = NEW.open_risk_score / NEW.risk_score ;
 END IF;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
ALTER DATABASE `anyaudit_olddb` CHARACTER SET utf8 COLLATE utf8_general_ci ;
