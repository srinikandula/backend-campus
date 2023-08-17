CREATE TABLE IF NOT EXISTS `subscription_plans` (
  `splan_id` int(11) NOT NULL AUTO_INCREMENT,
  `splan_name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `splan_active_users` int(11) NOT NULL,
  `splan_shadow_users` int(11) NOT NULL,
  `splan_clients` int(11) NOT NULL,
  `duration_months` int(11) NOT NULL,
  `splan_file_size` int(11) NOT NULL,
  `splan_status` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`splan_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
