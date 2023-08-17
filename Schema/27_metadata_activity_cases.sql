DROP TABLE IF EXISTS `activity_cases`;
CREATE TABLE IF NOT EXISTS `activity_cases` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cases` varchar(15) NOT NULL,
  `creationdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `cases` (`cases`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;


INSERT INTO `activity_cases` (`id`, `cases`, `creationdt`) VALUES
(1, 'Not Yet Started', '2019-09-18 06:35:55'),
(2, 'Started', '2019-09-18 06:36:49'),
(3, 'Approval In Pro', '2019-09-18 06:36:49'),
(4, 'Completed', '2019-09-18 06:36:49');
COMMIT;
