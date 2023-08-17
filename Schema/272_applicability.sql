CREATE TABLE IF NOT EXISTS `applicability` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `element_id` int(11) NOT NULL,
  `subject_id` int(11) NOT NULL,
  `tool_type` int(11) NOT NULL,
  `tool_type_id` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `creation_dt` date NOT NULL,
  `assignment_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
