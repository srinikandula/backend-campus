CREATE TABLE IF NOT EXISTS `da_collection` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `counts` int(11) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `tablename` varchar(255) DEFAULT NULL,
  `assignment_id` int(11) NOT NULL,
  `location_id` int(11) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `status` enum('Pending','Completed','Errors') DEFAULT NULL,
  `s3Object` varchar(255) DEFAULT NULL,
  `mapcol` varchar(255) DEFAULT NULL,
  `element_id` int(11) DEFAULT NULL,
  `element_name` varchar(255) DEFAULT NULL,
  `is_deleted` enum('N','Y','TB','DB') NOT NULL,
  `client_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
