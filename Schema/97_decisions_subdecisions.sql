CREATE TABLE IF NOT EXISTS `decisions_subdecisions` (
  `dec_subdec_id` int(11) NOT NULL AUTO_INCREMENT,
  `decision_id` int(11) NOT NULL,
  `subdec_name` varchar(250) NOT NULL,
  `subdec_desc` text NOT NULL,
  `creationdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `master_id` int(11) NOT NULL,
  `master_parent_id` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`dec_subdec_id`),
  KEY `decision_id` (`decision_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
