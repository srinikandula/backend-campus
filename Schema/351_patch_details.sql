CREATE TABLE IF NOT EXISTS `patch_details` (
  `pdid` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(11) NOT NULL,
  `pfid` int(11) NOT NULL,
  `patch_content_type` varchar(250) NOT NULL,
  `patch_file_name` varchar(250) NOT NULL,
  `patch_rec_id` int(11) NOT NULL,
  `patch_updated_dt` int(11) NOT NULL,
  PRIMARY KEY (`pdid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
