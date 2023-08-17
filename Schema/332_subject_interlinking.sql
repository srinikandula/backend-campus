CREATE TABLE IF NOT EXISTS `subject_interlinking` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) NOT NULL,
  `parent_element_id` int(11) NOT NULL,
  `parent_subject_id` int(11) NOT NULL,
  `parent_subject_column_name` varchar(150) NOT NULL,
  `child_element_id` int(11) NOT NULL,
  `child_subject_id` int(11) NOT NULL,
  `child_subject_column_name` varchar(150) NOT NULL,
  `original` int(11) NOT NULL COMMENT '1- original,2 - duplicate',
  `remarks` text NOT NULL,
  `created_by` int(11) NOT NULL,
  `creation_dt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `parent_element_id` (`parent_element_id`,`parent_subject_id`,`child_element_id`,`child_subject_id`,`assignment_id`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
