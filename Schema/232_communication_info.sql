CREATE TABLE IF NOT EXISTS `communication_info` (
  `comm_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `ass_seq_id` int(11) NOT NULL,
  `ass_seq_txt` varchar(15) NOT NULL,
  `comm_type` varchar(30) NOT NULL COMMENT '1-RFI,2-RFQ,3-RFC,4-GR by EU,5-GR by Au,Observation',
  `proposal_id` int(11) NOT NULL,
  `element_id` int(11) NOT NULL DEFAULT '0',
  `subject_id` int(11) NOT NULL,
  `element_name` varchar(255) DEFAULT NULL,
  `subject_name` varchar(255) DEFAULT NULL,
  `process_type` varchar(80) NOT NULL,
  `process_type_id` int(11) NOT NULL,
  `node_id` int(11) NOT NULL,
  `originator` int(11) NOT NULL,
  `question` text NOT NULL,
  `answer` text NOT NULL,
  `question_dt` date NOT NULL,
  `status` int(11) NOT NULL COMMENT '4-rejected,3-Initiated,2-Responded,1-Resolved',
  `precedence_id` bigint(20) NOT NULL,
  `reject_note` text NOT NULL,
  `attachment_id` int(11) NOT NULL,
  `domain` int(11) NOT NULL,
  `scheduler_id` int(11) NOT NULL,
  `user_type` int(1) NOT NULL COMMENT '1=externaluser,0=user	',
  `to_be_responded` int(11) DEFAULT NULL,
  `commu_from` varchar(55) DEFAULT NULL,
  PRIMARY KEY (`comm_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;