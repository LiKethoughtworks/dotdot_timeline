package com.diandian.timeline.api;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import com.diandian.timeline.api.mapper.TimeLineMapper;
import com.diandian.timeline.api.model.Timeline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimelineController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    private TimeLineMapper timeLineMapper;

    @RequestMapping("/images")
    public Timeline greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return this.timeLineMapper.findById(1);
    }
}