CREATE TABLE IF NOT EXISTS `fsr_annex3_form_3cd` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) NOT NULL,
  `client_id` int(11) NOT NULL,
  `pertaining_to` varchar(100) NOT NULL,
  `amount_of_payment` float(11,2) NOT NULL,
  `nature_of_payment` text NOT NULL,
  `name_and_address_payee` text NOT NULL,
  `status` tinyint(1) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `assignment_id` (`assignment_id`),
  KEY `client_id` (`client_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
