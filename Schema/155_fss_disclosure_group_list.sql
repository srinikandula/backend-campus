CREATE TABLE IF NOT EXISTS `fss_disclosure_group_list` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `disclosure_name` varchar(250) DEFAULT NULL,
  `disclosure_id` int(11) DEFAULT NULL,
  `is_active` int(11) DEFAULT '1' COMMENT '1=active',
  `created_by` int(11) DEFAULT NULL,
  `created_on` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
