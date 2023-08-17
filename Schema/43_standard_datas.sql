CREATE TABLE IF NOT EXISTS `standard_datas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(250) NOT NULL,
  `description` text,
  `domain_id` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` date NOT NULL,
  `master_id` int(11) DEFAULT NULL,
  `status` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
