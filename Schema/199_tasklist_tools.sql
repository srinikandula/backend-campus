CREATE TABLE IF NOT EXISTS `tasklist_tools` (
  `ttid` int(11) NOT NULL AUTO_INCREMENT,
  `tasklist_id` int(11) NOT NULL,
  `tooltype_id` int(11) NOT NULL COMMENT 'Checklists-1, Questionnaire-2',
  `toolkit_id` int(11) NOT NULL,
  `toolkit_name` varchar(250) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_dt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `master_id` int(11) NOT NULL,
  PRIMARY KEY (`ttid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
