CREATE TABLE IF NOT EXISTS `domainlogo` (
  `logo_id` int(11) NOT NULL AUTO_INCREMENT,
  `logo_name` varchar(250) NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1' COMMENT '1=active,0=inactive	',
  `created_by` int(11) NOT NULL,
  `created_date` date NOT NULL,
  `domain` int(11) NOT NULL,
  `lname` varchar(250) NOT NULL,
  `designation` varchar(50) NOT NULL,
  `uri_office` text NOT NULL,
  PRIMARY KEY (`logo_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
