package com.diandian.timeline.api;

import com.diandian.timeline.api.mapper.TimeLineMapper;
import com.diandian.timeline.api.model.Timeline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {



    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }



}
