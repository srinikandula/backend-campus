CREATE TABLE IF NOT EXISTS `audit_response_conclusions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `arid` int(11) NOT NULL,
  `conclusion_id` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
