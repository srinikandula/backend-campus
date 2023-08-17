CREATE TABLE IF NOT EXISTS `analytics_search_history` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `temp_code` varchar(255) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `title` text,
  `subject_ids` longtext,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `sr_no` int(11) DEFAULT NULL,
  `fieldtype` varchar(255) DEFAULT NULL,
  `total` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
