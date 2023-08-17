CREATE TABLE IF NOT EXISTS `template_timeline_config` (
  `temp_timeline_id` int(11) NOT NULL AUTO_INCREMENT,
  `template_id` int(11) NOT NULL,
  `timeline` int(11) NOT NULL,
  `creationdt` datetime NOT NULL,
  PRIMARY KEY (`temp_timeline_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
