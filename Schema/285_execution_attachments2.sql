CREATE TABLE IF NOT EXISTS `execution_attachments2` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `attachment_name` varchar(250) DEFAULT NULL,
  `qs_id` int(11) DEFAULT NULL,
  `qn_id` int(11) DEFAULT NULL,
  `assignment_id` int(11) DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  `attachment_id` int(11) DEFAULT NULL,
  `value_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
