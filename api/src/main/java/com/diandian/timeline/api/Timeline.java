package com.diandian.timeline.api;

import java.util.Date;
import java.util.UUID;

public class Timeline {
    private final String path;
    private Date date;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    private UUID id;

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
