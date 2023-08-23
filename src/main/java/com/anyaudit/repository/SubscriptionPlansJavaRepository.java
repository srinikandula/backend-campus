package com.anyaudit.repository;

import com.anyaudit.models.SubscriptionPlans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionPlansJavaRepository extends JpaRepository<SubscriptionPlans, Long> {
}
