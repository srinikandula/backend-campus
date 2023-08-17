CREATE TABLE IF NOT EXISTS `meetings` (
  `meeting_id` int(11) NOT NULL AUTO_INCREMENT,
  `meeting_name` varchar(250) NOT NULL,
  `description` text NOT NULL,
  `meeting_link` varchar(250) NOT NULL,
  `client_id` int(11) NOT NULL,
  `plannedstartdate` date NOT NULL,
  `plannedenddate` date NOT NULL,
  `plannedstarttime` varchar(50) NOT NULL,
  `plannedendtime` varchar(50) NOT NULL,
  `priority` varchar(15) NOT NULL,
  `value` varchar(50) NOT NULL,
  `createdby` int(11) NOT NULL,
  `meeting_head` int(11) NOT NULL,
  `users` text NOT NULL,
  `work_id` int(11) NOT NULL,
  `actual_starttime` varchar(30) NOT NULL,
  `actual_endtime` varchar(30) NOT NULL,
  `meeting_status` int(11) NOT NULL,
  `taskid` int(5) NOT NULL,
  PRIMARY KEY (`meeting_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
