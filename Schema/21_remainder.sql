CREATE TABLE IF NOT EXISTS `remainder` (
  `remainder_id` int(11) NOT NULL AUTO_INCREMENT,
  `remainder_name` varchar(250) DEFAULT NULL,
  `description` text,
  `client` varchar(250) DEFAULT NULL,
  `expiry_type` varchar(20) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `next_expiry_remainder` date DEFAULT NULL,
  `created_by` int(11) DEFAULT NULL,
  `created_on` date DEFAULT NULL,
  `domain` int(11) DEFAULT NULL,
  `radio_status` int(11) DEFAULT NULL COMMENT '1=public,2=private',
  `notify_before_days` tinyint(4) DEFAULT '0',
  `reminder_sent_date` date DEFAULT NULL,
  PRIMARY KEY (`remainder_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
