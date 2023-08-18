CREATE TABLE IF NOT EXISTS `tasks_team_allocation` (
  `allocationid` int(11) NOT NULL AUTO_INCREMENT,
  `workid` int(11) NOT NULL,
  `tasklistid` int(11) NOT NULL,
  `toolsId` int(11) NOT NULL,
  `tools_tasklistid` bigint(20) NOT NULL,
  `doer_userid` int(11) NOT NULL,
  `approver_userid` int(11) NOT NULL,
  `createdby` int(11) NOT NULL,
  `createdusertype` varchar(15) NOT NULL,
  `creation_dt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `est_hrs` float(5,2) NOT NULL,
  `due_date` date NOT NULL,
  `task_status` int(11) NOT NULL COMMENT '(sms_work_status)1 initiated 2 pending 3 inprogress 4 completed 5 closed',
  `status_change_dt` datetime NOT NULL,
  `approver_teamuserrole` varchar(50) NOT NULL,
  `doer_teamuserrole` varchar(50) NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1' COMMENT 'active=1;inactive=0',
  `app_hrs` int(11) NOT NULL,
  `doer_hrs` int(11) NOT NULL,
  `startTime` datetime NOT NULL,
  `endTime` datetime NOT NULL,
  PRIMARY KEY (`allocationid`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;