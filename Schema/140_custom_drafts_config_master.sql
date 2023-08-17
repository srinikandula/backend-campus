CREATE TABLE IF NOT EXISTS `custom_drafts_config_master` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) DEFAULT NULL,
  `draft_id` int(11) DEFAULT NULL,
  `draft_name` varchar(255) DEFAULT NULL,
  `description` text,
  `description_ids` text,
  `order_id` int(11) DEFAULT NULL,
  `linkchk` tinyint(4) DEFAULT NULL,
  `master_id` int(11) NOT NULL DEFAULT '0',
  `master_parent_id` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
