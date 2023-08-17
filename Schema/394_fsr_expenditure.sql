CREATE TABLE IF NOT EXISTS `fsr_expenditure` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(5) NOT NULL,
  `client_id` int(5) NOT NULL,
  `particulars` text NOT NULL,
  `currency` varchar(20) NOT NULL,
  `amount` varchar(50) NOT NULL,
  `current_year` decimal(20,2) NOT NULL,
  `previous_year` decimal(20,2) NOT NULL,
  `created_by` int(5) NOT NULL,
  `created_on` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
