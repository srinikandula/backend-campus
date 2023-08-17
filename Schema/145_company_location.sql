CREATE TABLE IF NOT EXISTS `company_location` (
  `clid` int(11) NOT NULL AUTO_INCREMENT,
  `cid` int(11) NOT NULL,
  `locid` int(11) NOT NULL,
  PRIMARY KEY (`clid`),
  UNIQUE KEY `clunique` (`cid`,`locid`),
  KEY `compindex` (`cid`),
  KEY `locindex` (`locid`),
  CONSTRAINT `company_location_ibfk_1` FOREIGN KEY (`locid`) REFERENCES `location` (`lid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
