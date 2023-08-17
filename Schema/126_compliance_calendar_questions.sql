CREATE TABLE IF NOT EXISTS `compliance_calendar_questions` (
  `qid` int(11) NOT NULL AUTO_INCREMENT,
  `q_short` varchar(250) NOT NULL,
  `q_long` text NOT NULL,
  `report_id` int(11) NOT NULL,
  `status` varchar(10) NOT NULL,
  `sync_id` int(11) NOT NULL,
  `sync_on` datetime NOT NULL,
  `periodicity` int(11) NOT NULL,
  `res_non_compilance` varchar(250) NOT NULL,
  `master_id` int(11) NOT NULL,
  `master_parent_id` int(11) NOT NULL,
  `recurring_month` varchar(100) DEFAULT NULL,
  `recurring_month_day` int(11) DEFAULT NULL,
  PRIMARY KEY (`qid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
