CREATE TABLE IF NOT EXISTS `enquiry_form` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(250) NOT NULL,
  `phone` varchar(250) NOT NULL,
  `referred_by` varchar(250) NOT NULL,
  `email` varchar(250) NOT NULL,
  `name_of_office` varchar(250) NOT NULL,
  `address` text NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
