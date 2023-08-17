CREATE TABLE IF NOT EXISTS `controlcategory` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(250) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` date NOT NULL,
  `domain_id` int(11) NOT NULL,
  `master_id` int(11) NOT NULL,
  `status` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `category_name` (`category_name`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
