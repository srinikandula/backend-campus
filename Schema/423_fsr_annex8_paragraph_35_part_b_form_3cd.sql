CREATE TABLE IF NOT EXISTS `fsr_annex8_paragraph_35_part_b_form_3cd` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) DEFAULT NULL,
  `client_id` int(11) DEFAULT NULL,
  `category_name` varchar(100) DEFAULT NULL,
  `item_name` text NOT NULL,
  `qty_in_kgs_current_year` float(11,2) NOT NULL,
  `qty_in_kgs_prev_year` float(11,2) NOT NULL,
  `status` tinyint(1) NOT NULL,
  `created_by` int(11) DEFAULT NULL,
  `created_on` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `assignment_id` (`assignment_id`),
  KEY `client_id` (`client_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
