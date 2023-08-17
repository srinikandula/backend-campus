CREATE TABLE IF NOT EXISTS `assignment_subdecisions_values` (
  `asv_id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) NOT NULL,
  `sub_dec_id` int(11) NOT NULL,
  `val` tinyint(1) NOT NULL,
  `value_given` varchar(15) NOT NULL DEFAULT 'No' COMMENT 'YES,NO,NA',
  `creationdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`asv_id`),
  KEY `assignment_id` (`assignment_id`),
  KEY `sub_dec_id` (`sub_dec_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
