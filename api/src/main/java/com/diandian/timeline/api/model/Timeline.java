package com.diandian.timeline.api.model;

import java.io.Serializable;
import java.util.Date;

public class Timeline implements Serializable {
    private final String path;
    private Date date;
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timeline(String content, Date date) {
        this.path = content;
        this.date = date;
    }

    public String getPath() {
        return path;
    }

    public Date getDate() {
        return date;
    }
}
