CREATE TABLE IF NOT EXISTS `patch_author` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `author_name` varchar(250) NOT NULL,
  `author_phone` int(11) NOT NULL,
  `author_email` varchar(250) NOT NULL,
  `author_address` text NOT NULL,	
  `author_pic` varchar(250) NOT NULL COMMENT 'path',
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `domain_id` int(11) NOT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;