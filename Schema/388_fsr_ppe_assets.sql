CREATE TABLE IF NOT EXISTS `fsr_ppe_assets` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) NOT NULL,
  `client_id` int(11) NOT NULL,
  `item_name` text,
  `itact_category_id` int(3) DEFAULT NULL COMMENT 'FK: fsr_itact_category',
  `status` tinyint(1) DEFAULT '1',
  `created_by` int(11) DEFAULT NULL,
  `created_on` datetime NOT NULL,
  `dep_percentage` float(11,2) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `assignment_id` (`assignment_id`),
  KEY `client_id` (`client_id`),
  KEY `category_id` (`itact_category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
