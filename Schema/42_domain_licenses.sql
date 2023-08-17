


CREATE TABLE IF NOT EXISTS `domain_licenses` (
  `dmid` int(11) NOT NULL AUTO_INCREMENT,
  `license_key` varchar(250) NOT NULL,
  `did` int(10) NOT NULL,
  `status` int(4) NOT NULL COMMENT '1=active,0=inactive',
  `created_by` int(10) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `start_dt` date NOT NULL,
  `end_dt` date NOT NULL,
  PRIMARY KEY (`dmid`),
  UNIQUE KEY `license_key` (`license_key`)
) ENGINE=InnoDB AUTO_INCREMENT=162 DEFAULT CHARSET=latin1;
