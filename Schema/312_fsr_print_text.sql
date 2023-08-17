CREATE TABLE IF NOT EXISTS `fsr_print_text` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) DEFAULT NULL,
  `client_id` int(11) DEFAULT NULL,
  `fss_text` text,
  `status` int(11) NOT NULL DEFAULT '1',
  `created_by` int(11) DEFAULT NULL,
  `created_on` date DEFAULT NULL,
  `updated_by` int(11) DEFAULT NULL,
  `updated_on` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `assignment_id` (`assignment_id`),
  KEY `client_id` (`client_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
