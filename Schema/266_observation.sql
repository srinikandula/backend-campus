CREATE TABLE IF NOT EXISTS `observation` (
  `obs_id` int(11) NOT NULL AUTO_INCREMENT,
  `obs_name` varchar(255) NOT NULL,
  `obs_status` varchar(255) NOT NULL,
  PRIMARY KEY (`obs_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
