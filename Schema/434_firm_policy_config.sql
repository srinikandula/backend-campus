CREATE TABLE IF NOT EXISTS `firm_policy_config` (
  `cdc_id` int(11) NOT NULL AUTO_INCREMENT,
  `d_type` int(11) DEFAULT NULL,
  `d_type_id` int(11) DEFAULT NULL,
  `order_id` int(11) DEFAULT NULL,
  `link_chk` int(11) DEFAULT NULL COMMENT '0-No,1-Yes',
  `doer_user` int(11) DEFAULT NULL,
  `approver_user` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL COMMENT '0-not approved,1-approved',
  `created_by` int(11) DEFAULT NULL,
  `creation_dt` datetime DEFAULT CURRENT_TIMESTAMP,
  `att_id` int(11) DEFAULT NULL,
  `firm_policy_id` int(11) DEFAULT NULL,
  `description` text,
  PRIMARY KEY (`cdc_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
