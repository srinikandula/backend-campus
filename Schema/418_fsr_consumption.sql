CREATE TABLE IF NOT EXISTS `fsr_consumption` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(5) NOT NULL,
  `client_id` int(5) NOT NULL,
  `particulars` varchar(100) NOT NULL,
  `percentage` int(5) NOT NULL,
  `current_year` decimal(20,2) NOT NULL,
  `previous_year` decimal(20,2) NOT NULL,
  `created_by` int(5) NOT NULL,
  `created_on` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
