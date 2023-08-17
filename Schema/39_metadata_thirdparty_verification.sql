
DROP TABLE IF EXISTS `thirdparty_verification`;

CREATE TABLE IF NOT EXISTS `thirdparty_verification` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `item_name` varchar(250) NOT NULL,
  `created_by` int(11) NOT NULL,
  `creation_dt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `master_id` int(11) NOT NULL,
  `chapter_id` int(3) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;


INSERT INTO `thirdparty_verification` (`id`, `item_name`, `created_by`, `creation_dt`, `master_id`, `chapter_id`) VALUES
(1, 'Inventories', 12, '2022-11-02 12:38:10', 0, 0),
(2, 'Fixed Assets', 12, '2022-11-02 12:38:10', 0, 0),
(3, 'Work In Progress', 12, '2022-11-02 12:38:24', 0, 0),
(4, 'Investments', 12, '2022-11-02 12:38:24', 0, 0),
(5, 'Bank Deposits', 12, '2022-11-02 12:38:24', 0, 0);
COMMIT;

