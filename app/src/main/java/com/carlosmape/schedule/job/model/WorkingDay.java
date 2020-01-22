package com.carlosmape.schedule.job.model;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class WorkingDay extends Node {

    private Date StartedTime;
    private Date FinishedTime;
    private List<BrakeTime> Brakes;

    WorkingDay(){
      super();
      StartedTime = Calendar.getInstance().getTime();
    }

    public boolean BrakeStartStop(){
        if (Brakes.isEmpty() || Brakes.get(Brakes.size()-1).getFinishedTime()){
            Brakes.add(new BrakeTime());
        }else{
            Brakes.get(Brakes.size()-1).finish();
        }
        return Modify();
    }

    @Override
    protected boolean Modify() {
        return super.Modify();
    }

    public Date getStartedTime() {
        return StartedTime;
    }

    public void setStartedTime(Date startedTime) {
        StartedTime = startedTime;
        Modify();
    }

    public Date getFinishedTime() {
        return FinishedTime;
    }

    public void setFinishedTime(Date finishedTime) {
        FinishedTime = finishedTime;
        Modify();
    }

    public void finish(){
        FinishedTime = Calendar.getInstance().getTime();
        Modify();
    }

    public boolean isFinished(){
        return FinishedTime == null;
    }

}
