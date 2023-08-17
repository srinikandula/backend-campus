CREATE TABLE IF NOT EXISTS `custom_drafts_signatories` (
  `cds_id` int(11) NOT NULL AUTO_INCREMENT,
  `draft_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `acceptance_status` int(1) DEFAULT NULL COMMENT '1-Accepted, 0 - Not accepted',
  `remarks` text NOT NULL,
  `dt_of_signoff` date NOT NULL,
  `att_id` int(11) NOT NULL,
  `creation_dt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`cds_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
