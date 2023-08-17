CREATE TABLE IF NOT EXISTS `annexure` (
  `annexure_id` int(11) NOT NULL AUTO_INCREMENT,
  `annexure_name` varchar(250) NOT NULL,
  `annexure_description` text NOT NULL,
  `chapter_id` int(11) NOT NULL,
  `creationdt` datetime NOT NULL,
  `domain_id` int(11) NOT NULL,
  `master_id` int(11) NOT NULL DEFAULT '0',
  `client_id` int(11) NOT NULL,
  `assignment_id` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `status` int(1) NOT NULL DEFAULT '1',
  `area_audit_id` int(5) NOT NULL,
  PRIMARY KEY (`annexure_id`),
  UNIQUE KEY `annexure_name` (`annexure_name`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
