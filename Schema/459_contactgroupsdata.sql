CREATE TABLE IF NOT EXISTS `contactgroupsdata` (
  `gdataid` int(11) NOT NULL AUTO_INCREMENT,
  `gid` int(11) NOT NULL,
  `contactid` int(11) NOT NULL,
  `entereddt` date NOT NULL,
  `created_by` int(11) NOT NULL,
  `domain` int(11) NOT NULL,
  PRIMARY KEY (`gdataid`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
