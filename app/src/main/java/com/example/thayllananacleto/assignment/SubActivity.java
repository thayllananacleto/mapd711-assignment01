package com.example.thayllananacleto.assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        //Initialize
        Intent i = getIntent();

        String fullName = i.getStringExtra("fullName");
        String qualification = i.getStringExtra("qualification");
        String profession = i.getStringExtra("profession");
        String hobby = i.getStringExtra("hobby");
        String dreamJob = i.getStringExtra("dreamJob");

        //Defining a Java reference object for a TextView
        TextView tvFullName = findViewById(R.id.tvFullName);
        tvFullName.setText(fullName);

        TextView tvQualification = findViewById(R.id.tvQualification);
        tvQualification.setText(qualification);

        TextView tvProfession = findViewById(R.id.tvProfession);
        tvProfession.setText(profession);

        TextView tvHobby = findViewById(R.id.tvHobby);
        tvHobby.setText(hobby);

        TextView tvDreamJob = findViewById(R.id.tvDreamJob);
        tvDreamJob.setText(dreamJob);
    }
}
