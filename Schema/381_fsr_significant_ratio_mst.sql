CREATE TABLE IF NOT EXISTS `fsr_significant_ratio_mst` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ratio_name` varchar(250) DEFAULT NULL,
  `assignment_id` int(11) DEFAULT NULL,
  `client_id` int(11) DEFAULT NULL,
  `item_numerator` varchar(255) DEFAULT NULL,
  `item_denominator` varchar(255) DEFAULT NULL,
  `previous_year_values` decimal(10,2) DEFAULT NULL,
  `current_year_values` decimal(10,2) DEFAULT NULL,
  `change_percentage` decimal(10,2) DEFAULT NULL,
  `exp_change_ratio` varchar(255) DEFAULT NULL,
  `value` int(11) DEFAULT NULL,
  `year` varchar(250) DEFAULT NULL,
  `created_by` int(11) DEFAULT NULL,
  `created_on` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
