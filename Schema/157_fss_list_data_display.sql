CREATE TABLE IF NOT EXISTS `fss_list_data_display` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `display_status` enum('default','custom') NOT NULL,
  `client_id` bigint(20) DEFAULT NULL,
  `last_updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
