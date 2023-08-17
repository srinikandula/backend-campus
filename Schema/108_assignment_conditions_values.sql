CREATE TABLE IF NOT EXISTS `assignment_conditions_values` (
  `acv_id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) NOT NULL,
  `cond_id` int(11) NOT NULL,
  `val` tinyint(1) NOT NULL,
  `val_given` varchar(20) NOT NULL DEFAULT 'No' COMMENT 'YES,NO,NA',
  `creationdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_by` int(11) NOT NULL,
  `updated_on` date NOT NULL,
  `approved_by` int(11) NOT NULL,
  `approved_on` date NOT NULL,
  `closed_by` int(11) NOT NULL,
  `closed_on` date NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1' COMMENT '1-created,2-approved,3-closed',
  PRIMARY KEY (`acv_id`),
  KEY `assignment_id` (`assignment_id`),
  KEY `cond_id` (`cond_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
