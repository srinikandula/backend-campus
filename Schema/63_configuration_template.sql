CREATE TABLE IF NOT EXISTS `configuration_template` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `template_name` varchar(250) NOT NULL,
  `template` varchar(250) NOT NULL,
  `domain` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_date` date NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1',
  `master_id` int(11) NOT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
