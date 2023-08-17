CREATE TABLE IF NOT EXISTS `fss_inputs` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `client_id` int(11) NOT NULL COMMENT 'FK:sms_clients',
  `assignment_id` int(11) NOT NULL COMMENT 'FK:sms_works',
  `location_id` bigint(20) NOT NULL COMMENT 'FK:loc_master',
  `transaction_id` bigint(20) NOT NULL,
  `gl_id` int(11) NOT NULL COMMENT 'FK:fss_chartofaccounts',
  `classification_type` enum('FSS','COA','COS') NOT NULL,
  `fss_assignment_level_id` int(11) DEFAULT NULL COMMENT 'FK:fss_assignment_level',
  `amount` decimal(15,2) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `client_id` (`client_id`),
  KEY `assignment_id` (`assignment_id`),
  KEY `location_id` (`location_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
