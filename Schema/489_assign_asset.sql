CREATE TABLE IF NOT EXISTS `assign_asset` (
  `aa_id` int(11) NOT NULL AUTO_INCREMENT,
  `cid` int(11) NOT NULL,
  `pid` int(11) NOT NULL,
  `aa_name` varchar(255) NOT NULL,
  `aa_owner_id` int(11) NOT NULL,
  `aa_value` varchar(255) NOT NULL,
  PRIMARY KEY (`aa_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
