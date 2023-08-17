CREATE TABLE IF NOT EXISTS `risk_rcm` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `activity_risk_id` int(11) NOT NULL,
  `risk_master_id` int(11) NOT NULL,
  `creation_dt` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
