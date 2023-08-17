CREATE TABLE IF NOT EXISTS `fsr_disclo_quantitative_inventory_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) NOT NULL,
  `client_id` int(11) NOT NULL,
  `category_name` text NOT NULL,
  `particulars` text NOT NULL,
  `particulars_id` int(11) NOT NULL,
  `current_year_kgs` float(11,2) NOT NULL,
  `amount_in_current_year` float(11,2) NOT NULL,
  `previous_year_kgs` float(11,2) NOT NULL,
  `amount_in_previous_year` float(11,2) NOT NULL,
  `status` tinyint(1) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
