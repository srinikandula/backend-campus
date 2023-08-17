CREATE TABLE IF NOT EXISTS `sms_groups` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `group_name` varchar(50) NOT NULL,
  `grouptype` varchar(20) NOT NULL COMMENT 'contact,client',
  `creation_dt` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
