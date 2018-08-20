package com.hello.springboot.repository;

import com.hello.springboot.dao.UserLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLogRepository extends JpaRepository<UserLog,Long> {

}
