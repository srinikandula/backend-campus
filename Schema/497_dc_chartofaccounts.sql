
CREATE TABLE IF NOT EXISTS `dc_chartofaccounts` (
  `id` int(11) NOT NULL,
  `gl_name` varchar(100) DEFAULT NULL,
  `gl_code` varchar(100) DEFAULT NULL,
  `fss_line_id` int(10) DEFAULT NULL,
  `py_fss_line_id` enum('YES','NO') DEFAULT NULL,
  `fss_name` varchar(255) DEFAULT NULL,
  `parking_id` int(11) DEFAULT NULL,
  `remarks` text,
  `company_id` int(10) NOT NULL,
  `domain_id` int(10) NOT NULL,
  `batch_id` int(10) DEFAULT NULL,
  `created_by` int(10) NOT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `approved_by` int(11) NOT NULL,
  `status` int(10) DEFAULT NULL,
  `is_party` tinyint(4) DEFAULT NULL,
  `parent_id` int(11) DEFAULT NULL,
  `assignment_id` int(11) DEFAULT '0',
  `master_it_tds` varchar(255) DEFAULT NULL,
  `master_gst` varchar(255) DEFAULT NULL,
  `consd_as_party` varchar(255) DEFAULT NULL,
  `spl_cat` varchar(255) DEFAULT NULL,
  `falling_under_gl_id` int(11) NOT NULL DEFAULT '0',
  `falling_under_gl_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dc_chartofaccounts`
--
ALTER TABLE `dc_chartofaccounts`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `gl_code` (`gl_name`,`company_id`,`gl_code`) USING BTREE,
  ADD KEY `company_id` (`company_id`),
  ADD KEY `fss_line_id` (`fss_line_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dc_chartofaccounts`
--
ALTER TABLE `dc_chartofaccounts`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;
