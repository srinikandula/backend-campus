CREATE TABLE IF NOT EXISTS `agreement_template_node` (
  `agreement_node_id` int(11) NOT NULL AUTO_INCREMENT,
  `parent_nodeid` int(11) DEFAULT NULL,
  `agreement_head_id` int(11) NOT NULL,
  `short` varchar(250) NOT NULL,
  `full` text NOT NULL,
  `nodelevel` int(11) NOT NULL,
  `nodecode` varchar(80) NOT NULL,
  `level1` int(11) NOT NULL,
  `level2` int(11) NOT NULL,
  `level3` int(11) NOT NULL,
  `level4` int(11) NOT NULL,
  `level5` int(11) NOT NULL,
  `created_on` datetime NOT NULL,
  `master_id` int(11) NOT NULL,
  `master_parent_id` int(11) NOT NULL,
  `node_code` varchar(255) DEFAULT NULL,
  `node_level` int(11) DEFAULT NULL,
  `node_sequence` int(11) DEFAULT NULL,
  PRIMARY KEY (`agreement_node_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
