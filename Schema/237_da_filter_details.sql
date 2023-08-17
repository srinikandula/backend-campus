CREATE TABLE IF NOT EXISTS `da_filter_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `da_filters_id` int(11) DEFAULT NULL,
  `da_collection_id` int(11) DEFAULT NULL,
  `field_id` int(11) DEFAULT NULL,
  `operator` varchar(100) DEFAULT NULL,
  `value1` varchar(255) DEFAULT NULL,
  `value2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
