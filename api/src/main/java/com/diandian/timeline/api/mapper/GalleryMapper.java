package com.diandian.timeline.api.mapper;

import com.diandian.timeline.api.model.GalleryItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GalleryMapper {
    @Select("select * from Gallery")
    List<GalleryItem> findAll();
}