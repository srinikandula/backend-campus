CREATE TABLE IF NOT EXISTS `master_variable_template` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(250) NOT NULL,
  `status` varchar(10) NOT NULL,
  `created_by` int(10) NOT NULL,
  `created_on` datetime NOT NULL,
  `updated_on` datetime NOT NULL,
  `updated_by` int(10) NOT NULL,
  `description` text NOT NULL,
  `variable_type` int(2) NOT NULL COMMENT '1-Int,2-Decimal,3-Date,4-Varchar',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
