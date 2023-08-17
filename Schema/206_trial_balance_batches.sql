CREATE TABLE IF NOT EXISTS `trial_balance_batches` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `tablename` varchar(255) DEFAULT NULL,
  `batch_name` enum('TB','DAYBOOK','OTHERS') DEFAULT NULL,
  `batch_id` int(11) DEFAULT NULL,
  `uploaded_by` int(11) NOT NULL,
  `uploaded_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `uploaded_type` int(2) NOT NULL COMMENT '1-accumulated,2-marginal',
  `assignment_id` int(11) NOT NULL,
  `location_id` int(11) DEFAULT NULL,
  `location_name` varchar(255) DEFAULT NULL,
  `gl_id` int(11) DEFAULT NULL,
  `gl_name` varchar(255) NOT NULL,
  `da_collection_id` int(11) NOT NULL,
  `is_mapped` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
