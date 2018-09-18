package com.example.thayllananacleto.assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SendForm(View view) {
        //Instantiate Intent Class
        Intent intent = new Intent(MainActivity.this, SubActivity.class);

        //Sending the form
        EditText etFullName = findViewById(R.id.etFullName);
        intent.putExtra("fullName", etFullName.getText().toString());

        EditText etQualification = findViewById(R.id.etQualification);
        intent.putExtra("qualification", etQualification.getText().toString());

        EditText etProfession = findViewById(R.id.etProfession);
        intent.putExtra("profession", etProfession.getText().toString());

        EditText etHobby = findViewById(R.id.etHobby);
        intent.putExtra("hobby", etHobby.getText().toString());

        EditText etDreamJob = findViewById(R.id.etDreamJob);
        intent.putExtra("dreamJob", etDreamJob.getText().toString());

        //Go to Sub Activity
        startActivity(intent);
    }
}
