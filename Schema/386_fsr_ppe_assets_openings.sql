CREATE TABLE IF NOT EXISTS `fsr_ppe_assets_openings` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `item_name` varchar(100) NOT NULL,
  `category_id` int(11) NOT NULL,
  `opening_gross_block_amount` float(11,2) NOT NULL,
  `accumlated_depreciation` float(11,2) NOT NULL,
  `item_date` date DEFAULT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL,
  `status` int(1) NOT NULL,
  `assignment_id` int(11) NOT NULL,
  `client_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
