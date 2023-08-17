CREATE TABLE IF NOT EXISTS `firm` (
  `fid` int(11) NOT NULL AUTO_INCREMENT,
  `firm_name` varchar(250) NOT NULL,
  `reg_no` varchar(50) NOT NULL,
  `date_consultation` date NOT NULL,
  `c_ag` varchar(50) NOT NULL,
  `rbi_mbf` varchar(50) NOT NULL,
  `cag_category` varchar(50) NOT NULL,
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
