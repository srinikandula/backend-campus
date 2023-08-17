CREATE TABLE IF NOT EXISTS `branch_offices` (
  `bo_id` int(11) NOT NULL AUTO_INCREMENT,
  `bo_name` varchar(250) NOT NULL,
  `created_by` int(11) NOT NULL,
  `creation_dt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `domain_id` int(11) NOT NULL,
  PRIMARY KEY (`bo_id`),
  UNIQUE KEY `bo_name` (`bo_name`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
