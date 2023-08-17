dockets_categoryCREATE TABLE IF NOT EXISTS `dms_uploads` (
  `dms_uid` int(11) NOT NULL AUTO_INCREMENT,
  `uploading_id` int(5) NOT NULL,
  `file_name` varchar(250) NOT NULL,
  `created_by` int(5) NOT NULL,
  `created_on` date NOT NULL,
  PRIMARY KEY (`dms_uid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
