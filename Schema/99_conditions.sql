CREATE TABLE IF NOT EXISTS `conditions` (
  `cond_id` int(11) NOT NULL AUTO_INCREMENT,
  `cond_name` varchar(250) NOT NULL,
  `cond_desc` text NOT NULL,
  `condition_type` int(11) NOT NULL,
  `fact_decision_id` int(11) NOT NULL,
  `operator_id` int(11) NOT NULL,
  `value_one` varchar(50) NOT NULL,
  `value_two` varchar(50) NOT NULL,
  `creationdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `domain_id` int(11) NOT NULL,
  `master_id` int(11) NOT NULL,
  PRIMARY KEY (`cond_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
