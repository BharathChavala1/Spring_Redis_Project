package spring_Redis_Cache_PubSub.spring_Redis_Cache_PubSub.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.stereotype.Service;

@Service
public class RedisPublisher {

    private final StringRedisTemplate redisTemplate;
    private final ChannelTopic channelTopic;

    @Autowired
    public RedisPublisher(StringRedisTemplate redisTemplate, ChannelTopic channelTopic) {
        this.redisTemplate = redisTemplate;
        this.channelTopic = new ChannelTopic("OrderTopic");
    }

    public void publish(String message){
        redisTemplate.convertAndSend(channelTopic.getTopic(),message);
    }
}
