CREATE TABLE IF NOT EXISTS `assignment_standardtext_values` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` int(11) DEFAULT NULL,
  `data_values` text,
  `assignment_id` int(11) DEFAULT NULL,
  `client_id` int(11) DEFAULT NULL,
  `domain_id` int(11) DEFAULT NULL,
  `master_id` int(11) DEFAULT NULL,
  `audit_procedure_id` int(11) DEFAULT NULL,
  `chapter_id` int(11) DEFAULT NULL,
  `audit_procedure_batch_id` int(11) DEFAULT NULL,
  `order_id` int(11) DEFAULT NULL,
  `created_by` int(11) DEFAULT NULL,
  `created_on` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
