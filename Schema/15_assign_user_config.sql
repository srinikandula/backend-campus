CREATE TABLE IF NOT EXISTS `assign_user_config` (
  `assign_users_id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `user_role` int(11) NOT NULL,
  `creationdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `budgeted_hours` float(11,2) NOT NULL,
  PRIMARY KEY (`assign_users_id`),
  KEY `assignment_id` (`assignment_id`),
  KEY `user_id` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
