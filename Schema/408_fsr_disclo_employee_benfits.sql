CREATE TABLE IF NOT EXISTS `fsr_disclo_employee_benfits` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) NOT NULL,
  `client_id` int(11) NOT NULL,
  `category_name` text NOT NULL,
  `particular_name` varchar(255) DEFAULT NULL,
  `item_name` text NOT NULL,
  `previous_year_values` decimal(11,2) DEFAULT NULL,
  `current_year_values` decimal(10,2) DEFAULT NULL,
  `year` varchar(250) DEFAULT NULL,
  `status` tinyint(1) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `assignment_id` (`assignment_id`),
  KEY `client_id` (`client_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
