CREATE TABLE IF NOT EXISTS `fsr_print_tables` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `table_category` varchar(100) DEFAULT NULL,
  `table_name` varchar(255) DEFAULT NULL,
  `view_name` varchar(255) DEFAULT NULL,
  `controller_path` text,
  `status` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
