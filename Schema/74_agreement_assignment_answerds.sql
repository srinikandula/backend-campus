CREATE TABLE IF NOT EXISTS `agreement_assignment_answerds` (
  `answer_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `node_id` int(11) NOT NULL,
  `short_answer` text NOT NULL,
  `long_answer` text NOT NULL,
  `created_by` int(11) NOT NULL,
  `creation_dt` date NOT NULL,
  PRIMARY KEY (`answer_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
