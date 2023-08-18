CREATE TABLE IF NOT EXISTS `dockets_details` (
  `docsid` int(11) NOT NULL AUTO_INCREMENT,
  `clientid` int(11) NOT NULL,
  `doc_catid` int(11) NOT NULL,
  `volume_no` varchar(5) NOT NULL,
  `where_to_be_stored` int(11) NOT NULL,
  `when_taken_out` date NOT NULL,
  `who_had_taken` int(11) NOT NULL COMMENT 'userid',
  `purpose_of_taking` varchar(200) NOT NULL,
  `who_had_given` int(11) NOT NULL COMMENT 'userid',
  `created_by` int(11) NOT NULL COMMENT 'userid',
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `due_date` date NOT NULL,
  `domain` int(11) NOT NULL,
  `status_approval` int(11) NOT NULL DEFAULT '0' COMMENT '0=no status,1=requested,2=Cancelled request,3=issued,4=returned,5=confirmed return,6=cancelled confirmation return,7- Approved Request(After 1 )''',
  `movement_ref_id` int(11) NOT NULL,
  `fno` varchar(50) NOT NULL,
  PRIMARY KEY (`docsid`),
  KEY `doc_catid` (`doc_catid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;