CREATE TABLE IF NOT EXISTS `bookmark` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bookmark` text NOT NULL,
  `note_id` int(5) NOT NULL,
  `note_url` varchar(250) NOT NULL,
  `cat_id` int(5) NOT NULL,
  `subcat_id` int(5) NOT NULL,
  `created_by` int(5) NOT NULL,
  `created_on` date NOT NULL,
  `updated_on` date NOT NULL,
  `table_name` varchar(250) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
