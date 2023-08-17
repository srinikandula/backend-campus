CREATE TABLE IF NOT EXISTS `fsr_audit_variable_answer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `variable_id` int(11) NOT NULL,
  `client_id` int(11) NOT NULL,
  `assignment_id` int(11) NOT NULL,
  `answer` varchar(255) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL,
  `status` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
