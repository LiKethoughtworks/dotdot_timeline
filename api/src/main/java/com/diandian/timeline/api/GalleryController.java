package com.diandian.timeline.api;

import com.diandian.timeline.api.mapper.GalleryMapper;
import com.diandian.timeline.api.model.GalleryItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GalleryController {
    @Autowired
    private GalleryMapper timeLineMapper;

    @RequestMapping("/gallery")
    public List<GalleryItem> greeting() {
        return this.timeLineMapper.findAll();
    }
}