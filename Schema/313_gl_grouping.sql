CREATE TABLE IF NOT EXISTS `gl_grouping` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `company_id` int(11) DEFAULT NULL,
  `gl_group_name` varchar(255) DEFAULT NULL,
  `gl_group_id` int(11) DEFAULT NULL,
  `gl_group_parent_name` varchar(255) DEFAULT NULL,
  `domain_id` int(11) DEFAULT NULL,
  `created_by` int(11) DEFAULT NULL,
  `created_on` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `company_id` (`company_id`,`gl_group_name`,`gl_group_parent_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
