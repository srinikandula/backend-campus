CREATE TABLE IF NOT EXISTS `udin_qsn_answers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `udin_id` int(11) NOT NULL,
  `domain` int(11) NOT NULL DEFAULT '0',
  `qsn` text,
  `ans` text,
  `created_by` int(11) DEFAULT NULL,
  `created_on` datetime DEFAULT NULL,
  `status` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `udin_id` (`udin_id`),
  KEY `created_by` (`created_by`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
