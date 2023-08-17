CREATE TABLE IF NOT EXISTS `book_size` (
  `booksize_id` int(11) NOT NULL AUTO_INCREMENT,
  `length` int(11) NOT NULL,
  `breadth` int(11) NOT NULL,
  `size` varchar(100) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `status` varchar(20) NOT NULL,
  `domain` int(11) NOT NULL,
  PRIMARY KEY (`booksize_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
