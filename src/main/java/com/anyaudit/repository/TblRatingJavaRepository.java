package com.anyaudit.repository;

import com.anyaudit.models.TblRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TblRatingJavaRepository extends JpaRepository<TblRating, Long> {
}
