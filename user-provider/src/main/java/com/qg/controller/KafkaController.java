package com.qg.controller;

import com.qg.utils.KafkaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {


    @Autowired
    private KafkaUtil kafkaUtil;

    /**
     * 测试发送的具体的方法
     * @return
     */
    @RequestMapping("/send")
    public String testSendMessage() {
        try{
            kafkaUtil.sendInfoMessage(" start execute testSendMessage function>>>>>>");
            int score=1/0;
        }catch (Exception e){
            kafkaUtil.sendErrorMessage(e);
            return "success";
        }
        return "success";
    }
}
