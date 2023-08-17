CREATE TABLE IF NOT EXISTS `document_details` (
  `document_id` int(11) NOT NULL AUTO_INCREMENT,
  `docid` int(11) NOT NULL,
  `document_name` varchar(150) NOT NULL,
  `dmcategory_id` int(11) NOT NULL,
  `year` int(11) NOT NULL,
  `month` int(11) NOT NULL,
  `from_page` int(11) NOT NULL,
  `to_page` int(11) NOT NULL,
  `created_by` int(11) NOT NULL COMMENT 'userid',
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `status` varchar(20) NOT NULL DEFAULT 'pending',
  `client` int(11) NOT NULL,
  `domain` int(11) NOT NULL,
  PRIMARY KEY (`document_id`),
  UNIQUE KEY `docid` (`docid`,`document_name`,`dmcategory_id`),
  KEY `dmid` (`docid`),
  KEY `dmcategory_id` (`dmcategory_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
