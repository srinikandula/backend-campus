CREATE TABLE IF NOT EXISTS `tag_list` (
  `taglist_id` int(11) NOT NULL AUTO_INCREMENT,
  `tag_id` int(5) NOT NULL,
  `name` varchar(250) NOT NULL,
  `description` text NOT NULL,
  `created_by` int(5) NOT NULL,
  `created_on` date NOT NULL,
  PRIMARY KEY (`taglist_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
