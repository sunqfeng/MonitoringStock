package com.xue.entity.model;

import java.io.Serializable;

public class Cron implements Serializable {
    private String cronId;

    private String cron;

    private static final long serialVersionUID = 1L;

    public String getCronId() {
        return cronId;
    }

    public void setCronId(String cronId) {
        this.cronId = cronId;
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }
}