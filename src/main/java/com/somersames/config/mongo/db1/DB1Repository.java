package com.somersames.config.mongo.db1;


import com.somersames.dto.mongo.MongoDB1;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author szh
 * @create 2018-12-09 23:26
 **/
public interface DB1Repository extends MongoRepository<MongoDB1,String>{
}
