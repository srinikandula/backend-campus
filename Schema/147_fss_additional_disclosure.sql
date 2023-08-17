CREATE TABLE IF NOT EXISTS `fss_additional_disclosure` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `disclosure_id` int(11) DEFAULT NULL,
  `fss_head_id` int(11) DEFAULT NULL,
  `fss_master_id` int(11) DEFAULT NULL,
  `is_active` tinyint(4) NOT NULL DEFAULT '1' COMMENT '1=Active',
  `created_by` int(11) DEFAULT NULL,
  `created_on` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
