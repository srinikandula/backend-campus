CREATE TABLE IF NOT EXISTS `common_dc_files` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `attr_id` int(11) NOT NULL,
  `dc_name` varchar(255) DEFAULT NULL,
  `element_excel` int(11) DEFAULT NULL,
  `element_name` varchar(255) DEFAULT NULL,
  `map_file_col` varchar(255) DEFAULT NULL,
  `classify_col` text,
  `risk_col` text,
  `is_csv` tinyint(4) DEFAULT NULL,
  `is_deleted` enum('N','Y') NOT NULL,
  `assign_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
