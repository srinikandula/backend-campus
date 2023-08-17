CREATE TABLE IF NOT EXISTS `bmcq` (
  `mid` int(11) NOT NULL AUTO_INCREMENT,
  `question` varchar(250) NOT NULL,
  `bid` int(5) NOT NULL,
  `created_by` int(5) NOT NULL,
  `created_on` date NOT NULL,
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
