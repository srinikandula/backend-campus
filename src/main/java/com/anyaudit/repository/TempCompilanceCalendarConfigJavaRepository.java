package com.anyaudit.repository;

import com.anyaudit.models.TempCompilanceCalendarConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TempCompilanceCalendarConfigJavaRepository extends JpaRepository<TempCompilanceCalendarConfig, Long> {
}
