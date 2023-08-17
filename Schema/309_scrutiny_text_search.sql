CREATE TABLE IF NOT EXISTS `scrutiny_text_search` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rule_name` varchar(255) NOT NULL,
  `dr_cr` enum('debit','credit','both','') DEFAULT NULL,
  `rule` text NOT NULL,
  `c_id` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
