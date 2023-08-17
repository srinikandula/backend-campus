CREATE TABLE IF NOT EXISTS `mapping_fss_conditions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `client_id` int(11) NOT NULL,
  `rule_id` int(11) NOT NULL,
  `condition_filed` int(11) NOT NULL,
  `condition_type` int(11) NOT NULL,
  `condition_value` int(11) NOT NULL,
  `condition_link` int(11) NOT NULL,
  `condition_order` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `is_active` tinytext NOT NULL,
  PRIMARY KEY (`id`),
  KEY `client_id` (`client_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
