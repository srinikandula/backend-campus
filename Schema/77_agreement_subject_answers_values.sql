CREATE TABLE IF NOT EXISTS `agreement_subject_answers_values` (
  `value_id` int(11) NOT NULL AUTO_INCREMENT,
  `agreement_subject_id` int(11) NOT NULL,
  `answer` text NOT NULL,
  `agreement_node_id` int(11) NOT NULL,
  `given_by` int(11) NOT NULL,
  `execution_id` int(11) NOT NULL,
  `approver_user` int(11) NOT NULL,
  `doer_user` int(11) NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1' COMMENT '1=not initiated,2-submitted,3-rejected,4-approved',
  `given_dt` date NOT NULL,
  `approved_by` int(11) NOT NULL,
  `approved_dt` date NOT NULL,
  `yes_no` int(1) NOT NULL DEFAULT '2',
  `ans` int(1) NOT NULL,
  PRIMARY KEY (`value_id`),
  KEY `execution_id` (`execution_id`,`approver_user`,`doer_user`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
