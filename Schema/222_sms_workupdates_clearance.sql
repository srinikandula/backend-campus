CREATE TABLE IF NOT EXISTS `sms_workupdates_clearance` (
  `clearanceid` int(11) NOT NULL AUTO_INCREMENT,
  `workupdate_id` int(11) NOT NULL,
  `clearanceuser` int(11) NOT NULL,
  `usertype` varchar(25) NOT NULL,
  `clearancestatus` int(11) NOT NULL COMMENT '0-Not seen,1-seen',
  `clearancetime` datetime NOT NULL,
  PRIMARY KEY (`clearanceid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
