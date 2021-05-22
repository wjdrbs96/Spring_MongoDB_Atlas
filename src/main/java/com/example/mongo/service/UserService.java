package com.example.mongo.service;

import com.example.mongo.document.AlarmLog;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

/**
 * created by jg 2021/05/23
 */
@RequiredArgsConstructor
@Service
public class UserService {

    private final MongoTemplate mongoTemplate;

    public void mongoInsert() {
        AlarmLog alarmLog = new AlarmLog(2L, "제목1", "메세지2");
        mongoTemplate.insert(alarmLog);
    }
}

