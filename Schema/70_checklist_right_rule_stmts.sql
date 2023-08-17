CREATE TABLE IF NOT EXISTS `checklist_right_rule_stmts` (
  `crs_id` int(11) NOT NULL AUTO_INCREMENT,
  `cr_id` int(5) NOT NULL,
  `tool_type` varchar(50) NOT NULL,
  `tool_kit_id` int(5) NOT NULL,
  `created_by` int(5) NOT NULL,
  `created_on` datetime NOT NULL,
  `master_id` int(11) NOT NULL,
  `master_parent_id` int(11) NOT NULL,
  PRIMARY KEY (`crs_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
