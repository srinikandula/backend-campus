CREATE TABLE IF NOT EXISTS `location` (
  `lid` int(11) NOT NULL AUTO_INCREMENT,
  `lname` varchar(225) NOT NULL,
  `ldesc` varchar(225) NOT NULL,
  `lstatus` varchar(225) NOT NULL,
  PRIMARY KEY (`lid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
