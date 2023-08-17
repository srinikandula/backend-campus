CREATE TABLE IF NOT EXISTS `control_assertions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `activity_control_id` int(11) NOT NULL,
  `assertion_id` int(11) NOT NULL,
  `creation_dt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
