CREATE TABLE IF NOT EXISTS `tbl_rating` (
  `model_id` int(11) NOT NULL AUTO_INCREMENT,
  `asignment_id` int(11) NOT NULL,
  `model_name` varchar(250) DEFAULT NULL,
  `chapter_id` int(50) DEFAULT NULL,
  `status` tinyint(4) DEFAULT '1',
  `createdDtm` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`model_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
