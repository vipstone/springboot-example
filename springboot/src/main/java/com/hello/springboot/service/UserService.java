package com.hello.springboot.service;

import com.hello.springboot.common.EncryptionUtil;
import com.hello.springboot.domain.User;
import com.hello.springboot.domain.UserLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.Date;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserLogRepository userLogRepository;

    @Transactional
    public long saveGroup() {
        long id = 0;
        User user = new User("老王", 18, EncryptionUtil.MD5("123456"));
        userRepository.save(user);
        id = user.getId(); //新增成功，产生的自增id

        UserLog userLog = new UserLog(1, "新增用户", user.getId(), new Date().getTime());
        userLog.setCtime(new Long("1534822366644"));  //触发唯一验证，插入失败
        userLogRepository.save(userLog);
        return id;
    }
}
