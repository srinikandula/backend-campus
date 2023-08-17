CREATE TABLE IF NOT EXISTS `applicability_log` (
  `alid` int(11) NOT NULL AUTO_INCREMENT,
  `audit_response_id` int(11) NOT NULL,
  `assignment_id` int(11) NOT NULL,
  `client_id` int(11) NOT NULL,
  `domain_id` int(11) NOT NULL,
  `scheduler_id` int(11) NOT NULL,
  `tool_id` varchar(250) NOT NULL,
  `toolkit_id` int(11) NOT NULL,
  `existing_applicability` int(11) NOT NULL,
  `new_applicability` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL,
  PRIMARY KEY (`alid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
