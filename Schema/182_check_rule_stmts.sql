CREATE TABLE IF NOT EXISTS `check_rule_stmts` (
  `crs_id` int(11) NOT NULL AUTO_INCREMENT,
  `check_id` int(5) NOT NULL,
  `rightcheck_id` int(5) NOT NULL,
  `checklist_val` int(5) NOT NULL,
  `created_by` int(5) NOT NULL,
  `created_on` datetime NOT NULL,
  `master_id` int(11) NOT NULL,
  `master_parent_id` int(11) NOT NULL,
  PRIMARY KEY (`crs_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
