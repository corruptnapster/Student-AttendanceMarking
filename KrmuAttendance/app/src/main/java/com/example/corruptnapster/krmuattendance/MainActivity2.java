package com.example.corruptnapster.krmuattendance;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Bundle b1 = getIntent().getExtras();

        Toast.makeText(getApplicationContext(), "Welcome to second page", Toast.LENGTH_LONG).show();


        TextView Prof = (TextView) findViewById(R.id.t1);
        TextView Sout = (TextView) findViewById(R.id.t2);
        TextView ShowAtt = (TextView) findViewById(R.id.t3);
        TextView MarkAtt = (TextView) findViewById(R.id.t4);

        Globle globle=Globle.getInstance();
        Student student=globle.getStudent();
        Log.e("MSG",student.getBranch()+"");

        Prof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

Intent i3 = new Intent(MainActivity2.this,Profile.class);
startActivity(i3);

            }
        });




        Sout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(i2);


            }
        });



        ShowAtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });



        MarkAtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });



    }
}
