CREATE TABLE IF NOT EXISTS `annexure_node` (
  `annexure_node_id` int(11) NOT NULL AUTO_INCREMENT,
  `annexure_id` int(11) NOT NULL,
  `fieldname` varchar(250) NOT NULL,
  `fieldtype` varchar(250) NOT NULL,
  `fieldtype_columnname` varchar(15) NOT NULL,
  `required_optional` int(11) NOT NULL,
  `unique_notunique` int(11) NOT NULL,
  `created_on` datetime NOT NULL,
  `created_by` int(11) NOT NULL,
  `mapped_column` varchar(25) NOT NULL,
  `mapped_column_order` varchar(25) NOT NULL,
  `master_id` int(11) NOT NULL,
  `master_parent_id` int(11) NOT NULL,
  PRIMARY KEY (`annexure_node_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

