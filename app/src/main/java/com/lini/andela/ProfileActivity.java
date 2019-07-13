package com.lini.andela;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    TextView track, country, email, phone, slack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        //Casting the views
        track = findViewById(R.id.track);
        country = findViewById(R.id.country);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        slack = findViewById(R.id.slack);

        //Populating the views via the string resource
        track.setText(R.string.track);
        country.setText(R.string.country);
        email.setText(R.string.email);
        phone.setText(R.string.no);
        slack.setText(R.string.slack);
    }
}
