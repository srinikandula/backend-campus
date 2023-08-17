CREATE TABLE IF NOT EXISTS `elements_classifier_config_values` (
  `eccv_id` int(11) NOT NULL AUTO_INCREMENT,
  `elt_config_id` int(11) NOT NULL,
  `element_id` int(11) NOT NULL,
  `subject_id` int(11) NOT NULL,
  `classifier_id` int(11) NOT NULL,
  `assignment_id` int(11) NOT NULL,
  `classifier_option_id` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `creation_dt` datetime NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1' COMMENT '0-inactive,1-active',
  PRIMARY KEY (`eccv_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
