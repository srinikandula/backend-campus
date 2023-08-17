CREATE TABLE IF NOT EXISTS `attachment_field2` (
  `field2_id` int(11) NOT NULL AUTO_INCREMENT,
  `field1_id` int(11) NOT NULL,
  `field2_name` varchar(150) NOT NULL,
  `domain` int(11) NOT NULL,
  PRIMARY KEY (`field2_id`),
  UNIQUE KEY `field2_name` (`field2_name`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
