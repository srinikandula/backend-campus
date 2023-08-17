CREATE TABLE IF NOT EXISTS `assets_attachments` (
  `a_id` int(11) NOT NULL AUTO_INCREMENT,
  `atachment_name` varchar(250) NOT NULL,
  `ass_id` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL,
  PRIMARY KEY (`a_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
