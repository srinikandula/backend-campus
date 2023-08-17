CREATE TABLE IF NOT EXISTS `assignment_decision_values` (
  `adv_id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) NOT NULL,
  `decision_id` int(11) NOT NULL,
  `val` tinyint(1) NOT NULL,
  `val_given` varchar(15) NOT NULL DEFAULT 'No' COMMENT 'YES,NO,NA',
  `creationdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`adv_id`),
  KEY `assignment_id` (`assignment_id`),
  KEY `decision_id` (`decision_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
