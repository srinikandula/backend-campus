CREATE TABLE IF NOT EXISTS `i_forms` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `structure_name` varchar(50) NOT NULL,
  `func_name` varchar(50) NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name_unique` (`name`),
  UNIQUE KEY `structure_unique` (`structure_name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
