CREATE TABLE IF NOT EXISTS `userwork_performance` (
  `perfid` int(11) NOT NULL AUTO_INCREMENT,
  `ref_planid` int(11) NOT NULL,
  `description` text,
  `time_spent_in_hrs` float(5,2) NOT NULL,
  `clientid` int(11) NOT NULL,
  `taskid` int(11) NOT NULL,
  `locid` int(11) NOT NULL,
  `perfdt` date NOT NULL,
  `userid` int(11) NOT NULL,
  `status` int(11) NOT NULL COMMENT '0-notapproved,1-approved',
  `approvedby` int(11) NOT NULL,
  `value` double(10,2) NOT NULL,
  `entereddt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `record_status` varchar(10) NOT NULL DEFAULT 'active',
  `domain` int(11) NOT NULL,
  `performance_given_by` int(11) NOT NULL,
  `attachment_id` int(10) NOT NULL,
  PRIMARY KEY (`perfid`),
  KEY `perfdt` (`perfdt`),
  KEY `userid` (`userid`),
  KEY `ref_planid` (`ref_planid`),
  KEY `taskid` (`taskid`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
