CREATE TABLE IF NOT EXISTS `audit_impact_program` (
  `impact_id` int(11) NOT NULL AUTO_INCREMENT,
  `impact_name` varchar(255) NOT NULL,
  `impact_status` varchar(255) NOT NULL,
  `assignment_id` int(11) NOT NULL,
  `domain_id` int(11) NOT NULL,
  `ai_type` varchar(100) NOT NULL COMMENT 'type1,type2,type3,type4,type5 . type1,type5-Aggregate input. type2 : directi/p. type3: breakup details. type4: calculations on calc. 2,3,4,5: programmers. user can create only type 1',
  `ai_type_ds` varchar(100) NOT NULL,
  `sync_id` int(11) NOT NULL,
  `sync_on` datetime NOT NULL,
  `master_id` int(11) NOT NULL,
  PRIMARY KEY (`impact_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
