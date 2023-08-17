CREATE TABLE IF NOT EXISTS `fsr_annex9_paragarph_40_part_b_3cd` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) NOT NULL,
  `client_id` int(11) NOT NULL,
  `categoty_type` varchar(100) DEFAULT NULL,
  `particulars` text,
  `numerator` float(11,2) NOT NULL,
  `denominator` float(11,2) NOT NULL,
  `ratio` float(11,2) NOT NULL,
  `status` tinyint(1) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `assignment_id` (`assignment_id`),
  KEY `client_id` (`client_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
