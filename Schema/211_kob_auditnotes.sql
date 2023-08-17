CREATE TABLE IF NOT EXISTS `kob_auditnotes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `audit_note` text NOT NULL,
  `ref_id` int(11) NOT NULL,
  `ref_type` varchar(250) NOT NULL COMMENT 'reference types',
  `note_type` int(11) NOT NULL COMMENT '1-Permenant,2- Current',
  `client_id` int(11) NOT NULL,
  `assignment_id` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` date NOT NULL,
  `attachment_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
