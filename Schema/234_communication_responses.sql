CREATE TABLE IF NOT EXISTS `communication_responses` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `comm_id` bigint(20) NOT NULL,
  `responded_by` int(11) NOT NULL,
  `response` text NOT NULL,
  `multi_response_ids` varchar(255) DEFAULT NULL,
  `attachment_id` int(11) DEFAULT NULL,
  `response_dt` date NOT NULL,
  `reject_note` text NOT NULL,
  `user_type` int(1) NOT NULL COMMENT '1=externaluser,0=user',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
