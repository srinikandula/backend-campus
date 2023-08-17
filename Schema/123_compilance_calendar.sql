CREATE TABLE IF NOT EXISTS `compilance_calendar` (
  `compilance_calendar_id` int(11) NOT NULL AUTO_INCREMENT,
  `compilance_calendar_name` varchar(250) NOT NULL,
  `compilance_calendar_status` varchar(10) NOT NULL,
  `ctype` int(11) DEFAULT NULL COMMENT '1- Type1, 2- Type2	',
  `domain_id` int(11) NOT NULL,
  `sync_id` int(11) NOT NULL,
  `sync_on` datetime NOT NULL,
  `master_id` int(11) NOT NULL,
  `chapter_id` int(3) NOT NULL DEFAULT '0',
  PRIMARY KEY (`compilance_calendar_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
