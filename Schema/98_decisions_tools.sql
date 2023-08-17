CREATE TABLE IF NOT EXISTS `decisions_tools` (
  `dt_id` int(11) NOT NULL AUTO_INCREMENT,
  `dec_id` int(11) NOT NULL,
  `tool_id` int(11) NOT NULL,
  `toolkit_id` int(11) NOT NULL,
  `toolkit_name` varchar(250) NOT NULL,
  `domain_id` int(11) NOT NULL,
  `placed_by` int(11) NOT NULL,
  `placed_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `master_id` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`dt_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
