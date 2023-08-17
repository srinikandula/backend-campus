CREATE TABLE IF NOT EXISTS `bill_received` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `date_receipt` date NOT NULL,
  `amt_received` varchar(100) NOT NULL,
  `attachment` varchar(250) NOT NULL,
  `check_rtgs` varchar(100) NOT NULL,
  `voucher_no` varchar(100) NOT NULL,
  `bill_id` int(11) NOT NULL,
  `created_on` date NOT NULL,
  `created_by` int(11) NOT NULL,
  `domain` int(11) NOT NULL,
  `amt_ittds` varchar(10) NOT NULL,
  `amt_gsttds` varchar(10) NOT NULL,
  `amt_total` varchar(10) NOT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
