CREATE TABLE IF NOT EXISTS `impact_coa` (
  `ia_id` int(11) NOT NULL AUTO_INCREMENT,
  `impact_id` int(11) NOT NULL COMMENT 'inspectiondata_impact id',
  `coa_list_custom_id` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ia_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
