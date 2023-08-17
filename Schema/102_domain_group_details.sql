CREATE TABLE IF NOT EXISTS `domain_group_details` (
  `gd_id` int(11) NOT NULL AUTO_INCREMENT,
  `domain_group_id` int(11) NOT NULL,
  `domain_id` int(11) NOT NULL,
  PRIMARY KEY (`gd_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
