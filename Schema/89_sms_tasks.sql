CREATE TABLE IF NOT EXISTS `sms_tasks` (
  `task_id` int(11) NOT NULL AUTO_INCREMENT,
  `task_name` varchar(250) NOT NULL,
  `task_status` varchar(10) NOT NULL,
  `domain_id` int(11) NOT NULL,
  PRIMARY KEY (`task_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
