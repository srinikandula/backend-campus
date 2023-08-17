CREATE TABLE IF NOT EXISTS `fsr_ppe_assets_movement` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) NOT NULL,
  `client_id` int(11) NOT NULL,
  `asset_id` int(11) DEFAULT NULL COMMENT 'FK:fsr_ppe_assets',
  `activity_type` tinytext COMMENT '1 Additions \r\n2 Disposals / Adjustments\r\n3 Acquistions through business combinations\r\n4 Change due to Revaluation',
  `amount` float(11,2) DEFAULT NULL,
  `movement_date` date DEFAULT NULL,
  `status` tinyint(1) DEFAULT '1',
  `created_by` int(11) DEFAULT NULL,
  `created_on` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `assignment_id` (`assignment_id`),
  KEY `client_id` (`client_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
