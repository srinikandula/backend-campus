package com.anyaudit.repository;

import com.anyaudit.models.OnlineUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineUsersRepository extends JpaRepository<OnlineUsers,Long> {
}
