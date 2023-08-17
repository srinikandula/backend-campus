CREATE TABLE IF NOT EXISTS `subdecisions_conditions` (
  `subdec_cond_id` int(11) NOT NULL AUTO_INCREMENT,
  `subdec_id` int(11) NOT NULL,
  `cond_id` int(11) NOT NULL,
  `creationdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `master_id` int(11) NOT NULL,
  PRIMARY KEY (`subdec_cond_id`),
  KEY `subdec_id` (`subdec_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
