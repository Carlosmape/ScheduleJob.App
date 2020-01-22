package com.carlosmape.schedule.job.model;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public abstract class Node {
    protected UUID Id;
    protected Date Created;
    protected Date Modified;

    Node(){
        Id = UUID.randomUUID();
        Created = Modified = Calendar.getInstance().getTime();
    }

    protected boolean Modify() {
        Modified = Calendar.getInstance().getTime();
        return true;
    }
}
