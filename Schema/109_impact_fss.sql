CREATE TABLE IF NOT EXISTS `impact_fss` (
  `ia_id` int(11) NOT NULL AUTO_INCREMENT,
  `impact_id` int(11) NOT NULL COMMENT 'inspectiondata_impact id',
  `fss_list_custom_id` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ia_id`),
  KEY `fss_list_custom_id` (`fss_list_custom_id`),
  KEY `impact_id` (`impact_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
