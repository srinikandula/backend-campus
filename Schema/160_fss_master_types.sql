CREATE TABLE IF NOT EXISTS `fss_master_types` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `sequence_no` int(11) NOT NULL,
  `polarity` tinyint(4) DEFAULT '1',
  `bp` int(11) DEFAULT NULL,
  `major` int(11) DEFAULT NULL,
  `child_ids` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
