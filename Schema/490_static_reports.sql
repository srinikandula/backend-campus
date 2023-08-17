CREATE TABLE IF NOT EXISTS `static_reports` (
  `sr_id` int(11) NOT NULL AUTO_INCREMENT,
  `sr_name` varchar(250) NOT NULL,
  `sr_func_name` varchar(250) NOT NULL,
  `sr_controller_name` varchar(250) NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`sr_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
