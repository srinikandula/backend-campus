CREATE TABLE IF NOT EXISTS `fss_rectification` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `client_id` int(11) NOT NULL COMMENT 'FK:sms_clients',
  `assignment_id` int(11) NOT NULL COMMENT 'FK:sms_works',
  `location_id` bigint(20) NOT NULL COMMENT 'FK:loc_master',
  `transaction_id` bigint(20) NOT NULL,
  `amount` decimal(15,2) NOT NULL,
  `gl_id` int(11) NOT NULL COMMENT 'FK:fss_chartofaccounts',
  `mode` enum('FROM','TO') NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created_by` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `client_id` (`client_id`),
  KEY `assignment_id` (`assignment_id`),
  KEY `location_id` (`location_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
