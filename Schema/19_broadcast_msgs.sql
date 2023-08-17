CREATE TABLE IF NOT EXISTS `broadcast_msgs` (
  `bm_id` int(11) NOT NULL AUTO_INCREMENT,
  `msg` text NOT NULL,
  `order_no` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `status` int(1) NOT NULL COMMENT '0-inactive,1-active',
  PRIMARY KEY (`bm_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
