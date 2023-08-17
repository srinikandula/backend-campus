CREATE TABLE IF NOT EXISTS `patch_file_details` (
  `pfid` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(11) NOT NULL,
  `patch_file_type` varchar(250) NOT NULL,
  `patch_file_name` varchar(250) NOT NULL,
  `creation_dt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updation_dt` datetime NOT NULL,
  PRIMARY KEY (`pfid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
