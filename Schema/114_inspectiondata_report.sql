CREATE TABLE IF NOT EXISTS `inspectiondata_report` (
  `idrep_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `inspdata_id` int(11) NOT NULL,
  `rep_id` int(11) NOT NULL,
  `que_id` int(11) NOT NULL,
  `audit_response_id` int(11) NOT NULL,
  PRIMARY KEY (`idrep_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
