CREATE TABLE IF NOT EXISTS `permissions_group_activities` (
  `pg_per_id` int(11) NOT NULL AUTO_INCREMENT,
  `bact_id` int(11) NOT NULL,
  `pgid` int(11) NOT NULL,
  `status` int(1) NOT NULL DEFAULT '1' COMMENT '1,0',
  `created_by` int(11) NOT NULL,	
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`pg_per_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
