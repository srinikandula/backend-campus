CREATE TABLE IF NOT EXISTS `remittance_foreign` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `no_shareholders` int(11) NOT NULL,
  `no_equity` varchar(50) NOT NULL,
  `amount_foreign` varchar(50) NOT NULL,
  `year` int(11) NOT NULL,
  `client` int(11) NOT NULL,
  `assignment` int(11) NOT NULL,
  `domain` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_date` date NOT NULL,
  `updated_by` int(11) NOT NULL,
  `updated_on` date NOT NULL,
  `save_status` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
