CREATE TABLE IF NOT EXISTS `firm_policy` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firm_policy_name` varchar(250) NOT NULL,
  `status` varchar(10) DEFAULT NULL,
  `created_by` int(11) DEFAULT NULL,
  `created_on` datetime DEFAULT NULL,
  `updated_on` datetime DEFAULT NULL,
  `updated_by` int(11) DEFAULT NULL,
  `approver_user` int(11) DEFAULT NULL,
  `doer_user` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
