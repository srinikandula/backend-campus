CREATE TABLE IF NOT EXISTS `fsr_disclo_consumption_of_rmcsp` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) NOT NULL,
  `client_id` int(11) NOT NULL,
  `particulars` text NOT NULL,
  `perc_current_year` float(11,2) NOT NULL,
  `value_current_year` float(11,2) NOT NULL,
  `perc_previous_year` float(11,2) NOT NULL,
  `value_previous_year` float(11,2) NOT NULL,
  `status` tinyint(1) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
