CREATE TABLE IF NOT EXISTS `risk_master` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `risk_name` varchar(150) NOT NULL,
  `risk_desc` text,
  `impact` varchar(250) DEFAULT NULL,
  `risk_type` varchar(150) DEFAULT NULL,
  `creationdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `master_id` int(11) NOT NULL,
  `status` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `risk_name` (`risk_name`),
  UNIQUE KEY `risk_name_2` (`risk_name`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
