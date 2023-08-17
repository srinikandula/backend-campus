CREATE TABLE IF NOT EXISTS `recurring_milestones_config` (
  `rmc_id` int(11) NOT NULL AUTO_INCREMENT,
  `rm_id` int(11) NOT NULL,
  `timeline_id` int(11) NOT NULL,
  `assignment_id` int(11) NOT NULL,
  `status_of_config` tinyint(1) NOT NULL COMMENT '0,1',
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `configured_by` int(11) NOT NULL,
  `configured_on` datetime NOT NULL,
  PRIMARY KEY (`rmc_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
