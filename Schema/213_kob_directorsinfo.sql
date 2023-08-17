CREATE TABLE IF NOT EXISTS `kob_directorsinfo` (
  `info_id` int(11) NOT NULL AUTO_INCREMENT,
  `ass_seq_id` int(11) NOT NULL,
  `ass_seq_txt` varchar(15) NOT NULL,
  `director_name` varchar(250) NOT NULL,
  `director_pan` varchar(20) NOT NULL,
  `pin_no` int(11) NOT NULL,
  `address` text NOT NULL,
  `client_id` int(11) NOT NULL,
  `assignment_id` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` date NOT NULL,
  `approved` int(11) NOT NULL COMMENT '1=approved,0=not approved',
  `approved_by` int(11) NOT NULL,
  `approved_on` date NOT NULL,
  `doer_user` int(11) NOT NULL,
  `approver_user` int(11) NOT NULL,
  PRIMARY KEY (`info_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
