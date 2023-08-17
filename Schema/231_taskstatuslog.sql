CREATE TABLE IF NOT EXISTS `taskstatuslog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assignmentid` int(11) NOT NULL,
  `tasklistid` int(11) NOT NULL,
  `previous_status` int(11) NOT NULL,
  `current_status` int(11) NOT NULL,
  `value` int(11) NOT NULL,
  `changed_user` int(11) NOT NULL,
  `changed_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
