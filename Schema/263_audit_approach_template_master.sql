CREATE TABLE IF NOT EXISTS `audit_approach_template_master` (
  `approach_id` int(11) NOT NULL AUTO_INCREMENT,
  `template_name` varchar(250) NOT NULL,
  `assertion_id` int(11) NOT NULL,
  `potential_risk_identified` int(11) NOT NULL,
  `potential_misstatement` int(11) NOT NULL,
  `tool_id` int(11) NOT NULL COMMENT 'configurations_type_id',
  `tool_kit_id` int(11) DEFAULT NULL,
  `tool_kit_name` varchar(250) DEFAULT NULL,
  `audit_approach` text NOT NULL,
  `domain_id` int(11) NOT NULL,
  `status` int(2) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`approach_id`),
  UNIQUE KEY `template_name` (`template_name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
