package com.example.mongo.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * created by jg 2021/05/23
 */
@AllArgsConstructor
@Getter
@Document("alarm_log")
public class AlarmLog {
    @Id
    private Long id;
    private String title;
    private String message;
}

