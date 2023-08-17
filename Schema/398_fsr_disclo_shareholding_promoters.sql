CREATE TABLE IF NOT EXISTS `fsr_disclo_shareholding_promoters` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) NOT NULL,
  `client_id` int(11) NOT NULL,
  `promoter_name` text NOT NULL,
  `number_of_shares` float(11,2) NOT NULL,
  `total_shares_percentage` float(11,2) NOT NULL,
  `percentage_change_during_year` float(11,2) NOT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `assignment_id` (`assignment_id`),
  KEY `client_id` (`client_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
