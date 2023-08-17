CREATE TABLE IF NOT EXISTS `fsr_disclo_earnings_in_foreign_exchange` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) NOT NULL,
  `client_id` int(11) NOT NULL,
  `particulars` text NOT NULL,
  `particulars_id` int(11) NOT NULL,
  `currency` text NOT NULL,
  `current_year` decimal(20,2) NOT NULL,
  `previous_year` decimal(20,2) NOT NULL,
  `status` tinyint(1) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
