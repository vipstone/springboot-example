package com.hello.springboot.service;

import com.hello.springboot.domain.User;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    public User findByName(String name);

    public User findByNameAndAge(String name, int age);

    @Transactional
    @Modifying
    @Query("update User set name=?1 where id=?2")
    public int modifyName(String name, Long id);

}
