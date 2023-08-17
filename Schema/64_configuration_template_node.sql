CREATE TABLE IF NOT EXISTS `configuration_template_node` (
  `ctid` int(11) NOT NULL AUTO_INCREMENT,
  `cid` int(11) NOT NULL,
  `tool_id` int(11) DEFAULT NULL,
  `tool_type_id` int(11) NOT NULL,
  `tool_type_value` varchar(255) DEFAULT NULL,
  `tool_type_id_a` int(11) DEFAULT NULL,
  `tool_type_id_b` int(11) DEFAULT NULL,
  `created_by` int(11) NOT NULL,
  `created_date` date NOT NULL,
  `status` int(11) NOT NULL,
  `c_type` varchar(250) DEFAULT NULL,
  `master_id` int(11) NOT NULL,
  PRIMARY KEY (`ctid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
