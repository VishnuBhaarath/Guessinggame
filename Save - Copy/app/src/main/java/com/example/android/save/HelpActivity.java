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
        body.setBackgroundColor(Color.rgb(51,255,255));
        intro=findViewById(R.id.intro);
        intro.setBackgroundColor(Color.rgb(255,255,0));
        guess=findViewById(R.id.guess);
        guess.setBackgroundColor(Color.rgb(51,51,255));
        tries=findViewById(R.id.tries);
        tries.setBackgroundColor(Color.rgb(51,51,255));
        check=findViewById(R.id.check);
        check.setBackgroundColor(Color.rgb(0,255,0));
        reset=findViewById(R.id.reset);
        reset.setBackgroundColor(Color.rgb(0,178,0));
        end=findViewById(R.id.end);
        end.setBackgroundColor(Color.rgb(127,0,255));

    }
}