CREATE TABLE IF NOT EXISTS `ledger_scrutiny_reports` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `report_name` varchar(255) NOT NULL,
  `assignment_id` int(11) NOT NULL,
  `table_name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `report_name` (`report_name`,`assignment_id`),
  UNIQUE KEY `report_name_2` (`report_name`,`assignment_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
