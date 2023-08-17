CREATE TABLE IF NOT EXISTS `communication_multi_responses` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comm_id` int(11) NOT NULL,
  `response` text,
  `responded_by` int(11) DEFAULT NULL,
  `approved_status` varchar(255) DEFAULT NULL,
  `notes` text,
  `attach_id` int(11) DEFAULT NULL,
  `created_by` int(11) DEFAULT NULL,
  `created_on` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
