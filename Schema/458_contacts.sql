CREATE TABLE IF NOT EXISTS `contacts` (
  `contactid` int(11) NOT NULL AUTO_INCREMENT,
  `contactname` varchar(150) NOT NULL,
  `contactno` bigint(20) NOT NULL,
  `domain` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `creationdt` datetime NOT NULL,
  `contactemail` varchar(250) NOT NULL,
  PRIMARY KEY (`contactid`),
  UNIQUE KEY `domain` (`domain`,`contactno`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
