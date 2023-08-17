CREATE TABLE IF NOT EXISTS `custom_drafts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `draft_name` varchar(250) NOT NULL,
  `status` varchar(10) DEFAULT NULL,
  `created_by` int(11) DEFAULT NULL,
  `created_on` datetime DEFAULT NULL,
  `updated_on` datetime DEFAULT NULL,
  `updated_by` int(11) DEFAULT NULL,
  `assignment_id` int(11) DEFAULT NULL,
  `approver_user` int(11) DEFAULT NULL,
  `doer_user` int(11) DEFAULT NULL,
  `scheduler_id` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
