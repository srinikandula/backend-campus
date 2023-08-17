CREATE TABLE IF NOT EXISTS `loc_master` (
  `lid` int(11) NOT NULL AUTO_INCREMENT,
  `loc_name` varchar(250) NOT NULL,
  `client_id` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`lid`),
  UNIQUE KEY `loc_name` (`loc_name`,`client_id`),
  UNIQUE KEY `loc_name_2` (`loc_name`,`client_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
