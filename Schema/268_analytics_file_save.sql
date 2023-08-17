CREATE TABLE IF NOT EXISTS `analytics_file_save` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dc_id` int(11) NOT NULL,
  `file_id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `criteria` longtext NOT NULL,
  `assignment_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
