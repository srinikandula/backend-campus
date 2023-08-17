CREATE TABLE IF NOT EXISTS `execution_attachments3` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `attachment_name` varchar(250) NOT NULL,
  `did` int(11) NOT NULL,
  `qs_id` int(11) NOT NULL,
  `qn_id` int(11) NOT NULL,
  `assignment_id` int(11) NOT NULL,
  `created_date` date NOT NULL,
  `attachment_id` int(11) NOT NULL,
  `value_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
