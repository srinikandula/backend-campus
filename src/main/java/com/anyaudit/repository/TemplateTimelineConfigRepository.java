package com.anyaudit.repository;

import com.anyaudit.models.TemplateTimelineConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemplateTimelineConfigRepository extends JpaRepository<TemplateTimelineConfig,Long> {
}
