CREATE TABLE IF NOT EXISTS `employee_benefits` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `client` int(11) NOT NULL,
  `assignment` int(11) NOT NULL,
  `domain` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_date` date NOT NULL,
  `updated_by` int(11) NOT NULL,
  `updated_on` date NOT NULL,
  `discount_rate` varchar(50) NOT NULL,
  `salary_escalation` varchar(50) NOT NULL,
  `present_value_beginining_year` varchar(50) NOT NULL,
  `interest_cost` varchar(50) NOT NULL,
  `current_service_cost` varchar(50) NOT NULL,
  `benefits_paid` varchar(50) NOT NULL,
  `actuarial` varchar(50) NOT NULL,
  `present_value_end_year` varchar(50) NOT NULL,
  `fair_value_beginning_year` varchar(50) NOT NULL,
  `return_plan_assets` varchar(50) NOT NULL,
  `contributions` varchar(50) NOT NULL,
  `benefits_paid_2` varchar(50) NOT NULL,
  `actuarial_asset` varchar(50) NOT NULL,
  `fair_value_end_year` varchar(50) NOT NULL,
  `excess_obligation` varchar(50) NOT NULL,
  `current_service_cost_2` varchar(50) NOT NULL,
  `interest_cost_2` varchar(50) NOT NULL,
  `expected_return` varchar(50) NOT NULL,
  `net_actuarial` varchar(50) NOT NULL,
  `expenses` varchar(50) NOT NULL,
  `present_value` varchar(50) NOT NULL,
  `fair_value_5` varchar(50) NOT NULL,
  `funded_status` varchar(50) NOT NULL,
  `net_balance_Sheet` varchar(50) NOT NULL,
  `save_status` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;