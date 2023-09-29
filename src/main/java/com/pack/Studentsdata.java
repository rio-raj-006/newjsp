package com.pack;

import java.util.ArrayList;
import java.util.List;

public class Studentsdata {
    public static List<St6udent> std(){
        List<St6udent> s=new ArrayList<>();
        s.add(new St6udent("raj", 19,"raj@email.com"));
        s.add(new St6udent("mari", 13,"mari@email.com"));
        s.add(new St6udent("balaji", 15,"balaji@email.com"));
        return s;
    }
}
