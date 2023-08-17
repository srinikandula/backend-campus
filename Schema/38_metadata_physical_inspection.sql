
DROP TABLE IF EXISTS `physical_inspection`;

CREATE TABLE IF NOT EXISTS `physical_inspection` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `item_name` varchar(250) NOT NULL,
  `created_by` int(11) NOT NULL,
  `creation_dt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `master_id` int(11) NOT NULL,
  `chapter_id` int(3) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;


INSERT INTO `physical_inspection` (`id`, `item_name`, `created_by`, `creation_dt`, `master_id`, `chapter_id`) VALUES
(1, 'Inventories', 123, '2022-11-02 12:37:23', 0, 0),
(2, 'Fixed Assests', 123, '2022-11-02 12:37:23', 0, 0),
(3, 'Work In Progress', 123, '2022-11-02 12:37:37', 0, 0),
(4, 'Stores and Spares', 123, '2022-11-02 12:37:37', 0, 0);
COMMIT;

