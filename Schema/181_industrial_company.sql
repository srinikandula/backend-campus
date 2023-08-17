CREATE TABLE IF NOT EXISTS `industrial_company` (
  `ic_id` int(11) NOT NULL AUTO_INCREMENT,
  `industrial_company_name` varchar(250) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` date NOT NULL,
  `sync_id` int(11) NOT NULL,
  `sync_on` datetime NOT NULL,
  `master_id` int(11) NOT NULL,
  PRIMARY KEY (`ic_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
