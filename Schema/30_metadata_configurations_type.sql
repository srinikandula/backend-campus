
DROP TABLE IF EXISTS `configurations_type`;

CREATE TABLE IF NOT EXISTS `configurations_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `scheduler_type` varchar(250) NOT NULL,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `status` varchar(10) NOT NULL COMMENT 'active/inactive',
  `common_type` int(1) NOT NULL DEFAULT '1',
  `seq_order` int(5) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=latin1;


INSERT INTO `configurations_type` (`id`, `title`, `scheduler_type`, `updated_at`, `status`, `common_type`, `seq_order`) VALUES
(1, 'Audit Population', 'Elements', '2022-12-22 09:24:53', 'inactive', 1, 2),
(3, 'Recurring Tasks / Milestones', 'Tasks', '2023-06-30 06:21:42', 'inactive', 1, 16),
(4, 'Decisions On Applicability', 'Decisions', '2023-06-16 11:47:39', 'active', 1, 3),
(11, 'Standardised Reports', 'Reports', '2023-06-16 11:49:58', 'active', 1, 15),
(12, 'Compliance Calendar', 'Compilance', '2023-06-16 11:50:05', 'active', 1, 4),
(13, 'Audit Procedures', 'Other-Procedures', '2023-06-16 11:50:35', 'active', 1, 5),
(14, 'Annexures', 'Annexures', '2023-06-16 11:51:02', 'active', 1, 13),
(15, 'Checklists', 'Checklists', '2022-11-09 08:15:26', 'active', 1, 6),
(16, 'Questionnaires', 'Questionnaire', '2022-11-09 08:15:22', 'active', 1, 7),
(19, 'Calculations', 'Calculations', '2022-12-22 09:57:02', 'inactive', 1, 8),
(20, 'Disclosures', 'Disclosures', '2022-12-22 09:57:07', 'inactive', 1, 9),
(29, 'Customised Reports / Letters', 'Custom_Reports', '2022-11-09 08:14:59', 'active', 1, 14),
(30, 'Balance Confirmations', 'BalanceConfirmations', '2022-11-09 08:14:55', 'active', 1, 10),
(31, 'Physical Inspection', 'PhysicalInspection', '2022-11-09 08:14:51', 'active', 1, 11),
(32, 'ThirdParty Verification', 'ThirdPartyVerification', '2022-11-09 08:14:47', 'active', 1, 12),
(33, 'Chapters', 'Chapters', '2023-02-08 11:06:59', 'inactive', 1, 1),
(34, 'Form', 'Form', '2022-11-22 08:14:39', 'active', 1, 1),
(35, 'CustomAuditProcedures', 'CustomAuditProcedures', '2023-07-05 10:04:14', 'active', 1, 17);
COMMIT;


