CREATE TABLE IF NOT EXISTS `dockets_category` (
  `dcid` int(11) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(150) NOT NULL,
  `category_year` varchar(5) NOT NULL COMMENT 'yes,no',
  `category_month` varchar(5) NOT NULL COMMENT 'yes,no',
  `category_status` varchar(15) NOT NULL DEFAULT 'active',
  `created_by` int(11) NOT NULL COMMENT 'userid',
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `domain` int(11) NOT NULL,
  PRIMARY KEY (`dcid`),
  UNIQUE KEY `uniquecategory` (`category_name`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
