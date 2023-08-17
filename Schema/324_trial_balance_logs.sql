CREATE TABLE IF NOT EXISTS `trial_balance_logs` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `gl_name` varchar(200) NOT NULL,
  `gl_id` int(5) DEFAULT NULL,
  `location_name` varchar(50) DEFAULT 'General',
  `location_id` int(5) DEFAULT NULL,
  `opening_amount` double(20,2) DEFAULT NULL,
  `debit_amount` double(20,2) DEFAULT NULL,
  `credit_amount` double(20,2) DEFAULT NULL,
  `net_amount` double(20,2) DEFAULT NULL,
  `created_by` int(5) DEFAULT NULL,
  `created_on` datetime DEFAULT CURRENT_TIMESTAMP,
  `client_id` int(5) DEFAULT NULL,
  `assignment_id` int(5) DEFAULT NULL,
  `domain_id` int(5) DEFAULT NULL,
  `batch_no` int(5) DEFAULT NULL,
  `batch_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)	
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
