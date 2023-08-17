CREATE TABLE IF NOT EXISTS `fsr_disclo_earning_per_share` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `particular_id` int(11) DEFAULT NULL,
  `particular_name` varchar(255) DEFAULT NULL,
  `unit` varchar(255) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `previous_year_values` decimal(10,2) DEFAULT NULL,
  `current_year_values` decimal(10,2) DEFAULT NULL,
  `input_value` double(10,2) DEFAULT NULL,
  `client_id` int(11) DEFAULT NULL,
  `assignment_id` int(11) DEFAULT NULL,
  `created_by` int(11) DEFAULT NULL,
  `created_on` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
