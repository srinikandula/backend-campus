CREATE TABLE IF NOT EXISTS `question` (
  `qid` int(11) NOT NULL AUTO_INCREMENT,
  `q_short` varchar(255) NOT NULL,
  `q_long` text NOT NULL,
  `report_id` int(11) NOT NULL,
  `status` varchar(255) NOT NULL,
  `sync_id` int(11) NOT NULL,
  `sync_on` datetime NOT NULL,
  `master_id` int(11) NOT NULL,
  `master_parent_id` int(11) NOT NULL,
  PRIMARY KEY (`qid`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
