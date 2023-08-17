CREATE TABLE IF NOT EXISTS `checklists` (
  `checklist_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `checklist_name` varchar(250) NOT NULL,
  `checklist_description` text NOT NULL,
  `chapter_id` int(11) NOT NULL,
  `creationdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `domain_id` int(11) NOT NULL,
  `master_id` int(11) NOT NULL,
  `atype` int(11) NOT NULL COMMENT '1-,2-,3-',
  `check_ques` int(1) NOT NULL DEFAULT '1' COMMENT '1,Checklist; 2- Questionnaire',
  `status` int(1) NOT NULL DEFAULT '1',
  `area_audit_id` int(5) NOT NULL,
  PRIMARY KEY (`checklist_id`),
  UNIQUE KEY `chklistname_unique` (`checklist_name`,`check_ques`,`atype`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
