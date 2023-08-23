package com.anyaudit.repository;

import com.anyaudit.models.SmsWorksEcPermissions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsWorksEcPermissionsJavaRepository extends JpaRepository<SmsWorksEcPermissions, Long> {

}
