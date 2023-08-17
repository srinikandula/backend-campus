CREATE TABLE IF NOT EXISTS `userwork_location` (
  `locid` int(11) NOT NULL AUTO_INCREMENT,
  `locname` varchar(250) NOT NULL,
  `loccreationdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `domain` int(11) NOT NULL,
  PRIMARY KEY (`locid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
