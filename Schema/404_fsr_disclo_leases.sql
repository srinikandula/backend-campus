CREATE TABLE IF NOT EXISTS `fsr_disclo_leases` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) NOT NULL,
  `client_id` int(11) NOT NULL,
  `particulars` text NOT NULL,
  `particulars_id` int(11) NOT NULL,
  `amount_in_current_year` text NOT NULL,
  `amount_in_previous_year` text NOT NULL,
  `status` tinyint(1) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
