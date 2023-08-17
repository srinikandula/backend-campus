CREATE TABLE IF NOT EXISTS `classifier_group_list` (
  `cglid` int(11) NOT NULL AUTO_INCREMENT,
  `group_id` int(11) NOT NULL,
  `classifier_head_id` int(11) NOT NULL,
  `class_list_id` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `creation_dt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `master_id` int(11) NOT NULL,
  `master_parent_id` int(11) NOT NULL,
  PRIMARY KEY (`cglid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
