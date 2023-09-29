package com.pack;

public class St6udent {
    private String studentname;
    private int rollno;
    private String email;
    St6udent (String st,int rn,String e){
        this.email=e;
        this.rollno=rn;
        this.studentname=st;
    }
    public String getStudentname(){
        return studentname;
    }
    public String getEmail(){
        return email;
    }
    public int getRollno(){
        return rollno;
    }
}
