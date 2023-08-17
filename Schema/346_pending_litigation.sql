CREATE TABLE IF NOT EXISTS `pending_litigation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name_of_the_party` varchar(255) NOT NULL,
  `reason_of_dispute` text NOT NULL,
  `amount_of_dispute` float NOT NULL,
  `provision_in_books` varchar(255) NOT NULL,
  `provision_required` varchar(255) NOT NULL,
  `present_status_of_dispute` varchar(255) NOT NULL,
  `attachment` int(11) NOT NULL,
  `status` int(11) NOT NULL,
  `client_id` int(11) NOT NULL,
  `assignment_id` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
