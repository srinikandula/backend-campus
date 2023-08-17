CREATE TABLE IF NOT EXISTS `lead_sheet` (
  `lsid` int(11) NOT NULL AUTO_INCREMENT,
  `client_id` int(11) NOT NULL,
  `domain_id` int(11) NOT NULL,
  `assignment_id` int(11) NOT NULL,
  `procedure_id` int(11) NOT NULL,
  `chapter_id` int(11) NOT NULL,
  `item_id` int(11) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `doer` int(11) NOT NULL,
  `approved_on` date NOT NULL,
  `approver` int(11) NOT NULL,
  `status` int(2) NOT NULL,
  `amount` double(18,2) NOT NULL,
  PRIMARY KEY (`lsid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
