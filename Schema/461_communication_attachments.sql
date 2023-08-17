CREATE TABLE IF NOT EXISTS `communication_attachments` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `attach_from` int(11) NOT NULL COMMENT '1-Question(communication_info),2-Response(communication_responses',
  `attach_from_id` bigint(20) NOT NULL,
  `attachment` text,
  `comm_id` int(5) NOT NULL,
  `assignment_id` int(5) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
