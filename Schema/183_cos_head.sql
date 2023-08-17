CREATE TABLE IF NOT EXISTS `cos_head` (
  `cos_id` int(11) NOT NULL AUTO_INCREMENT,
  `cos_name` varchar(250) NOT NULL,
  `description` text NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL,
  `assignment_id` int(11) NOT NULL,
  `master_id` int(11) NOT NULL,
  PRIMARY KEY (`cos_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
