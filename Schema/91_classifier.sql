CREATE TABLE IF NOT EXISTS `classifier` (
  `classifierid` bigint(20) NOT NULL AUTO_INCREMENT,
  `classifier_name` varchar(250) NOT NULL,
  `classifier_description` text NOT NULL,
  `classifier_creationdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `domain_id` int(11) NOT NULL,
  `status` int(1) NOT NULL DEFAULT '1',
  `master_id` int(11) NOT NULL,
  PRIMARY KEY (`classifierid`),
  UNIQUE KEY `name_unique` (`classifier_name`),
  UNIQUE KEY `classifier_name` (`classifier_name`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
