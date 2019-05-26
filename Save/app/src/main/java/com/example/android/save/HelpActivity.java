package com.example.android.save;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ScrollView;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {
    private ScrollView body;
    private TextView intro;
    private TextView guess;
    private TextView tries;
    private TextView check;
    private TextView reset;
    private TextView end;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        body=findViewById(R.id.body);

        intro=findViewById(R.id.intro);
        intro.setBackgroundColor(Color.rgb(255,255,0));
        guess=findViewById(R.id.guess);
        body.setBackgroundColor(Color.rgb(255,153,204));
        tries=findViewById(R.id.tries);

        check=findViewById(R.id.check);

        reset=findViewById(R.id.reset);

        end=findViewById(R.id.end);
        end.setBackgroundColor(Color.rgb(102,178,255));

    }
}