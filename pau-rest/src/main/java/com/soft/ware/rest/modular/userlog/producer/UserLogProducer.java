package com.soft.ware.rest.modular.userlog.producer;

import com.alibaba.fastjson.JSON;
import com.soft.ware.rest.modular.userlog.UserLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserLogProducer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void sendlog(String userid){
        UserLog userlog = new UserLog();
        userlog.setUsername("cxy");
        userlog.setState("1");
        userlog.setUserid(userid);

        System.err.println(userlog+"1");

        kafkaTemplate.send("userLog", JSON.toJSONString(userlog));

    }
}
