CREATE TABLE IF NOT EXISTS `usergroupsdata` (
  `gdataid` int(11) NOT NULL AUTO_INCREMENT,
  `gid` bigint(20) NOT NULL,
  `userid` int(11) NOT NULL,
  `entereddt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `domain` int(11) NOT NULL,
  PRIMARY KEY (`gdataid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
