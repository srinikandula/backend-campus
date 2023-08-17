CREATE TABLE IF NOT EXISTS `fsr_disclo_shareholder_pattern` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `particular_id` int(11) DEFAULT NULL,
  `particular_name` varchar(255) DEFAULT NULL,
  `current_year_percentage` decimal(10,2) DEFAULT NULL,
  `previous_year_percentage` decimal(10,2) DEFAULT NULL,
  `previous_year_values` decimal(10,2) DEFAULT NULL,
  `current_year_values` decimal(10,2) DEFAULT NULL,
  `client_id` int(11) DEFAULT NULL,
  `assignment_id` int(11) DEFAULT NULL,
  `created_by` int(11) DEFAULT NULL,
  `created_on` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
