CREATE TABLE IF NOT EXISTS `zoho_meeting` (
  `id` int(11) NOT NULL,
  `title` text,
  `speaker` varchar(255) DEFAULT NULL,
  `topic` varchar(255) DEFAULT NULL,
  `schedule_date` datetime NOT NULL,
  `duration` varchar(20) NOT NULL,
  `fee` int(11) DEFAULT NULL,
  `zoho_Session_id` varchar(255) NOT NULL,
  `att_id` int(11) DEFAULT NULL,
  `webinar_status` enum('Open','Close') NOT NULL,
  `highlights` enum('YES','NO') NOT NULL,
  `created_at` datetime NOT NULL,
  `created_by` int(11) NOT NULL,
  `is_deleted` enum('N','Y') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

