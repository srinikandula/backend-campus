CREATE TABLE IF NOT EXISTS `clusters_category` (
  `cat_id` int(11) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(250) NOT NULL,
  `status` varchar(15) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_date` date NOT NULL,
  `domain` int(11) NOT NULL,
  `master_id` int(11) NOT NULL,
  PRIMARY KEY (`cat_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
