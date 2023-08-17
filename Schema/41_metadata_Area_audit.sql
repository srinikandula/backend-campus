DROP TABLE IF EXISTS `Area_audit`;

CREATE TABLE IF NOT EXISTS `Area_audit` (
  `area_id` int(11) NOT NULL AUTO_INCREMENT,
  `area_name` varchar(250) NOT NULL,
  `created_by` int(5) NOT NULL,
  `created_date` date NOT NULL,
  `op_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`area_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `Area_audit` (`area_id`, `area_name`, `created_by`, `created_date`, `op_id`) VALUES
(1, 'Audit of Account Receivable & Payable', 0, '0000-00-00', 27),
(2, 'Audit of Borrowings & Borrowing Cost', 0, '0000-00-00', 20),
(3, 'Audit of Cash and Bank Balances', 0, '0000-00-00', 24),
(4, 'Audit of Current Tax and Deferred tax', 0, '0000-00-00', 23),
(5, 'Audit of Exceptional Items', 0, '0000-00-00', 29),
(6, 'Audit of Expenses', 0, '0000-00-00', 18),
(7, 'Audit of Inventory', 0, '0000-00-00', 15),
(8, 'Audit of Investment &Investment Income', 0, '0000-00-00', 21),
(9, 'Audit of Loans & Advances', 0, '0000-00-00', 28),
(10, 'Audit of Non-operational Income& Expenses', 0, '0000-00-00', 22),
(11, 'Audit of Payment to Employees', 0, '0000-00-00', 17),
(12, 'Audit of Property,Plant,Equipment&Depreciation', 0, '0000-00-00', 19),
(13, 'Audit of Revenue', 0, '0000-00-00', 16),
(14, 'Audit of Share Capital & Reserves', 0, '0000-00-00', 25);
COMMIT;

