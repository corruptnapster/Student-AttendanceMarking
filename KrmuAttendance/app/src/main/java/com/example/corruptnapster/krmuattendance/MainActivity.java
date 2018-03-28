package com.example.corruptnapster.krmuattendance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button Loginbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        username = (EditText) findViewById(R.id.e1);
        password = (EditText) findViewById(R.id.e2);

        Loginbtn = (Button) findViewById(R.id.button);


        Loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String pass = password.getText().toString();

                Log.e("MSG",user+pass);
                if (!TextUtils.isEmpty(user) && !TextUtils.isEmpty(pass) && user.length() == 10) {

                    // API

                    Student student=new Student();
                   // Student student2=new Student();
                     student.setRoll(user);
                     student.setName("SHIVAM");
                     student.branch="CSE";

                     Globle globle=Globle.getInstance();
                     globle.setStudent(student);


                    Intent i1 = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(i1);
                } else {

                    Toast.makeText(getApplicationContext(), "Wrong Input", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }


}
