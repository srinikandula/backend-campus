CREATE TABLE IF NOT EXISTS `da_filters` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `common_dc_nosql_main_id` int(11) DEFAULT NULL,
  `condition_display` text,
  `condition_sql` text,
  `assignment_id` int(11) DEFAULT NULL,
  `new_column_name` varchar(255) DEFAULT NULL,
  `created_by` int(11) DEFAULT NULL,
  `records_count` int(11) DEFAULT NULL,
  `filter_num` int(11) NOT NULL DEFAULT '0',
  `orderby` text,
  `is_log` tinyint(4) DEFAULT NULL,
  `log_name` varchar(255) DEFAULT NULL,
  `search_category` varchar(255) DEFAULT NULL,
  `search_text` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
