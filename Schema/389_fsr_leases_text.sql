CREATE TABLE IF NOT EXISTS `fsr_leases_text` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `lease_text` text NOT NULL,
  `assignment_id` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_by` int(11) NOT NULL,
  `updated_on` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
