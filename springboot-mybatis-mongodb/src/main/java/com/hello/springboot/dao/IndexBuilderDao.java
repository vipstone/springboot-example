package com.hello.springboot.dao;

import com.hello.springboot.entity.IndexBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;


@Component
public class IndexBuilderDao {
    @Autowired
    private MongoOperations mongo;

    /**
     * 查询下一个id
     * @param collectionName 集合名（表名）
     * @return
     */
    public Long getNextSequence(String collectionName) {
        IndexBuilder counter = mongo.findAndModify(
                query(where("_id").is(collectionName)),
                new Update().inc("seq", 1),
                options().returnNew(true).upsert(true),
                IndexBuilder.class);
        return counter.getSeq();
    }

}


