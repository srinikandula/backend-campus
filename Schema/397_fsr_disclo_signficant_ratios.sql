CREATE TABLE IF NOT EXISTS `fsr_disclo_signficant_ratios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) NOT NULL,
  `client_id` int(11) NOT NULL,
  `item_ratio_name` text NOT NULL,
  `item_numerator` text NOT NULL,
  `item_denominator` text NOT NULL,
  `date` date DEFAULT NULL,
  `value` float(11,2) NOT NULL,
  `previous_ratio` float(11,2) NOT NULL,
  `item_change_percenatage` float(2,2) NOT NULL,
  `explanation_morethan` text NOT NULL,
  `status` tinyint(1) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `assignment_id` (`assignment_id`),
  KEY `client_id` (`client_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
