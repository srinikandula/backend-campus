CREATE TABLE IF NOT EXISTS `perform_notes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assig_sched_id` int(11) NOT NULL,
  `assignment_id` int(11) NOT NULL,
  `review_notes` text NOT NULL,
  `user_id` int(11) NOT NULL,
  `created_on` datetime NOT NULL,
  `created_by` int(11) NOT NULL,
  `read_flag` int(1) NOT NULL DEFAULT '0' COMMENT '1-read, 0-unread',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
