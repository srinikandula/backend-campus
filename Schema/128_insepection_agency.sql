CREATE TABLE IF NOT EXISTS `insepection_agency` (
  `ia_id` int(11) NOT NULL AUTO_INCREMENT,
  `ia_name` varchar(255) NOT NULL,
  `ia_status` varchar(255) NOT NULL,
  `domain_id` int(11) NOT NULL,
  `master_id` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ia_id`),
  UNIQUE KEY `ia_name` (`ia_name`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
