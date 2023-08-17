CREATE TABLE IF NOT EXISTS `company_department` (
  `cdid` int(11) NOT NULL AUTO_INCREMENT,
  `cid` int(11) NOT NULL,
  `deptid` int(11) NOT NULL,
  PRIMARY KEY (`cdid`),
  UNIQUE KEY `cdunique` (`cid`,`deptid`),
  KEY `compindex` (`cid`),
  KEY `deptindex` (`deptid`),
  CONSTRAINT `company_department_ibfk_1` FOREIGN KEY (`deptid`) REFERENCES `department` (`did`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
