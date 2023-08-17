CREATE TABLE IF NOT EXISTS `patches` (
  `patch_id` int(11) NOT NULL AUTO_INCREMENT,
  `patch_name` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `uploaded_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `uploaded_by` int(11) NOT NULL,
  `master_id` int(11) NOT NULL,
  PRIMARY KEY (`patch_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 
