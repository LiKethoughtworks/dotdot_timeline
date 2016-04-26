package com.diandian.timeline.api.mapper;

import com.diandian.timeline.api.model.Timeline;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TimeLineMapper {
    @Select("select * from timeline")
    Timeline findById(@Param("id") Integer id);
}