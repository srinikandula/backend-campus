CREATE TABLE IF NOT EXISTS `process_capture_group_nodes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `group_id` int(11) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `node` int(11) DEFAULT NULL,
  `node_head` int(11) DEFAULT NULL,
  `created_by` int(11) DEFAULT NULL,
  `created_on` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
