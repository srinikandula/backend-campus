CREATE TABLE IF NOT EXISTS `gl_rectification` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `transaction_id` bigint(20) NOT NULL,
  `classification_type` enum('FSS','COA','COS') NOT NULL,
  `assignment_id` int(11) NOT NULL,
  `client_id` int(11) NOT NULL,
  `amount` decimal(15,2) NOT NULL,
  `gl_id` int(11) NOT NULL,
  `mode` enum('FROM','TO') NOT NULL,
  `location_id` bigint(20) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `gl_trail_balance_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
