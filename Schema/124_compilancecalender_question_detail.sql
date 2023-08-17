CREATE TABLE IF NOT EXISTS `compilancecalender_question_detail` (
  `qdid` int(11) NOT NULL AUTO_INCREMENT,
  `qid` int(11) NOT NULL,
  `rating` varchar(250) NOT NULL,
  `desc` text NOT NULL,
  `status` varchar(10) NOT NULL DEFAULT 'active',
  `sync_id` int(11) NOT NULL,
  `sync_on` datetime NOT NULL,
  `master_id` int(11) NOT NULL,
  `master_parent_id` int(11) NOT NULL,
  PRIMARY KEY (`qdid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
