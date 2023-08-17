CREATE TABLE IF NOT EXISTS `assignment_type_template_links` (
  `link_id` int(11) NOT NULL AUTO_INCREMENT,
  `astype_id` int(11) NOT NULL,
  `template_id` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`link_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
