CREATE TABLE IF NOT EXISTS `smslogs` (
  `logid` int(11) NOT NULL AUTO_INCREMENT,
  `smsto` bigint(20) NOT NULL,
  `smscontent` varchar(250) NOT NULL,
  `sendby` int(11) NOT NULL,
  `sendon` datetime NOT NULL,
  PRIMARY KEY (`logid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
