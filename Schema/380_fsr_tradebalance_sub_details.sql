CREATE TABLE IF NOT EXISTS `fsr_tradebalance_sub_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assignment_id` int(11) NOT NULL,
  `client_id` int(11) NOT NULL,
  `gl_tb_id` int(11) NOT NULL,
  `gl_name` varchar(100) NOT NULL,
  `item_date` date NOT NULL,
  `due_date` date DEFAULT NULL,
  `related_party_type` varchar(100) NOT NULL,
  `secure` varchar(100) NOT NULL,
  `dispute` varchar(100) NOT NULL,
  `current_type` varchar(100) NOT NULL,
  `amount` float(11,2) NOT NULL,
  `item_type` varchar(10) NOT NULL,
  `status` int(1) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
