CREATE TABLE IF NOT EXISTS `log_docket_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `docid` int(11) NOT NULL,
  `oldstoragelocation` int(11) NOT NULL,
  `newstoragelocation` int(11) NOT NULL,
  `who_has_changed` int(11) NOT NULL,
  `purpose` text NOT NULL,
  `created_on` date NOT NULL,
  `created_by` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
