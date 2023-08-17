CREATE TABLE IF NOT EXISTS `checklist_node_tmp` (
  `checklist_node_id` int(11) NOT NULL AUTO_INCREMENT,
  `checklist_id` int(11) NOT NULL,
  `short_checklist` text NOT NULL,
  `full_checklist` text NOT NULL,
  `desired_result` tinyint(1) NOT NULL,
  `na_as` tinyint(1) NOT NULL,
  `sr_no` int(11) DEFAULT NULL,
  `order_no` int(11) DEFAULT NULL,
  `falling_under` int(11) DEFAULT NULL,
  `tmp_code` varchar(255) NOT NULL,
  `nodelevel` int(11) DEFAULT NULL,
  PRIMARY KEY (`checklist_node_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
