CREATE TABLE IF NOT EXISTS `activity_node_risks` (
  `anc_id` int(11) NOT NULL AUTO_INCREMENT,
  `client_id` int(11) NOT NULL,
  `domain_id` int(11) NOT NULL,
  `assignment_id` int(11) NOT NULL,
  `page_type` int(11) NOT NULL COMMENT '1-process,2-workflow,3-agreement,4-FSS,5-COA,6-COS',
  `page_type_id` int(11) NOT NULL,
  `risk_score` double(10,2) DEFAULT NULL,
  `open_risk_score` double(10,2) DEFAULT NULL,
  `control_score` double(10,2) DEFAULT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_by` int(11) NOT NULL,
  `updated_on` datetime NOT NULL,
  PRIMARY KEY (`anc_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
