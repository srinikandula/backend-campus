CREATE TABLE IF NOT EXISTS `sms_groups_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `groupid` int(11) NOT NULL,
  `phone_no` bigint(20) NOT NULL,
  `creationdt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `membername` varchar(150) NOT NULL,
  `membertype` varchar(150) NOT NULL COMMENT 'owner,accountant,contact',
  `membertypename` varchar(150) NOT NULL,
  `client_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
