CREATE TABLE IF NOT EXISTS `temp_compilancecalendar_config` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `template_id` int(11) NOT NULL,
  `compilancecalendar` int(11) NOT NULL,
  `compilancecalendar_category` int(11) NOT NULL,
  `creationdt` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
