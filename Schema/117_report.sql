CREATE TABLE IF NOT EXISTS `report` (
  `report_id` int(11) NOT NULL AUTO_INCREMENT,
  `report_name` varchar(255) NOT NULL,
  `report_status` varchar(255) NOT NULL,
  `chapter_id` int(11) NOT NULL,
  `rtype` int(11) NOT NULL DEFAULT '1' COMMENT '1- Type1, 2- Type2',
  `domain_id` int(11) NOT NULL,
  `sync_id` int(11) NOT NULL,
  `sync_on` datetime NOT NULL,
  `master_id` int(11) NOT NULL,
  PRIMARY KEY (`report_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
