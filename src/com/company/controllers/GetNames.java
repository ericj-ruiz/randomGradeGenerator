package com.company.controllers;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GetNames {
    public String[] names;
    private BufferedReader in;

    public GetNames(){
        try{
            Path tPath = Paths.get("src/" + "names.txt");
            FileReader fileReader = new FileReader(String.valueOf(tPath));
            in = new BufferedReader(fileReader);
            List<String> lines = new ArrayList<>();
            String line =null;
            try{
                line = in.readLine();
                while(line != null){
                    lines.add(line);
                    line=in.readLine();
                }
                in.close();
                names = lines.toArray(new String[lines.size()]);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }



}
