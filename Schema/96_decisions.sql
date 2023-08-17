CREATE TABLE IF NOT EXISTS `decisions` (
  `dec_id` int(11) NOT NULL AUTO_INCREMENT,
  `dec_name` varchar(50) NOT NULL,
  `dec_description` text NOT NULL,
  `dec_type` int(11) NOT NULL DEFAULT '1' COMMENT '1- Normal(Cond-or;Sd-And); 2- Reverse (Cond -AND;Sd-Or)',
  `chapter_id` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_dt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `domain_id` int(11) NOT NULL,
  `master_id` int(11) NOT NULL,
  `status` int(1) NOT NULL DEFAULT '1',
  `area_audit_id` int(5) NOT NULL,
  PRIMARY KEY (`dec_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
