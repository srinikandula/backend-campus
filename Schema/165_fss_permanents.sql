CREATE TABLE IF NOT EXISTS `fss_permanents` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `permanent_name` varchar(100) NOT NULL,
  `polarity` tinyint(4) DEFAULT '1',
  `bs_pl` int(11) DEFAULT NULL COMMENT '1=bs,2=pl',
  `major` int(11) DEFAULT NULL,
  `minor` int(11) DEFAULT NULL COMMENT 'FK:fss_minors',
  `created_by` int(11) DEFAULT NULL,
  `created_on` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
