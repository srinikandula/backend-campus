CREATE TABLE IF NOT EXISTS `p_rev_leadsheet` (
  `plid` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) NOT NULL,
  `export_of_services` double(10,2) NOT NULL,
  `export_of_goods` double(10,2) NOT NULL,
  `total_exports` double(15,2) NOT NULL,
  `sale_of_goods` double(10,2) NOT NULL,
  `sale_of_services` double(10,2) NOT NULL,
  `sub_total` double(15,2) NOT NULL,
  `other_operational_income` double(15,2) NOT NULL,
  `non_operational_income` double(15,2) NOT NULL,
  `grand_total` double(18,2) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_on` datetime NOT NULL,
  `updated_by` int(11) NOT NULL,
  `approver_user` int(11) NOT NULL,
  `doer_user` int(11) NOT NULL,
  PRIMARY KEY (`plid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
