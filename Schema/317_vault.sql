CREATE TABLE IF NOT EXISTS `vault` (
  `vault_id` int(11) NOT NULL AUTO_INCREMENT,
  `vault_name` varchar(250) NOT NULL,
  `description` text NOT NULL,
  `client` varchar(100) NOT NULL,
  `userid` varchar(50) NOT NULL,
  `user_password` varchar(50) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` date NOT NULL,
  `domain` int(11) NOT NULL,
  `otp` varchar(10) NOT NULL,
  `q1` varchar(250) NOT NULL,
  `q2` varchar(250) NOT NULL,
  `q3` varchar(250) NOT NULL,
  `a1` varchar(250) NOT NULL,
  `a2` varchar(250) NOT NULL,
  `a3` varchar(250) NOT NULL,
  `radio_status` int(11) NOT NULL COMMENT '1=public,2=private',
  PRIMARY KEY (`vault_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;