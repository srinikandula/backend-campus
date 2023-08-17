CREATE TABLE IF NOT EXISTS `fsr_annex5_forming_form_3cd_section_43b` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nature_of_provision` text,
  `liability_preexisted_prev_year` float(11,2) NOT NULL,
  `amount_reversed_prev_year` float(11,2) NOT NULL,
  `amount_paid_prev_year` float(11,2) NOT NULL,
  `date_payment` date DEFAULT NULL,
  `allow_during_asset_year` float(11,2) NOT NULL,
  `assignment_id` int(11) NOT NULL,
  `client_id` int(11) NOT NULL,
  `status` tinyint(1) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `assignment_id` (`assignment_id`),
  KEY `client_id` (`client_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
