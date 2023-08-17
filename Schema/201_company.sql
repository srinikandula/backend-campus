CREATE TABLE IF NOT EXISTS `company` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(255) NOT NULL,
  `cphone` varchar(255) NOT NULL,
  `cemail` varchar(255) NOT NULL,
  `cpan` varchar(25) NOT NULL,
  `cfileno` varchar(30) NOT NULL,
  `cstatus` varchar(10) NOT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
