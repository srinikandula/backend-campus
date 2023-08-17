CREATE TABLE IF NOT EXISTS `compliance_calendar_schedule` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `question_id` int(11) DEFAULT NULL COMMENT 'Foreign Key : compliance_calendar_questions',
  `timeline_id` int(11) DEFAULT NULL COMMENT 'Foreign Key : timeline',
  `is_applicable` int(1) NOT NULL DEFAULT '1' COMMENT '1-applicable, 2- not applicable',
  `applicable_day` int(2) NOT NULL DEFAULT '1' COMMENT '1- 31 days no allowed',
  `created_by` int(11) DEFAULT NULL,
  `created_on` datetime DEFAULT CURRENT_TIMESTAMP,
  `master_id` int(11) DEFAULT NULL,
  `master_parent_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
