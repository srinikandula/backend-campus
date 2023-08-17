CREATE TABLE IF NOT EXISTS `guidance_notes_node` (
  `guidance_node_id` int(11) NOT NULL AUTO_INCREMENT,
  `guidance_notes_id` int(11) NOT NULL,
  `parent_nodeid` int(11) NOT NULL,
  `short_guidance_notes` varchar(250) NOT NULL,
  `full_guidance_notes` text NOT NULL,
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
  PRIMARY KEY (`guidance_node_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
