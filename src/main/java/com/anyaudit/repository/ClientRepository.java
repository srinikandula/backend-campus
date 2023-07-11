package com.anyaudit.repository;

import com.anyaudit.models.Client;
import com.anyaudit.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
//  Optional<User> findByName(String name);

  Boolean existsByName(String username);

  @Query(value = "SELECT COUNT(*) FROM Client", nativeQuery = true)
  Long getClientCount();
  @Query(value = "SELECT client_id,name FROM Client", nativeQuery = true)
  List<Object[]> findNameAndId();

  List<Client> findByFrameworkId(Long frameworkId);

  List<Client> findByName(String name);
  List<Client> findByPhoneNo(String phoneNo);
  List<Client> findByEmail(String email);
  List<Client> findByFileNo(String fileNo);
  @Query("SELECT c FROM Client c WHERE c.name LIKE %:keyword% OR c.phoneNo LIKE %:keyword% OR c.email LIKE %:keyword% OR c.fileNo LIKE %:keyword%")
  List<Client> findByAllColumnsContaining(@Param("keyword") String keyword);

}
