CREATE TABLE IF NOT EXISTS `question_detail` (
  `qdid` int(11) NOT NULL AUTO_INCREMENT,
  `qid` int(11) NOT NULL,
  `rating` varchar(255) NOT NULL,
  `desc` text NOT NULL,
  `status` varchar(255) NOT NULL,
  `sync_id` int(11) NOT NULL,
  `sync_on` datetime NOT NULL,
  `master_id` int(11) NOT NULL,
  `master_parent_id` int(11) NOT NULL,
  PRIMARY KEY (`qdid`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
