CREATE TABLE IF NOT EXISTS `task_score` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) NOT NULL,
  `entered_dt` datetime NOT NULL,
  `person_id` int(11) NOT NULL,
  `tasklistid` int(11) NOT NULL,
  `status` int(11) NOT NULL,
  `score` int(11) NOT NULL,
  `value` double(10,2) NOT NULL,
  `created_dt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `description` text NOT NULL,
  `attachment_path` varchar(250) NOT NULL,
  `attachment_id` int(11) NOT NULL,
  `updated_user` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `assignment_id` (`assignment_id`),
  KEY `value` (`value`),
  KEY `tasklistid` (`tasklistid`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
