CREATE TABLE IF NOT EXISTS `code_snippet` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `parent_id` int(11) NOT NULL,
  `code_type` enum('Code','Condition','Case','TRUE','FALSE','IF','FOREACH') NOT NULL,
  `method_id` int(11) NOT NULL,
  `description` longtext NOT NULL,
  `sequence_id` int(11) NOT NULL,
  `status` enum('Open','Closed') NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` date NOT NULL,
  `nodelevel` int(11) NOT NULL,
  `nodecode` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
