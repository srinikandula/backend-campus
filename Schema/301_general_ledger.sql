CREATE TABLE IF NOT EXISTS `general_ledger` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) NOT NULL,
  `company_id` int(11) NOT NULL,
  `name` varchar(200) NOT NULL,
  `general_ledger_name` varchar(200) NOT NULL,
  `subledger` int(11) NOT NULL DEFAULT '0',
  `type_subledger` varchar(200) NOT NULL DEFAULT '0',
  `created_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`),
  UNIQUE KEY `general_ledger_name` (`general_ledger_name`),
  UNIQUE KEY `assignment_id` (`assignment_id`,`general_ledger_name`,`subledger`,`type_subledger`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
