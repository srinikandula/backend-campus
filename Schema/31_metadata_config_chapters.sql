
DROP TABLE IF EXISTS `config_chapters`;

CREATE TABLE IF NOT EXISTS `config_chapters` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `chapter_name` varchar(100) NOT NULL,
  `root_number` int(5) NOT NULL,
  `is_active` tinyint(1) NOT NULL,
  `seq_order` int(5) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;



INSERT INTO `config_chapters` (`id`, `chapter_name`, `root_number`, `is_active`, `seq_order`) VALUES
(1, 'Configurations', 1, 1, 1),
(2, 'Audit Findings', 8, 1, 8),
(3, 'Planning', 3, 1, 4),
(4, 'Initiation', 2, 1, 3),
(5, 'Assessment of Risk', 4, 1, 5),
(6, 'Assessment of compliances', 5, 1, 6),
(7, 'Execution', 7, 1, 7),
(8, 'Reporting', 9, 1, 9),
(9, 'Dcumentation', 10, 1, 10),
(10, 'Signoff and Review', 11, 1, 11),
(11, 'Others', 12, 1, 12),
(12, 'Lead Sheets', 6, 1, 2);
COMMIT;
