CREATE TABLE IF NOT EXISTS `bmcq_answer` (
  `maid` int(11) NOT NULL AUTO_INCREMENT,
  `mid` int(5) NOT NULL,
  `bid` int(5) NOT NULL,
  `answer` text NOT NULL,
  `created_by` int(5) NOT NULL,
  `created_on` date NOT NULL,
  `correct_answer` int(1) NOT NULL COMMENT '1=yes,0=no	',
  PRIMARY KEY (`maid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
