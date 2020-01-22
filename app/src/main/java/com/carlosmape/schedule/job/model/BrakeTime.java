package com.carlosmape.schedule.job.model;

import java.util.Calendar;
import java.util.Date;

public class BrakeTime extends Node {
    private Date StartedTime;
    private Date FinishedTime;

    BrakeTime(){
        super();
        StartedTime = Calendar.getInstance().getTime();
    }

    public void finish() {
        FinishedTime = Calendar.getInstance().getTime();
        super.Modify();
    }

    public Date getStartedTime() {
        return StartedTime;
    }

    public void setStartedTime(Date startedTime) {
        StartedTime = startedTime;
        super.Modify();
    }

    public boolean getFinishedTime(){
        return FinishedTime == null;
    }
}
