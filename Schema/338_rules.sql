CREATE TABLE IF NOT EXISTS `rules` (
  `rule_id` int(11) NOT NULL AUTO_INCREMENT,
  `rule_name` varchar(250) NOT NULL,
  `description` text NOT NULL,
  `element_id` int(11) NOT NULL,
  `assignment_id` int(11) NOT NULL,
  `domain_id` int(11) NOT NULL,
  `client_id` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `creation_dt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `master_id` int(11) NOT NULL,
  PRIMARY KEY (`rule_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
