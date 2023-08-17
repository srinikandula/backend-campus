CREATE TABLE IF NOT EXISTS `fsr_leases` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) NOT NULL,
  `particulars_id` int(11) NOT NULL,
  `particulars_name` varchar(250) NOT NULL,
  `dt_of_entry` date NOT NULL,
  `amount` decimal(20,2) NOT NULL DEFAULT '0.00',
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_by` int(11) NOT NULL,
  `updated_on` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
