CREATE TABLE IF NOT EXISTS `userwork_conversations` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `conversation_desc` text,
  `notes` text,
  `clientid` int(11) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  `ref_planid` int(11) DEFAULT NULL,
  `domain` int(11) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
