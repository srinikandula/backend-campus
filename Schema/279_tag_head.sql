CREATE TABLE IF NOT EXISTS `tag_head` (
  `tag_id` int(11) NOT NULL AUTO_INCREMENT,
  `tag_name` varchar(250) NOT NULL,
  `tag_description` text NOT NULL,
  `created_by` int(5) NOT NULL,
  `created_on` date NOT NULL,
  PRIMARY KEY (`tag_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
