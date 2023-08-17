CREATE TABLE IF NOT EXISTS `custom_audit_procedures` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(250) NOT NULL,
  `chapter_id` int(11) NOT NULL,
  `creationdt` datetime NOT NULL,
  `domain_id` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `status` int(1) NOT NULL DEFAULT '1',
  `area_audit_id` int(5) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
