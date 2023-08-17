CREATE TABLE IF NOT EXISTS `guidance_notes` (
  `guidance_notes_id` int(11) NOT NULL AUTO_INCREMENT,
  `guidance_notes_name` varchar(250) NOT NULL,
  `guidance_notes_description` text NOT NULL,
  `creationdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `master_id` int(11) NOT NULL,
  PRIMARY KEY (`guidance_notes_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
