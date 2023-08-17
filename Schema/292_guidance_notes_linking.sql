CREATE TABLE IF NOT EXISTS `guidance_notes_linking` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tool_type` int(11) NOT NULL,
  `tool_head` int(11) NOT NULL,
  `tool_node` int(11) NOT NULL,
  `guidance_head` int(11) NOT NULL,
  `guidance_node_id` int(11) NOT NULL,
  `created_date` datetime NOT NULL,
  `master_id` int(11) NOT NULL,
  `master_head_id` int(11) NOT NULL,
  `master_list_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
