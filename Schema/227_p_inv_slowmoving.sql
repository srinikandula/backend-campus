CREATE TABLE IF NOT EXISTS `p_inv_slowmoving` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) NOT NULL,
  `name_of_the_inventory` varchar(250) NOT NULL,
  `uom` varchar(50) NOT NULL,
  `qty` double(8,2) NOT NULL,
  `val` double(15,2) NOT NULL,
  `slow_moving_days` int(5) NOT NULL,
  `provision_held` double(12,2) NOT NULL,
  `reasons_for_slow_movement` text NOT NULL,
  `req_of_additional_provision` text NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_on` datetime NOT NULL,
  `updated_by` int(11) NOT NULL,
  `doer_user` int(11) NOT NULL,
  `approver_user` int(11) NOT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
