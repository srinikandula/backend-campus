CREATE TABLE IF NOT EXISTS `common_dc_jsonsql_main` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `trail_balance_table` varchar(255) DEFAULT NULL,
  `groups_table` varchar(255) DEFAULT NULL,
  `db_table` varchar(255) DEFAULT NULL,
  `assignment_id` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `status` enum('Pending','Completed','Errors') DEFAULT NULL,
  `s3Object` varchar(255) DEFAULT NULL,
  `mapcol` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
