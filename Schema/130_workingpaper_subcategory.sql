CREATE TABLE IF NOT EXISTS `workingpaper_subcategory` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `subcategory_name` varchar(250) NOT NULL,
  `category` int(11) NOT NULL,
  `attached_by` int(11) NOT NULL,
  `status` int(11) NOT NULL COMMENT '1=active,0=inactive	',
  `created_date` datetime NOT NULL,
  `domain` int(11) NOT NULL,
  `master_id` int(11) NOT NULL DEFAULT '0',
  `master_parent_id` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
