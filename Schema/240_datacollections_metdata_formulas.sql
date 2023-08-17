CREATE TABLE IF NOT EXISTS `datacollections_metdata_formulas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) NOT NULL,
  `ash_id` int(11) NOT NULL,
  `formula` text,
  `status` tinyint(1) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `assignment_id` (`assignment_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
