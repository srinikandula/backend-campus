CREATE TABLE IF NOT EXISTS `assignment_type` (
  `astype_id` int(11) NOT NULL AUTO_INCREMENT,
  `astype_name` varchar(100) NOT NULL,
  `is_active` tinyint(4) NOT NULL DEFAULT '1' COMMENT '1=Active',
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`astype_id`),
  UNIQUE KEY `astype_name` (`astype_name`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
