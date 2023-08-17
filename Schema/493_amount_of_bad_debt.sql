CREATE TABLE IF NOT EXISTS `amount_of_bad_debt` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) NOT NULL,
  `client_id` int(11) NOT NULL,
  `name_of_the_party` varchar(255) DEFAULT NULL,
  `total_recievable` varchar(255) DEFAULT NULL,
  `provision_available` varchar(255) DEFAULT NULL,
  `write_off_during_year` varchar(255) DEFAULT NULL,
  `security_available` varchar(255) DEFAULT NULL,
  `attachment` int(11) DEFAULT NULL,
  `status` int(255) NOT NULL DEFAULT '1',
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
