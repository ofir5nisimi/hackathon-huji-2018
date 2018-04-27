package com.example.onisimi.dropbuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mConsumer, mVolunteer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mConsumer = (Button) findViewById(R.id.consumer);
        mVolunteer = (Button) findViewById(R.id.volunteer);

        mConsumer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ConsumerLoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        mVolunteer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VolunteerLoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
}
