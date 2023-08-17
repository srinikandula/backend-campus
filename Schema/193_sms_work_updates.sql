CREATE TABLE IF NOT EXISTS `sms_work_updates` (
  `updid` int(11) NOT NULL AUTO_INCREMENT,
  `workid` int(11) NOT NULL,
  `tasklistid` int(11) DEFAULT NULL,
  `description` varchar(1024) NOT NULL,
  `usertype` varchar(500) NOT NULL,
  `userid` int(11) NOT NULL,
  `insertiondttime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `currentstatus` int(11) NOT NULL,
  `attachment_path` text NOT NULL,
  `attachment_id` varchar(250) NOT NULL,
  `check_am` int(11) NOT NULL COMMENT '1=checked,0=notchecked',
  PRIMARY KEY (`updid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
