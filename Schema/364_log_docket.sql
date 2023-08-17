CREATE TABLE IF NOT EXISTS `log_docket` (
  `log_id` int(11) NOT NULL AUTO_INCREMENT,
  `doc_id` int(11) NOT NULL,
  `purpose_of_taking` text NOT NULL,
  `who_had_taken` int(11) NOT NULL,
  `due_date` date NOT NULL,
  `created_on` date NOT NULL,
  `status_approval` int(11) NOT NULL COMMENT '1=approve,0=notapproved',
  `approved_by` int(11) NOT NULL,
  `aproved_on` date NOT NULL,
  PRIMARY KEY (`log_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
