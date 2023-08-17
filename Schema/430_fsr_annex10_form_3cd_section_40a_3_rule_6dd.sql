CREATE TABLE IF NOT EXISTS `fsr_annex10_form_3cd_section_40a_3_rule_6dd` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) NOT NULL,
  `client_id` int(11) NOT NULL,
  `date_payment` date DEFAULT NULL,
  `nature_of_payment` text,
  `amount` float(11,2) NOT NULL,
  `name_pan` text,
  `status` tinyint(1) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `assignment_id` (`assignment_id`),
  KEY `client_id` (`client_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
