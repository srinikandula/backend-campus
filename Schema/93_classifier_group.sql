CREATE TABLE IF NOT EXISTS `classifier_group` (
  `cgid` int(11) NOT NULL AUTO_INCREMENT,
  `group_name` varchar(250) NOT NULL,
  `classifier_head_id` int(11) NOT NULL,
  `list_type` int(11) NOT NULL DEFAULT '1' COMMENT '1-custom,2-all',
  `created_by` int(11) NOT NULL,
  `creation_dt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `master_id` int(11) NOT NULL,
  `master_parent_id` int(11) NOT NULL,
  PRIMARY KEY (`cgid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
