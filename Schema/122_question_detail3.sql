CREATE TABLE IF NOT EXISTS `question_detail3` (
  `qdid` int(11) NOT NULL AUTO_INCREMENT,
  `qid` int(11) NOT NULL,
  `short` varchar(250) NOT NULL,
  `guidance_notes_name` varchar(250) NOT NULL,
  `reference` varchar(250) NOT NULL,
  `description` text NOT NULL,
  `status` varchar(6) NOT NULL,
  `sync_id` int(11) NOT NULL,
  `sync_on` datetime NOT NULL,
  `master_id` int(11) NOT NULL,
  `master_parent_id` int(11) NOT NULL,
  PRIMARY KEY (`qdid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
