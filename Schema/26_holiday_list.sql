CREATE TABLE IF NOT EXISTS `holiday_list` (
  `holiday_id` int(11) NOT NULL AUTO_INCREMENT,
  `holiday_name` varchar(250) NOT NULL,
  `holiday_type` int(11) NOT NULL,
  `holiday_date` date NOT NULL,
  `holiday_hrs` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_date` date NOT NULL,
  `domain` int(11) NOT NULL,
  `close_status` int(11) NOT NULL COMMENT '1=closed,0=open',
  PRIMARY KEY (`holiday_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
