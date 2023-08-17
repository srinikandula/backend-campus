CREATE TABLE IF NOT EXISTS `custom_drafts_master` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `draft_name` varchar(250) NOT NULL,
  `chapter_id` int(11) NOT NULL,
  `status` varchar(10) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL,
  `updated_on` datetime NOT NULL,
  `updated_by` int(11) NOT NULL,
  `master_id` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
