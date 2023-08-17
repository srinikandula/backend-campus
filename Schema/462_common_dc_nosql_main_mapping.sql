CREATE TABLE IF NOT EXISTS `common_dc_nosql_main_mapping` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `common_dc_files_id` int(11) NOT NULL,
  `csv_col` varchar(255) NOT NULL,
  `db_col` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
