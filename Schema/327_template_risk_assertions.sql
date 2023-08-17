CREATE TABLE IF NOT EXISTS `template_risk_assertions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `agreement_risk_id` int(11) NOT NULL,
  `assertion_id` int(11) NOT NULL,
  `creation_dt` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
