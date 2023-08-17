CREATE TABLE IF NOT EXISTS `agreement_template_risks` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `agreement_node_id` int(11) NOT NULL,
  `description` text NOT NULL,
  `creationdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `short_name` varchar(250) NOT NULL,
  `created_by` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `activity_id` (`agreement_node_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
