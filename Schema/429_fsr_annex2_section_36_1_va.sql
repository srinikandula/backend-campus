CREATE TABLE IF NOT EXISTS `fsr_annex2_section_36_1_va` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) DEFAULT NULL,
  `client_id` int(11) DEFAULT NULL,
  `nature_fund` text,
  `sum_recevied_employees` float(11,2) NOT NULL,
  `due_date_payment` date DEFAULT NULL,
  `actual_amount` float(11,2) NOT NULL,
  `actual_date` date DEFAULT NULL,
  `income` float(11,2) NOT NULL,
  `status` tinyint(1) DEFAULT NULL,
  `created_by` int(11) DEFAULT NULL,
  `created_on` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `assignment_id` (`assignment_id`),
  KEY `client_id` (`client_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
