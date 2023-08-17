CREATE TABLE IF NOT EXISTS `fsr_annex4_persons_specified_section_40_2_b` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) DEFAULT NULL,
  `client_id` int(11) DEFAULT NULL,
  `payee_name` text,
  `nature_of_payment` text,
  `amount` float(11,2) NOT NULL,
  `nature_of_relationship` text,
  `status` tinyint(1) DEFAULT NULL,
  `created_by` int(11) DEFAULT NULL,
  `created_on` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `assignment_id` (`assignment_id`),
  KEY `client_id` (`client_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
