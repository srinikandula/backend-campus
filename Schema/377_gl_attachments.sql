CREATE TABLE IF NOT EXISTS `gl_attachments` (
  `g_id` int(11) NOT NULL AUTO_INCREMENT,
  `atachment_name` varchar(250) NOT NULL,
  `gl_id` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL,
  PRIMARY KEY (`g_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
