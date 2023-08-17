CREATE TABLE IF NOT EXISTS `b_activity_permissions` (
  `bact_per_id` int(11) NOT NULL AUTO_INCREMENT,
  `bact_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `status` int(1) NOT NULL COMMENT '0,1',
  PRIMARY KEY (`bact_per_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
