CREATE TABLE IF NOT EXISTS `leaves` (
  `leave_id` int(11) NOT NULL AUTO_INCREMENT,
  `type_leave` int(11) NOT NULL,
  `description` text NOT NULL,
  `startdate` date NOT NULL,
  `enddate` date NOT NULL,
  `starttime` varchar(50) NOT NULL,
  `endtime` varchar(50) NOT NULL,
  `head` int(11) NOT NULL,
  `user` int(11) NOT NULL,
  `createdby` int(11) NOT NULL,
  `approve_status` int(11) NOT NULL COMMENT '0= Pending,1=approve,\r\n2 = cancelled,3 = Rejecetd',
  `approve_reject_note` text,
  `sanction_from` date DEFAULT NULL,
  `sanction_to` date DEFAULT NULL,
  `extent_of_leave` tinyint(1) NOT NULL DEFAULT '0',
  `sanction_extent` tinyint(1) NOT NULL DEFAULT '0',
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`leave_id`),
  KEY `user` (`user`),
  KEY `head` (`head`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
