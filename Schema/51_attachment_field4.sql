CREATE TABLE IF NOT EXISTS `attachment_field4` (
  `field4_id` int(11) NOT NULL AUTO_INCREMENT,
  `field4_name` varchar(150) NOT NULL,
  PRIMARY KEY (`field4_id`),
  UNIQUE KEY `field4_name` (`field4_name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
