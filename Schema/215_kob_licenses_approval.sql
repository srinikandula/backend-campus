CREATE TABLE IF NOT EXISTS `kob_licenses_approval` (
  `lia_id` int(11) NOT NULL AUTO_INCREMENT,
  `ass_seq_id` int(11) NOT NULL,
  `ass_seq_txt` varchar(15) NOT NULL,
  `name_licenses` varchar(250) NOT NULL,
  `issue_authority` varchar(250) NOT NULL,
  `issued_on` date NOT NULL,
  `expire_on` date NOT NULL,
  `attachment` int(11) DEFAULT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` date NOT NULL,
  `client_id` int(11) NOT NULL,
  `assignment_id` int(11) NOT NULL,
  `approved` tinyint(4) NOT NULL,
  `approved_by` int(11) NOT NULL,
  `doer_user` int(11) NOT NULL,
  `approver_user` int(11) NOT NULL,
  PRIMARY KEY (`lia_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
