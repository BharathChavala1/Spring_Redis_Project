package com.example.spring_redis_cache_subscriber.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class RedisSubscriber {

    private final Logger logger = LoggerFactory.getLogger(RedisSubscriber.class);

    public void handleMessage(String message){
        logger.info("Received Message: {}",message);
    }
}
