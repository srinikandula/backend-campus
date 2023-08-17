CREATE TABLE IF NOT EXISTS `asset_subcategory` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `subcategory_name` varchar(250) NOT NULL,
  `category` int(11) NOT NULL,
  `attached_by` int(11) NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1' COMMENT '1=active,0=inactive	',
  `created_date` datetime NOT NULL,
  `domain` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
