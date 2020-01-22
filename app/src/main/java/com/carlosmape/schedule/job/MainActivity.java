package com.carlosmape.schedule.job;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.carlosmape.schedule.job.model.WorkingDay;

import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btStart = findViewById(R.id.buttonStart);
        Button btBrakeStart = findViewById(R.id.buttonBreakStart);

        btStart.setOnClickListener(OnButtonStartPressed);
    }

    public View.OnClickListener OnButtonStartPressed = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    } ;
}
