package com.hello.springboot.service;

import com.hello.springboot.domain.UserLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLogRepository extends JpaRepository<UserLog,Long> {

}
