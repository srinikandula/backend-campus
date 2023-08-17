CREATE TABLE IF NOT EXISTS `fss_heads` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fss_head_name` varchar(100) NOT NULL,
  `description` text,
  `created_by` int(11) DEFAULT NULL,
  `created_on` datetime DEFAULT NULL,
  `domain_id` int(11) DEFAULT NULL,
  `is_active` int(1) NOT NULL DEFAULT '1' COMMENT '1=active,0=inactive',
  PRIMARY KEY (`id`),
  UNIQUE KEY `fss_head_name` (`fss_head_name`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
