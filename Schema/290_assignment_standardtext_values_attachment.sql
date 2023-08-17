CREATE TABLE IF NOT EXISTS `assignment_standardtext_values_attachment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `standardtext_value_id` int(11) NOT NULL,
  `att_id` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
