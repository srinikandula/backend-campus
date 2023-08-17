CREATE TABLE IF NOT EXISTS `rule_stmts` (
  `rs_id` int(11) NOT NULL AUTO_INCREMENT,
  `rule_id` int(11) NOT NULL,
  `field_id` int(11) NOT NULL,
  `filter_type` int(11) NOT NULL,
  `filter_id` char(1) NOT NULL,
  `field_val` int(11) NOT NULL,
  `operator` varchar(50) NOT NULL,
  `val1` varchar(250) NOT NULL,
  `val2` varchar(250) NOT NULL,
  `created_by` int(11) NOT NULL,
  `creation_dt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `set_filter` int(11) NOT NULL,
  `set_value` int(11) NOT NULL,
  `master_id` int(11) NOT NULL,
  `master_parent_id` int(11) NOT NULL,
  PRIMARY KEY (`rs_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
