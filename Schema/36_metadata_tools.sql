
DROP TABLE IF EXISTS `tools`;

CREATE TABLE IF NOT EXISTS `tools` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tool_name` varchar(150) NOT NULL,
  `tool_head_ds_name` varchar(150) NOT NULL,
  `tool_head_name_col` varchar(100) NOT NULL,
  `tool_head_id_col` varchar(100) NOT NULL,
  `tool_node_ds_name` varchar(150) NOT NULL,
  `tool_values_ds_name` varchar(50) NOT NULL,
  `displayInResponse` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `tool_name` (`tool_name`)
) ENGINE=MyISAM AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

INSERT INTO `tools` (`id`, `tool_name`, `tool_head_ds_name`, `tool_head_name_col`, `tool_head_id_col`, `tool_node_ds_name`, `tool_values_ds_name`, `displayInResponse`) VALUES
(1, 'Checklists', 'checklists', 'checklist_name', 'checklist_id', 'checklist_node', 'checklist_subject_answers_values', 1),
(2, 'Questionnaire', 'checklists', 'checklist_name', 'checklist_id', 'checklist_node', 'checklist_subject_answers_values', 1),
(3, 'Process', 'process_list', 'process_name', 'id', 'process_node', 'process_subject_details', 0),
(4, 'Agreements', 'agreement_assignment_headds', 'name', 'id', 'agreement_assignment_nodeds', 'agreement_subject_answers_values', 1),
(5, 'Calculations', 'forms', 'name', 'id', '', '', 0),
(6, 'Disclosures', 'd_forms', 'name', 'id', '', '', 0),
(7, 'Workflow', 'agreement_assignment_headds', 'name', 'id', 'agreement_assignment_nodeds', 'agreement_subject_answers_values', 1),
(8, 'BalanceConfirmations', 'balance_confirmations', 'item_name', 'id', '', 'balance_confirmations_subject_values', 1),
(9, 'Annexures', 'annexure', 'annexure_name', 'annexure_id', 'fieldname', 'annexure_subject_answer_value', 1),
(10, 'Sop', 'agreement_assignment_headds', 'name', 'id', 'agreement_assignment_nodeds', 'agreement_subject_answers_values', 1),
(11, 'AccountingPolicies', 'agreement_assignment_headds', 'name', 'id', 'agreement_assignment_nodeds', 'agreement_subject_answers_values', 1),
(12, 'StatutoryReply', 'agreement_assignment_headds', 'name', 'id', 'agreement_assignment_nodeds', 'agreement_subject_answers_values', 1),
(13, 'PhysicalInspection', 'physical_inspection', 'name', 'id', '', 'physical_inspection_subject_values', 1),
(14, 'ThirdPartyVerification', 'thirdparty_verification', 'name', 'id', '', 'thirdparty_verification_subject_values', 1),
(15, 'Form', 'form', 'form_name', 'id', 'form_node', 'form_subject_answers_values', 1);
COMMIT;
