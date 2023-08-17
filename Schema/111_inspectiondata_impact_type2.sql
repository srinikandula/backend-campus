CREATE TABLE IF NOT EXISTS `inspectiondata_impact_type2` (
  `idimpact_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) NOT NULL,
  `inspdata_id` int(11) NOT NULL,
  `impact_id` int(11) NOT NULL,
  `impact_value` varchar(250) NOT NULL,
  `impact_remarks` varchar(100) NOT NULL,
  PRIMARY KEY (`idimpact_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
