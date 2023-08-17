CREATE TABLE IF NOT EXISTS `vault_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vault_id` int(11) DEFAULT NULL,
  `created_on` datetime DEFAULT NULL,
  `created_by` int(11) DEFAULT NULL,
  `status` int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `vault_id` (`vault_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
