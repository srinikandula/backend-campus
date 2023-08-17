CREATE TABLE IF NOT EXISTS `assignment_impact_values` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) DEFAULT NULL,
  `impact_id` int(11) DEFAULT NULL,
  `impact_value` varchar(255) DEFAULT NULL,
  `is_deleted` int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

