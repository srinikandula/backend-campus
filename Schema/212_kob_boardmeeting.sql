CREATE TABLE IF NOT EXISTS `kob_boardmeeting` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ass_seq_id` int(11) NOT NULL,
  `ass_seq_txt` varchar(15) NOT NULL,
  `meeting_name` varchar(250) NOT NULL,
  `meeting_date` date NOT NULL,
  `minutes` varchar(5) NOT NULL,
  `audit_area_impacted` varchar(250) NOT NULL,
  `attachment_id` int(11) DEFAULT NULL,
  `client_id` int(11) NOT NULL,
  `assignment_id` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` date NOT NULL,
  `approved` tinyint(4) NOT NULL,
  `approved_by` int(11) NOT NULL,
  `doer_user` int(11) NOT NULL,
  `approver_user` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
