CREATE TABLE IF NOT EXISTS `d_forms` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `structure_name` varchar(50) NOT NULL,
  `func_name` varchar(50) NOT NULL,
  `dsname` varchar(150) NOT NULL,
  `status` int(11) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
