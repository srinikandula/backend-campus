CREATE TABLE IF NOT EXISTS `fsr_annex6_form_3cd_section_43b` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) NOT NULL,
  `client_id` int(11) NOT NULL,
  `nature_provision` text NOT NULL,
  `total_expenditure` float(11,2) NOT NULL,
  `liability_incurred_previos_year` float(11,2) NOT NULL,
  `amount_before_filing_income` float(11,2) NOT NULL,
  `date_payment` date NOT NULL,
  `unpaid_till_filing_return` float(11,2) NOT NULL,
  `disallowance_ass_year` float(11,2) NOT NULL,
  `status` int(1) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `assignment_id` (`assignment_id`),
  KEY `client_id` (`client_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
