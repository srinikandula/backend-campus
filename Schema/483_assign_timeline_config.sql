CREATE TABLE IF NOT EXISTS `assign_timeline_config` (
  `assign_timeline_id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) NOT NULL,
  `timeline` int(11) NOT NULL,
  `creationdt` datetime NOT NULL,
  PRIMARY KEY (`assign_timeline_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
