package com.example.android.save;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private EditText number;
    private Button save;
    String value;
    private TextView name;
    private TextView nam;
    private String na;
    private int b;
    private Button apply;
    private String text;
    private int val;
    private String tex;
    private int random;
    private int va;
    private RelativeLayout body;
    private EditText tries;
    private int v;
    private int j;
    private int finalresult;
    private Button reset;
    private String userenter;
    private int s;
    private String result;
    private int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number=(EditText)findViewById(R.id.enter);
        body=(RelativeLayout)findViewById(R.id.body);

        tries=(EditText)findViewById(R.id.userenter);
        name=(TextView)findViewById(R.id.text);
        name.getText().toString();

        random = display();
        apply=(Button)findViewById(R.id.apply);
        apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=Integer.parseInt(name.getText().toString());
                value=number.getText().toString();
                userenter=tries.getText().toString();
                if(value.length()==0 || userenter.length()==0){
                    Toast.makeText(MainActivity.this,"please enter a value",Toast.LENGTH_SHORT).show();
                }
                else {
                    s=Integer.parseInt(userenter);
                    finalresult= Integer.parseInt(value);
                    Displaycolour();
                    if (i >s-1) {
                        if(finalresult==random){
                            Toast.makeText(MainActivity.this,"You exceeded maximum number of tries",Toast.LENGTH_SHORT).show();
                        }else{
                        Toast.makeText(MainActivity.this, "you lost  the correct answer= " + random, Toast.LENGTH_SHORT).show();}
                        i = i + 1;

                        random = display();
                    } else if (finalresult == random) {
                        j=i+1;

                        Toast.makeText(MainActivity.this, "Congrats , the number of tries= "+ j , Toast.LENGTH_SHORT).show();
                        i = i + 1;
                        if(i<b && b!=0) {
                            name.setText(String.valueOf(i));
                        }
                        else if(b==0){
                            name.setText(String.valueOf(i));
                        }
                        saveData();

                        random = display();
                    } else if (finalresult > random) {
                        Toast.makeText(MainActivity.this, "high", Toast.LENGTH_SHORT).show();
                        i = i + 1;

                    } else {
                        Toast.makeText(MainActivity.this, "low", Toast.LENGTH_SHORT).show();
                        i = i + 1;

                    }

                }

            }
        });


    loadData();
    updateViews();
    reset=findViewById(R.id.reset);
    reset.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            random = display();
            tries.setText("");
            number.setText("");
            name.setText("0");
        }
    });


}
    public void Displaycolour(){
        number.setText("");

        if(random+2>=finalresult && random-2<=finalresult){
                body.setBackgroundColor(Color.rgb(51,255,51));
            }
        else if(random+5>=finalresult && random-5<=finalresult){
            body.setBackgroundColor(Color.rgb(102,255,102));
        }
        else if(random+10>=finalresult && random-10<=finalresult){
            body.setBackgroundColor(Color.rgb(153,255,153));
        }

        else if(random+15>=finalresult && random-15<=finalresult){
            body.setBackgroundColor(Color.rgb(255,204,204));
        }
        else if(random+30>=finalresult && random-30<=finalresult){
            body.setBackgroundColor(Color.rgb(255,102,102));
        }
        else if(random+50>=finalresult && random-50<=finalresult){
            body.setBackgroundColor(Color.rgb(255,51,51));
        }
        else if(random+100>=finalresult && random-100<=finalresult){
            body.setBackgroundColor(Color.rgb(255,30,30));
        }





    }


    private int display(){
        int random = new Random().nextInt(100);

        number.setText("");
        body.setBackgroundColor(Color.rgb(51,255,255));
        i=0;

      tries.setText("");
        return random;
    }

    public void saveData() {
        SharedPreferences sharedPreferences = getSharedPreferences("SHARED_PREFS", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        va=Integer.parseInt(name.getText().toString());

        editor.putInt("TEXT",va);


        editor.apply();


        }


     public void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences("SHARED_PREFS", MODE_PRIVATE);
        v = sharedPreferences.getInt("TEXT", 0);

    }

     public void updateViews() {

        name.setText(String.valueOf(v));

      }
}