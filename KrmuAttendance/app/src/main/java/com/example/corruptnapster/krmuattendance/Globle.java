package com.example.corruptnapster.krmuattendance;

import android.app.Application;

/**
 * Created by CORRUPT NAPSTER on 18-02-2018.
 */

public class Globle extends Application {

    private static Globle globle;
    private Student student;


    @Override
    public void onCreate() {
        super.onCreate();
        globle=new Globle();
    }

    public static Globle getInstance()
    {
        if(globle==null)
            return new Globle();

        return globle;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
