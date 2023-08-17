CREATE TABLE IF NOT EXISTS `dockets_movement` (
  `docketsmovid` int(11) NOT NULL AUTO_INCREMENT,
  `docketid` int(11) NOT NULL,
  `where_to_be_stored` varchar(50) NOT NULL,
  `when_taken_out` date NOT NULL,
  `due_date` date NOT NULL,
  `who_had_taken` int(11) NOT NULL COMMENT 'userid',
  `purpose_of_taking` varchar(200) NOT NULL,
  `who_had_given` int(11) NOT NULL COMMENT 'userid',
  `when_replaced` date NOT NULL,
  `created_by` int(11) NOT NULL COMMENT 'userid',
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `approved_by` int(11) NOT NULL,
  `aproved_on` date NOT NULL,
  `requested_to` int(11) NOT NULL,
  `cancel_request_date` date NOT NULL,
  `cancel_confirm_return` date NOT NULL,
  `status_approval` int(11) NOT NULL DEFAULT '0',
  `issued_by` int(11) NOT NULL,
  `issued_on` date NOT NULL,
  `return_date` date NOT NULL,
  PRIMARY KEY (`docketsmovid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
