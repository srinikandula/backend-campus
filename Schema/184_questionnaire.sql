CREATE TABLE IF NOT EXISTS `questionnaire` (
  `questionnaire_id` int(11) NOT NULL AUTO_INCREMENT,
  `questionnaire_name` varchar(250) NOT NULL,
  `questionnaire_description` text NOT NULL,
  `creationdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `domain_id` int(11) NOT NULL,
  `master_id` int(11) NOT NULL,
  `atype` int(11) NOT NULL COMMENT '1-,2-,3-',
  PRIMARY KEY (`questionnaire_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
