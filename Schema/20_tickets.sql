CREATE TABLE IF NOT EXISTS `tickets` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `input_url` varchar(255) DEFAULT NULL,
  `page_url` varchar(255) NOT NULL,
  `resolved` tinyint(4) NOT NULL,
  `description` text,
  `domain` varchar(255) DEFAULT NULL,
  `ip_address` varchar(255) DEFAULT NULL,
  `person_name` varchar(255) DEFAULT NULL,
  `person_email` varchar(255) DEFAULT NULL,
  `ticket_id` int(11) NOT NULL DEFAULT '0',
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `ticket_no` varchar(100) DEFAULT NULL,
  `ticket_status` int(3) DEFAULT '3',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
