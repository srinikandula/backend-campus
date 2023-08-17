CREATE TABLE IF NOT EXISTS `task_head` (
  `task_id` int(11) NOT NULL AUTO_INCREMENT,
  `task_name` varchar(250) NOT NULL,
  `comment` text NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL,
  `status` int(11) NOT NULL COMMENT '1=active,2=inactive',
  `status_approval` int(11) NOT NULL COMMENT '1=approved,2=not approved',
  `updated_on` datetime NOT NULL,
  `approved_by` int(11) NOT NULL,
  `approved_on` datetime NOT NULL,
  `orderid` int(11) NOT NULL,
  `type` int(11) NOT NULL COMMENT '	//1=undefined,2=defined',
  `domain_id` int(11) DEFAULT NULL,
  `master_id` int(11) NOT NULL,
  PRIMARY KEY (`task_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
