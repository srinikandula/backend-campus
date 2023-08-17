CREATE TABLE IF NOT EXISTS `holiday` (
  `holiday_id` int(11) NOT NULL AUTO_INCREMENT,
  `description` text NOT NULL,
  `startdate` date NOT NULL,
  `enddate` date NOT NULL,
  `amuser` int(11) NOT NULL,
  `starttime` varchar(30) NOT NULL,
  `endtime` varchar(30) NOT NULL,
  `users` text NOT NULL,
  `createdby` int(11) NOT NULL,
  `created_date` datetime NOT NULL,
  PRIMARY KEY (`holiday_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
