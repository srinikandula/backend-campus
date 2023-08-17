CREATE TABLE IF NOT EXISTS `standard_text_template_config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `standard_text_template_id` int(11) NOT NULL,
  `standard_text_id` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `is_deleted` enum('N') DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `standard_text_template_id` (`standard_text_template_id`,`standard_text_id`,`is_deleted`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
