CREATE TABLE IF NOT EXISTS `usergroups` (
  `gid` int(11) NOT NULL AUTO_INCREMENT,
  `groupname` varchar(50) NOT NULL,
  `mgrid` int(11) NOT NULL,
  `grpcreationdt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `domain` int(11) NOT NULL,
  PRIMARY KEY (`gid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
