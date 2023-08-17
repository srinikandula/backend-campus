DROP TABLE IF EXISTS `balance_confirmations`;

CREATE TABLE IF NOT EXISTS `balance_confirmations` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `item_name` varchar(250) NOT NULL,
  `created_by` int(11) NOT NULL,
  `creation_dt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `master_id` int(11) NOT NULL,
  `chapter_id` int(3) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;


INSERT INTO `balance_confirmations` (`id`, `item_name`, `created_by`, `creation_dt`, `master_id`, `chapter_id`) VALUES
(1, 'Bank Balances', 12, '2022-11-02 12:36:12', 0, 0),
(2, 'Accounts Receivable', 12, '2022-11-02 12:36:36', 0, 0),
(3, 'Accounts Payable', 12, '2022-11-02 12:36:36', 0, 0),
(4, 'Fixed Deposits', 0, '2022-11-16 08:31:11', 0, 0),
(5, 'Investments', 0, '2022-11-16 08:31:26', 0, 0);
COMMIT;



