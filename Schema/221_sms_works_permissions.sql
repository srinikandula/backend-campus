CREATE TABLE IF NOT EXISTS `sms_works_permissions` (
  `perid` int(11) NOT NULL AUTO_INCREMENT,
  `workid` int(11) NOT NULL,
  `createdby` int(11) NOT NULL,
  `createdusertype` varchar(50) NOT NULL,
  `userid` int(11) NOT NULL,
  `usertype` varchar(25) NOT NULL,
  `userstatus` varchar(15) NOT NULL DEFAULT 'active' COMMENT 'active,inactive',
  `estime_hrs` int(11) NOT NULL,
  `equiv_perc` int(11) NOT NULL,
  `creationdt_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`perid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
