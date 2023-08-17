CREATE TABLE IF NOT EXISTS `class` (
  `classid` int(11) NOT NULL AUTO_INCREMENT,
  `class_name` varchar(250) NOT NULL,
  `class_desc` text NOT NULL,
  `classifier_id` bigint(20) NOT NULL,
  `parent_class_id` int(11) NOT NULL,
  `class_level` int(11) NOT NULL,
  `class_code` bigint(20) NOT NULL,
  `level_count` int(11) NOT NULL,
  `class_creationdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `master_id` int(11) NOT NULL,
  `master_parent_id` int(11) NOT NULL,
  PRIMARY KEY (`classid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
