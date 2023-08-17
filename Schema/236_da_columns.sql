CREATE TABLE IF NOT EXISTS `da_columns` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `da_collection_id` int(11) NOT NULL,
  `csv_col` varchar(255) DEFAULT NULL,
  `db_col` varchar(255) DEFAULT NULL,
  `col_created_by` enum('System','User') DEFAULT NULL,
  `is_mapped` tinyint(4) DEFAULT NULL,
  `data_type` varchar(255) DEFAULT NULL COMMENT 'string, int,float etc.',
  `col_type` varchar(255) DEFAULT NULL COMMENT 'formulae,data etc.',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
