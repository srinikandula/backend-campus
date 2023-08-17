CREATE TABLE IF NOT EXISTS `kob_key_transactional` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ass_seq_id` int(11) NOT NULL,
  `ass_seq_txt` varchar(15) NOT NULL,
  `counter_party` varchar(250) NOT NULL,
  `date_agreement` date NOT NULL,
  `effective_till` varchar(50) NOT NULL,
  `sig_provision_agreement` text NOT NULL,
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
