package com.company.controllers;

import com.company.views.CmdLineView;

public class Main {
    private static CmdLineView view;
    public static String name;
    public static int percent;
    public static char letter;


    public static void main(String[] args) {
        int kids=7;
        view = new CmdLineView();
        view.prompt();
        GetNames getName = new GetNames();

        for(int i=0;i < kids;i++){
            name=getName.names[i];
            percent =(int)(Math.random() *100+1);
            if(percent<60)
                letter='F';
            else if(percent<70)
                letter='D';
            else if(percent<80)
                letter ='C';
            else if(percent<90)
                letter='B';
            else
                letter='A';
            view.classNameGrades(name,percent,letter);
        }



    }
}
