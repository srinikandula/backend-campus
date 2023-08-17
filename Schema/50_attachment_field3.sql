CREATE TABLE IF NOT EXISTS `attachment_field3` (
  `field3_id` int(11) NOT NULL AUTO_INCREMENT,
  `field3_name` varchar(150) NOT NULL,
  `domain` int(11) NOT NULL,
  PRIMARY KEY (`field3_id`),
  UNIQUE KEY `field3_name` (`field3_name`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
