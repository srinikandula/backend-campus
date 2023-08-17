CREATE TABLE IF NOT EXISTS `domain_group` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `domain_group_name` varchar(250) NOT NULL,
  `domain_grouptype` varchar(20) NOT NULL,
  `domain_id` int(11) NOT NULL,
  `creation_dt` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
