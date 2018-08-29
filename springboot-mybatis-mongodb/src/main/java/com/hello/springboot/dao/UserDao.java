package com.hello.springboot.dao;

import com.hello.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class UserDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 添加用户
     * @param user User Object
     */
    public void insert(User user) {
        mongoTemplate.save(user);
    }

    /**
     * 查询所有用户
     * @return
     */
    public List<User> findAll() {
        return mongoTemplate.findAll(User.class);
    }

    /**
     * 根据id 查询
     * @param id
     * @return
     */
    public User findById(Long id) {
        Query query = new Query(Criteria.where("id").is(id));
        User user = mongoTemplate.findOne(query, User.class);
        return user;
    }

    /**
     * 更新
     * @param user
     */
    public void updateUser(User user) {
        Query query = new Query(Criteria.where("id").is(user.getId()));
        Update update = new Update().set("name", user.getName()).set("pwd", user.getPwd());
        mongoTemplate.updateFirst(query, update, User.class);
    }

    /**
     * 删除对象
     * @param id
     */
    public void deleteUserById(Long id) {
        Query query = new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query, User.class);
    }

}
