CREATE TABLE IF NOT EXISTS `recurring_milestones` (
  `rm_id` int(11) NOT NULL AUTO_INCREMENT,
  `milestonepack_id` int(11) NOT NULL,
  `frequency` int(11) NOT NULL,
  `total_value` double(10,2) NOT NULL,
  `assignment_id` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_by` int(11) NOT NULL,
  `updated_on` datetime NOT NULL,
  PRIMARY KEY (`rm_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
