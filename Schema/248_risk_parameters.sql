CREATE TABLE IF NOT EXISTS `risk_parameters` (
  `rpid` int(11) NOT NULL AUTO_INCREMENT,
  `rpname` varchar(250) NOT NULL,
  `rpdesc` text NOT NULL,
  `creation_dt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `domain_id` int(11) NOT NULL,
  PRIMARY KEY (`rpid`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
