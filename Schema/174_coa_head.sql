CREATE TABLE IF NOT EXISTS `coa_head` (
  `coa_id` int(11) NOT NULL AUTO_INCREMENT,
  `coa_name` varchar(250) NOT NULL,
  `description` text NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL,
  `assignment_id` int(11) NOT NULL,
  `master_id` int(11) NOT NULL,
  PRIMARY KEY (`coa_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
