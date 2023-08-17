CREATE TABLE IF NOT EXISTS `sms_work_status` (
  `status_id` int(11) NOT NULL AUTO_INCREMENT,
  `status_name` varchar(50) NOT NULL,
  PRIMARY KEY (`status_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

INSERT INTO `sms_work_status` (`status_id`, `status_name`) VALUES
(1, 'Initiated'),
(2, 'Submitted for Approval'),
(3, 'Approved'),
(4, 'completed'),
(5, 'Closed');
COMMIT;
