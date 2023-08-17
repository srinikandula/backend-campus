CREATE TABLE IF NOT EXISTS `audit_responses` (
  `arid` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) NOT NULL,
  `client_id` int(11) NOT NULL,
  `domain_id` int(11) NOT NULL,
  `response_from_type_value_id` int(11) NOT NULL,
  `response_by` int(11) NOT NULL,
  `response_on` datetime NOT NULL,
  `response_from_type` int(11) NOT NULL COMMENT '1-userfinding',
  `status` int(1) NOT NULL COMMENT '0- Not Concluded, 1- Concluded',
  `error_exists` int(1) NOT NULL,
  `off_pervasive` int(1) NOT NULL COMMENT '1-one-off\r\n2-pervasive ',
  `remarks` text NOT NULL,
  `source_assignment` int(11) DEFAULT NULL,
  PRIMARY KEY (`arid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
