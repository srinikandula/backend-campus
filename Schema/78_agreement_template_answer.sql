CREATE TABLE IF NOT EXISTS `agreement_template_answer` (
  `answer_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `agreement_node_id` int(11) NOT NULL,
  `short_answer` varchar(250) NOT NULL,
  `answer` text NOT NULL,
  `asm_agr_head_id` int(11) NOT NULL,
  `asm_agr_node_id` int(11) NOT NULL,
  `asm_agr_answer_id` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `creation_dt` date NOT NULL,
  `master_id` int(11) NOT NULL,
  `master_parent_id` int(11) NOT NULL,
  PRIMARY KEY (`answer_id`),
  UNIQUE KEY `agreement_node_id` (`agreement_node_id`,`short_answer`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
