package com.example.corruptnapster.krmuattendance;

import android.app.Application;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by CORRUPT NAPSTER on 18-02-2018.
 */


public class Profile extends AppCompatActivity {

    String TAG = Profile.class.getSimpleName();


    Student student;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        Globle globle = Globle.getInstance();


        student = globle.getStudent();
        TextView tv1 = (TextView) findViewById(R.id.t2);
        TextView tv2 = (TextView) findViewById(R.id.t3);
        TextView tv3 = (TextView) findViewById(R.id.t4);
        tv1.setText(student.roll);
        tv2.setText(student.name);
        tv3.setText(student.branch);


        //  Toast.makeText(getApplicationContext(),"Presents"+ student,Toast.LENGTH_SHORT).show();
        Log.e(TAG, student.getBranch() + "   " + student.getName() + "    " + student.getRoll());
    }

}


