DROP TABLE IF EXISTS `timeline`;

CREATE TABLE IF NOT EXISTS `timeline` (
  `time_id` int(11) NOT NULL AUTO_INCREMENT,
  `time_name` varchar(250) NOT NULL,
  `time_category` varchar(250) NOT NULL,
  `timeline_cat` int(11) NOT NULL,
  `order_no` int(3) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` date NOT NULL,
  `updated_by` int(11) NOT NULL,
  `updated_on` date NOT NULL,
  `domain_id` int(11) NOT NULL,
  PRIMARY KEY (`time_id`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=latin1;



INSERT INTO `timeline` (`time_id`, `time_name`, `time_category`, `timeline_cat`, `order_no`, `created_by`, `created_on`, `updated_by`, `updated_on`, `domain_id`) VALUES
(2, 'April', 'Month...', 1, 1, 228, '2020-11-11', 228, '2022-06-24', 2),
(3, 'May', 'Month', 1, 2, 228, '2020-11-11', 0, '0000-00-00', 2),
(4, 'June', 'Month', 1, 3, 228, '2020-11-11', 0, '0000-00-00', 2),
(5, 'July', 'Month', 1, 4, 228, '2020-11-11', 0, '0000-00-00', 2),
(6, 'August', 'Month', 1, 5, 228, '2020-11-11', 0, '0000-00-00', 2),
(7, 'September', 'Month', 1, 6, 228, '2020-11-11', 0, '0000-00-00', 2),
(8, 'October', 'Month', 1, 7, 228, '2020-11-11', 0, '0000-00-00', 2),
(9, 'November', 'Month', 1, 8, 228, '2020-11-11', 0, '0000-00-00', 2),
(10, 'December', 'Month', 1, 9, 228, '2020-11-11', 0, '0000-00-00', 2),
(11, 'January', 'Month', 1, 10, 228, '2020-11-11', 0, '0000-00-00', 2),
(12, 'February', 'Month', 1, 11, 228, '2020-11-11', 0, '0000-00-00', 2),
(13, 'March', 'Month', 1, 12, 228, '2020-11-11', 0, '0000-00-00', 2),
(38, 'Annual', 'Annual', 4, 1, 237, '2020-11-17', 0, '0000-00-00', 2),
(46, 'June Quarter', 'Quarter', 2, 2, 257, '2021-05-19', 0, '0000-00-00', 2),
(47, 'September Quarter', 'Quarter', 2, 3, 257, '2021-05-19', 0, '0000-00-00', 2),
(48, 'December Quarter', 'Quarter', 2, 4, 257, '2021-05-19', 0, '0000-00-00', 2),
(49, 'March Quarter', 'Quarter', 2, 1, 257, '2021-05-19', 0, '0000-00-00', 2),
(50, 'Half year1', 'Half Yearly', 3, 1, 376, '2022-03-04', 0, '0000-00-00', 2),
(51, 'Half year2', 'Half Yearly', 3, 2, 376, '2022-03-04', 0, '0000-00-00', 2);
COMMIT;
