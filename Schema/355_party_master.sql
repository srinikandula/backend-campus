CREATE TABLE IF NOT EXISTS `party_master` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `party_name` varchar(250) NOT NULL,
  `client_id` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `defaulting` varchar(100) DEFAULT NULL,
  `msme` varchar(100) DEFAULT NULL,
  `related` varchar(100) DEFAULT NULL,
  `pan` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`pid`),
  UNIQUE KEY `party_name` (`party_name`,`client_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
