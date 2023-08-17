CREATE TABLE IF NOT EXISTS `common_dc_nosql_main` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `tablename` varchar(255) DEFAULT NULL,
  `assignment_id` int(11) NOT NULL,
  `location_id` int(11) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `status` enum('Pending','Completed','Errors') DEFAULT NULL,
  `s3Object` varchar(255) DEFAULT NULL,
  `mapcol` varchar(255) DEFAULT NULL,
  `element_excel` int(11) DEFAULT NULL,
  `element_name` varchar(255) DEFAULT NULL,
  `is_deleted` enum('N','Y') NOT NULL,
  `client_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
