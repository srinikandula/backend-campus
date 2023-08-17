CREATE TABLE IF NOT EXISTS `fsr_disclo_shareholders_holding_morthan_five_perc` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) NOT NULL,
  `client_id` int(11) NOT NULL,
  `particulars` text NOT NULL,
  `no_of_share_current` float(11,2) NOT NULL,
  `value_in_rs_current` float(11,2) NOT NULL,
  `no_of_share_prev` float(11,2) NOT NULL,
  `value_in_rs_prev` float(11,2) NOT NULL,
  `status` tinyint(1) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `assignment_id` (`assignment_id`),
  KEY `client_id` (`client_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
