CREATE TABLE IF NOT EXISTS `smm_smt_tools` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `scheduler_id` int(11) NOT NULL,
  `tool_id` int(11) NOT NULL,
  `assignment_id` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_date` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
