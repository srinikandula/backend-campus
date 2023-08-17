CREATE TABLE IF NOT EXISTS `remainder_performance` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `reminder_id` int(11) DEFAULT NULL,
  `domain` int(11) NOT NULL DEFAULT '0',
  `performance_description` text,
  `performance_next_expiry_remainder` date DEFAULT NULL,
  `performance_notify_before_days` int(11) DEFAULT NULL,
  `performance_attachment` text,
  `created_on` datetime DEFAULT NULL,
  `created_by` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `reminder_id` (`reminder_id`),
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
