CREATE TABLE IF NOT EXISTS `assignment_scheduler_user_permissions` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `scheduler_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `role` varchar(50) NOT NULL COMMENT 'Approver,Doer',
  `role_type` varchar(50) NOT NULL COMMENT 'Default,Others',
  `status` int(11) NOT NULL COMMENT '0-inactive,1-active',
  `created_by` int(11) NOT NULL,
  `creation_dt` date NOT NULL,
  `hrs` varchar(5) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  KEY `scheduler_id` (`scheduler_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
