CREATE TABLE IF NOT EXISTS `workingpaper_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(250) NOT NULL,
  `status` varchar(15) NOT NULL COMMENT 'active,inactive	',
  `attached_by` int(11) NOT NULL,
  `created_date` datetime NOT NULL,
  `domain` int(11) NOT NULL,
  `master_id` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
