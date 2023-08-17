CREATE TABLE IF NOT EXISTS `gl_regrouped_list` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gl_list_id` int(11) NOT NULL,
  `amt_type` varchar(150) NOT NULL,
  `val_type` varchar(15) NOT NULL COMMENT 'fss,coa,cos',
  `coa_value` double(15,2) NOT NULL,
  `fss_value` double(15,2) NOT NULL,
  `cos_value` double(15,2) NOT NULL,
  `split_regrouped_id` int(11) NOT NULL,
  `split_type` int(11) NOT NULL COMMENT '1-split,0-notsplir',
  `created_by` int(11) NOT NULL,
  `creation_dt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
