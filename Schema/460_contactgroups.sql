CREATE TABLE IF NOT EXISTS `contactgroups` (
  `gid` int(11) NOT NULL AUTO_INCREMENT,
  `groupname` varchar(70) NOT NULL,
  `grpcreationdt` datetime NOT NULL,
  `created_by` int(11) NOT NULL,
  `domain` int(11) NOT NULL,
  PRIMARY KEY (`gid`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
