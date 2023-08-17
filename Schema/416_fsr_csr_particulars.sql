CREATE TABLE IF NOT EXISTS `fsr_csr_particulars` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `particulars_name` varchar(250) NOT NULL,
  `particulars_type` int(5) NOT NULL DEFAULT '1' COMMENT '1-decimal,2-varchar,3-date',
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_by` int(11) NOT NULL,
  `updated_on` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
