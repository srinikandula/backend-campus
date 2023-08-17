CREATE TABLE IF NOT EXISTS `da_logs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `analytics_search_name` varchar(250) NOT NULL,
  `element_id` int(11) DEFAULT NULL,
  `no_of_records` int(11) DEFAULT NULL,
  `search_by` int(11) DEFAULT NULL,
  `search_on` datetime DEFAULT CURRENT_TIMESTAMP,
  `query_text` text,
  `subject_ids` text COMMENT 'concatenation of subject ids',
  `action_type` varchar(250) DEFAULT NULL,
  `action_text` text,
  `action_subject_ids` text,
  `action_no_of_records` int(11) DEFAULT NULL,
  `assignment_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
