package com.carlosmape.schedule.job;

import com.carlosmape.schedule.job.model.WorkingDay;

import java.util.List;

public class DataManager {
    private List<WorkingDay> WorkRegister;

    public boolean StartStopWorkDay(){
        if (WorkRegister.isEmpty() || WorkRegister.get(WorkRegister.size()-1).isFinished()){
            WorkRegister.add(new WorkingDay());
            return true;
        }else{
            WorkRegister.get(WorkRegister.size()-1);
        }
    }
}
