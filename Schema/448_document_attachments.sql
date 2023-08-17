CREATE TABLE IF NOT EXISTS `document_attachments` (
  `attachid` int(11) NOT NULL AUTO_INCREMENT,
  `attachfilename` varchar(250) NOT NULL,
  `documentid` bigint(20) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) NOT NULL COMMENT 'userid',
  PRIMARY KEY (`attachid`),
  KEY `documentid` (`documentid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
