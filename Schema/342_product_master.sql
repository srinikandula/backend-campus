CREATE TABLE IF NOT EXISTS `product_master` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(250) NOT NULL,
  `product_code` varchar(255) DEFAULT NULL,
  `client_id` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `hsn_sac_code` varchar(255) DEFAULT NULL,
  `rate_tax_under_gst` decimal(12,2) DEFAULT NULL,
  `tariff_reference` varchar(255) DEFAULT NULL,
  `measures_id` int(11) NOT NULL COMMENT 'FK: measures',
  `uom` varchar(100) DEFAULT NULL,
  `goods_service` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`pid`),
  UNIQUE KEY `product_name` (`product_name`,`client_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
