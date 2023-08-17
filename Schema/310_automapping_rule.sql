CREATE TABLE IF NOT EXISTS `automapping_rule` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_id` int(11) NOT NULL,
  `client_id` int(11) NOT NULL,
  `rule_type` enum('1','2','3') NOT NULL,
  `maptype` tinyint(4) NOT NULL COMMENT '0-unmapped,1-mapped, 2 =both',
  `group_id` int(11) DEFAULT NULL,
  `level_type` tinyint(4) DEFAULT NULL COMMENT '1=>directchildren,2=>recursively all children',
  `field` varchar(255) DEFAULT NULL,
  `operator_id` varchar(255) DEFAULT NULL,
  `value` varchar(255) DEFAULT NULL,
  `fss_id` int(11) DEFAULT NULL,
  `polarity` tinyint(4) DEFAULT NULL COMMENT '0 =>positive,1 =>negative',
  `result_fss_id` int(11) DEFAULT NULL,
  `created_by` int(11) DEFAULT NULL,
  `created_on` datetime DEFAULT NULL,
  `status` tinyint(4) DEFAULT NULL COMMENT '0=>inactive,1=>active',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
