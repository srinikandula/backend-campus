CREATE TABLE IF NOT EXISTS `audit_response_qualifications_emphasis` (
  `arqeid` int(11) NOT NULL AUTO_INCREMENT,
  `audit_response_id` int(11) NOT NULL,
  `qe_type` enum('Qualification','Emphasis','Disclaimer') NOT NULL,
  `report_id` int(11) NOT NULL,
  `remarks1` text NOT NULL,
  `remarks2` text NOT NULL,
  PRIMARY KEY (`arqeid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
