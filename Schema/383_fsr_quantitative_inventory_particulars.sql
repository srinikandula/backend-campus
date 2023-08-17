CREATE TABLE IF NOT EXISTS `fsr_quantitative_inventory_particulars` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `particulars_name` varchar(250) NOT NULL,
  `particulars_type` int(1) NOT NULL DEFAULT '1' COMMENT '1-dynamic,2-static',
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_by` int(11) NOT NULL,
  `updated_on` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
