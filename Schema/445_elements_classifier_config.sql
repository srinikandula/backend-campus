CREATE TABLE IF NOT EXISTS `elements_classifier_config` (
  `ecid` int(11) NOT NULL AUTO_INCREMENT,
  `element_id` int(11) NOT NULL,
  `assignment_id` int(11) NOT NULL,
  `classifier_id` int(11) NOT NULL,
  `creation_dt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `status` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `approved_by` int(11) NOT NULL,
  `approved_dt` date NOT NULL,
  PRIMARY KEY (`ecid`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
