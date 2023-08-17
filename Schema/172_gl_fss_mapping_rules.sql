CREATE TABLE IF NOT EXISTS `gl_fss_mapping_rules` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `client_id` int(11) NOT NULL,
  `rule_order` int(11) NOT NULL,
  `rule_type` enum('1','2','3','4','5') NOT NULL,
  `operator` enum('1','2','3') NOT NULL,
  `operator_value` varchar(255) NOT NULL,
  `fss_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
