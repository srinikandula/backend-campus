CREATE TABLE IF NOT EXISTS `fsr_disclo_expenditure_foreign_currency` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) NOT NULL,
  `client_id` int(11) NOT NULL,
  `particulars` text NOT NULL,
  `currency` text NOT NULL,
  `current_year` float(11,2) NOT NULL,
  `previous_year` float(11,2) NOT NULL,
  `status` tinyint(1) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
