CREATE TABLE IF NOT EXISTS `proposals` (
  `proid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `pro_name` varchar(45) NOT NULL,
  `pro_type_id` int(10) unsigned NOT NULL,
  `pro_company_id` int(10) unsigned NOT NULL,
  `fyfrom` varchar(255) NOT NULL,
  `fyto` varchar(255) NOT NULL,
  `fss_head_id` int(11) NOT NULL,
  `coa_head_id` int(11) NOT NULL,
  `cos_head_id` int(11) NOT NULL,
  `am_hrs` float(4,2) NOT NULL,
  `ai_hrs` float(4,2) NOT NULL,
  `sr_hrs` float(4,2) NOT NULL,
  `jr_hrs` float(4,2) NOT NULL,
  `proposal_status` varchar(25) NOT NULL,
  PRIMARY KEY (`proid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
