CREATE TABLE IF NOT EXISTS `fss_threshold` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `c_id` int(11) NOT NULL,
  `round_off` enum('Thousands','Lakhs','Millions','Crores') DEFAULT NULL,
  `yoy` varchar(55) NOT NULL,
  `colour_style` int(11) NOT NULL,
  `sub_heading_style` int(11) NOT NULL,
  `current_year` int(11) NOT NULL,
  `item_by_parent` varchar(55) NOT NULL,
  `item_by_base` varchar(55) NOT NULL,
  `no_of_division` int(11) NOT NULL DEFAULT '0' COMMENT '0- single\r\n1- multiple',
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `c_id` (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
