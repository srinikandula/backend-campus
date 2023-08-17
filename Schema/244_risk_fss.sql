CREATE TABLE IF NOT EXISTS `risk_fss` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `activity_risk_id` int(11) NOT NULL,
  `fss_list_id` int(11) NOT NULL,
  `creation_dt` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
