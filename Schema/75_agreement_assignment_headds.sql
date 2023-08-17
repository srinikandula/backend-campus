CREATE TABLE IF NOT EXISTS `agreement_assignment_headds` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(250) NOT NULL,
  `description` text NOT NULL,
  `agreement_type` enum('Agreement','Workflow','Sop','AccountingPolicies','StatutoryReply','Others1','Others2') DEFAULT NULL,
  `assignment_id` int(11) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `client_id` int(11) NOT NULL,
  `domain_id` int(11) NOT NULL,
  `borrow_from` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
