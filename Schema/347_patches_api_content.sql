CREATE TABLE IF NOT EXISTS `patches_api_content` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(11) DEFAULT NULL COMMENT 'patch_id\r\n',
  `config_id` int(11) DEFAULT NULL COMMENT '1: CheckLists\r\n2: Agreements / Polices / SOP etc\r\n3: Classifier\r\n4: Audit Variables\r\n5: Types of Risks\r\n6: Types of Controls\r\n7: Decisions\r\n8: Conditions\r\n9: Templates - Configuration\r\n10: Annexures\r\n11: Compliance Calendar\r\n12: Standardized Reports\r\n13: Recurring Milestones\r\n14: Expert Agencies\r\n15: Attachments\r\n16: Assignment - Clusters\r\n17.Customized Reports\r\n18: BS Line items ',
  `rec_id` int(11) DEFAULT NULL,
  `created_on` datetime DEFAULT NULL,
  `created_by` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `config_id` (`config_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
