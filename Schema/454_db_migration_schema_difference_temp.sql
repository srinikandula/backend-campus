CREATE TABLE IF NOT EXISTS `db_migration_schema_difference_temp` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `field_name` varchar(255) DEFAULT NULL,
  `field_type` varchar(255) DEFAULT NULL,
  `isnull` varchar(255) DEFAULT NULL,
  `primary` varchar(255) DEFAULT NULL,
  `default` varchar(255) DEFAULT NULL,
  `ai` varchar(255) DEFAULT NULL,
  `table_name` varchar(255) DEFAULT NULL,
  `_merge` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
