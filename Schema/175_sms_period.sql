CREATE TABLE IF NOT EXISTS `sms_period` (
  `period_id` int(11) NOT NULL AUTO_INCREMENT,
  `period_name` varchar(250) NOT NULL,
  `period_type` int(11) NOT NULL COMMENT '1-monthly,2-Quarterly,3-halfyearly,4-Yearly',
  `orders` int(11) NOT NULL,
  `after_period_id` int(11) NOT NULL,
  `period_status` varchar(10) NOT NULL,
  PRIMARY KEY (`period_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
