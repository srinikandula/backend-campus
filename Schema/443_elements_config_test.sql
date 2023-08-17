CREATE TABLE IF NOT EXISTS `elements_config_test` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `element_id` int(11) NOT NULL,
  `column_name` varchar(50) NOT NULL,
  `display_name` varchar(250) NOT NULL,
  `column_type` varchar(50) NOT NULL,
  `analytical_report_show` int(11) NOT NULL,
  `data_type` int(1) NOT NULL COMMENT '1=categorical,2=numeric,3=continous,4=ordered,5=data',
  `is_unique` int(2) NOT NULL COMMENT '0,1',
  `is_required` int(2) NOT NULL COMMENT '0,1',
  `attribute_table_name` varchar(255) DEFAULT NULL,
  `attribute_table_col` varchar(255) DEFAULT NULL,
  `is_display` tinyint(4) NOT NULL DEFAULT '1',
  `default_display` int(1) DEFAULT NULL COMMENT '1,0',
  `display_order` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`cid`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
