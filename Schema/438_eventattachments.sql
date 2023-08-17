CREATE TABLE IF NOT EXISTS `eventattachments` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `event_id` int(11) NOT NULL,
  `att_type` varchar(50) NOT NULL COMMENT 'open,closing',
  `attachmentpath` varchar(250) NOT NULL,
  `attachment_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
