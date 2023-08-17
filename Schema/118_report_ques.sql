CREATE TABLE IF NOT EXISTS `report_ques` (
  `rqid` int(11) NOT NULL AUTO_INCREMENT,
  `cid` int(11) NOT NULL,
  `pid` int(11) NOT NULL,
  `rid` int(11) NOT NULL,
  `qid` int(11) NOT NULL,
  `ansid` int(11) NOT NULL,
  `desc` text NOT NULL,
  `attachment` varchar(255) DEFAULT NULL,
  `approver_user` int(11) NOT NULL,
  `doer_user` int(11) NOT NULL,
  `rep_status` int(11) NOT NULL COMMENT '1=not initiated,2-submitted,3-rejected,4-approved	',
  `given_dt` date NOT NULL,
  `approved_dt` date NOT NULL,
  `approved_by` int(11) NOT NULL,
  PRIMARY KEY (`rqid`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
