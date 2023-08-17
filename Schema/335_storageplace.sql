CREATE TABLE IF NOT EXISTS `storageplace` (
  `placeid` int(11) NOT NULL AUTO_INCREMENT,
  `placename` varchar(50) NOT NULL,
  `createdon` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `domain_id` int(11) NOT NULL,
  PRIMARY KEY (`placeid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
