CREATE TABLE IF NOT EXISTS `document_category` (
  `dmcatid` int(11) NOT NULL AUTO_INCREMENT,
  `dmcategory_name` varchar(150) NOT NULL,
  `Docket_Category` int(11) NOT NULL,
  `dmcategory_status` varchar(20) NOT NULL DEFAULT 'active' COMMENT 'active,inactive',
  `created_by` int(11) NOT NULL COMMENT 'userid',
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `domain` int(11) NOT NULL,
  PRIMARY KEY (`dmcatid`),
  UNIQUE KEY `dmcategory_name` (`dmcategory_name`,`domain`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
