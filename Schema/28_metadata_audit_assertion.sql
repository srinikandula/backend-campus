DROP TABLE IF EXISTS `audit_assertion`;

CREATE TABLE IF NOT EXISTS `audit_assertion` (
  `assertion_id` int(11) NOT NULL AUTO_INCREMENT,
  `assertion_name` varchar(255) NOT NULL,
  `assertion_status` varchar(255) NOT NULL,
  `domain_id` int(11) NOT NULL,
  `master_id` int(11) NOT NULL,
  PRIMARY KEY (`assertion_id`)
) ENGINE=MyISAM AUTO_INCREMENT=77 DEFAULT CHARSET=latin1;


INSERT INTO `audit_assertion` (`assertion_id`, `assertion_name`, `assertion_status`, `domain_id`, `master_id`) VALUES
(1, 'Existence/Occurence', 'active', 1, 0),
(2, 'Completeness', 'active', 1, 0),
(4, 'Rights & Obligations', 'active', 1, 0),
(5, 'Valuation or Allocation', 'active', 1, 0),
(6, 'Presentation & Disclosure', 'active', 1, 0),
(8, 'AC_Accuracy', 'active', 2, 0),
(9, 'AC_Validity', 'active', 2, 0),
(10, 'Ac_Restricted Access', 'active', 2, 0),
(12, 'Fs_Occurance', 'active', 2, 0),
(13, 'FS_Existence', 'active', 2, 0),
(15, 'FS_Valuation', 'active', 2, 0),
(16, 'DS_disclosure', 'active', 2, 0);
COMMIT;
