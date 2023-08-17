CREATE TABLE IF NOT EXISTS `scoping` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `element_id` int(11) NOT NULL,
  `subject_id` int(11) NOT NULL,
  `tool_type` int(11) NOT NULL,
  `tool_type_id` int(11) NOT NULL,
  `route_type` varchar(20) NOT NULL COMMENT 'auto,Direct,reroute,manual',
  `route_tool` varchar(150) NOT NULL,
  `route_tool_id` int(11) NOT NULL,
  `execution_id` int(11) NOT NULL,
  `scoping_by` int(11) NOT NULL,
  `scoped_date` date NOT NULL,
  `assignment_id` int(11) NOT NULL,
  `status` int(11) NOT NULL COMMENT '1=active,0=inactive',
  `scope_type` int(11) NOT NULL,
  `timeline` int(5) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `assignment_id` (`assignment_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
