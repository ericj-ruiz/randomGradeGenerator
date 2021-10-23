package com.company.views;

public class CmdLineView {
    public void prompt(){
        System.out.println("Grades for the Class:\nName:   Percentage:   Grade:\n---------------------------------");
    }
    public void classNameGrades(String name, int percent, char letter){
        System.out.println(name + " " + percent + " " + letter +"\n");
    }
}
