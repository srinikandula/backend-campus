CREATE TABLE IF NOT EXISTS `agreement_template_controls` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `control_name` varchar(150) NOT NULL,
  `type` varchar(150) NOT NULL,
  `freq` varchar(150) NOT NULL,
  `automation` varchar(150) NOT NULL,
  `description` text NOT NULL,
  `creationdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) NOT NULL,
  `agreement_node_id` int(11) NOT NULL,
  `is_active` tinyint(4) NOT NULL DEFAULT '1' COMMENT '1=Active,\r\n0=Inactive',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
