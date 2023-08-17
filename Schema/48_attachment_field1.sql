CREATE TABLE IF NOT EXISTS `attachment_field1` (
  `field1_id` int(11) NOT NULL AUTO_INCREMENT,
  `field1_name` varchar(150) NOT NULL,
  `taskrelated` varchar(3) NOT NULL DEFAULT 'no' COMMENT 'yes,no',
  `domain` int(11) NOT NULL,
  PRIMARY KEY (`field1_id`),
  UNIQUE KEY `field1_name` (`field1_name`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

