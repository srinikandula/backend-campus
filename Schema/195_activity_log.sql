CREATE TABLE IF NOT EXISTS `activity_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `entered_dt` date NOT NULL,
  `activity` varchar(250) NOT NULL,
  `info_name` varchar(250) NOT NULL,
  `info_id` int(11) NOT NULL,
  `entered_user` int(11) NOT NULL,
  `status` varchar(50) NOT NULL DEFAULT 'notapproved' COMMENT 'approved,notapproved',
  `creation_dt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
