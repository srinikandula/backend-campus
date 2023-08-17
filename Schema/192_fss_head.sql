CREATE TABLE IF NOT EXISTS `fss_head` (
  `fss_id` int(11) NOT NULL AUTO_INCREMENT,
  `fss_name` varchar(250) NOT NULL,
  `description` text NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL,
  `assignment_id` int(11) NOT NULL,
  `master_id` int(11) NOT NULL,
  `domain_id` int(11) NOT NULL,
  `main_or_sub` tinyint(4) DEFAULT NULL,
  `status` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`fss_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
