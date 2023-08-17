CREATE TABLE IF NOT EXISTS `domain_modules` (
  `dmid` int(11) NOT NULL AUTO_INCREMENT,
  `mid` int(10) NOT NULL,
  `did` int(10) NOT NULL,
  `license_key` varchar(250) NOT NULL,
  `status` int(4) NOT NULL COMMENT '1=active,0=inactive',
  PRIMARY KEY (`dmid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
