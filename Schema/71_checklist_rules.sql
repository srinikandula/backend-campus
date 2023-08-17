CREATE TABLE IF NOT EXISTS `checklist_rules` (
  `crid` int(11) NOT NULL AUTO_INCREMENT,
  `checklist_id` int(11) NOT NULL,
  `rule_name` varchar(50) NOT NULL,
  `rule_cnt` int(9) NOT NULL,
  `delete_status` int(11) NOT NULL DEFAULT '0',
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `master_id` int(11) NOT NULL,
  `master_parent_id` int(11) NOT NULL,
  PRIMARY KEY (`crid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
