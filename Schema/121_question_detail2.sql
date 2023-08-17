CREATE TABLE IF NOT EXISTS `question_detail2` (
  `qdid` int(11) NOT NULL AUTO_INCREMENT,
  `qid` int(11) NOT NULL,
  `short` varchar(250) NOT NULL,
  `description` text NOT NULL,
  `company_name` varchar(250) NOT NULL,
  `period` varchar(250) NOT NULL,
  `type` int(11) NOT NULL COMMENT '7=Report',
  `typetool` varchar(200) NOT NULL,
  `tool_id` int(11) NOT NULL,
  `sync_id` int(11) NOT NULL,
  `sync_on` datetime NOT NULL,
  `master_id` int(11) NOT NULL,
  `master_parent_id` int(11) NOT NULL,
  PRIMARY KEY (`qdid`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
