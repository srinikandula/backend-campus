CREATE TABLE IF NOT EXISTS `company_fss_coa_css_settings` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cid` int(11) NOT NULL,
  `is_fss` tinyint(4) DEFAULT NULL,
  `is_coa` tinyint(4) DEFAULT NULL,
  `is_cos` tinyint(4) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
