CREATE TABLE IF NOT EXISTS `types_leave` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `leave_name` varchar(250) NOT NULL,
  `status` varchar(10) NOT NULL,	
  `domain_id` int(11) NOT NULL DEFAULT '0',
  `created_by` int(11) NOT NULL,
  `created_date` datetime NOT NULL,
  `updated_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `domain_id` (`domain_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
