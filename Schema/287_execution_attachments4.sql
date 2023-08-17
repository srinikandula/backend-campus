CREATE TABLE IF NOT EXISTS `execution_attachments4` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `attachment_name` varchar(250) NOT NULL,
  `qs_id` int(11) NOT NULL,
  `qn_id` int(11) NOT NULL,
  `assignment_id` int(11) NOT NULL,
  `created_date` date NOT NULL,
  `attachment_id` int(11) NOT NULL,
  `value_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
