CREATE TABLE IF NOT EXISTS `cluster_subcategory` (
  `sub_id` int(11) NOT NULL AUTO_INCREMENT,
  `subcategory_name` varchar(250) NOT NULL,
  `category` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `status` varchar(15) NOT NULL COMMENT 'active,inactive	',
  `created_date` date NOT NULL,
  `domain` int(11) NOT NULL,
  `master_id` int(11) NOT NULL,
  `master_parent_id` int(11) NOT NULL,
  PRIMARY KEY (`sub_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
