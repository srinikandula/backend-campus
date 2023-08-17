CREATE TABLE IF NOT EXISTS `asset_movement` (
  `log_id` int(11) NOT NULL AUTO_INCREMENT,
  `asset_id` int(11) NOT NULL,
  `purpose_of_taking` text NOT NULL,
  `who_had_taken` int(11) NOT NULL,
  `due_date` date NOT NULL,
  `created_on` date NOT NULL,
  `status_approval` int(11) NOT NULL COMMENT '1=approve,0=notapproved	',
  `approved_by` int(11) NOT NULL,
  `aproved_on` date NOT NULL,
  `return_date` date NOT NULL,
  `cancel_request_date` date NOT NULL,
  `cancel_confirm_return` date NOT NULL,
  `requested_to` int(11) NOT NULL,
  `issued_by` int(11) NOT NULL,
  `issued_on` date NOT NULL,
  PRIMARY KEY (`log_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
