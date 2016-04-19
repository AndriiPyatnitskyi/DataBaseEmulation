package com.apyatnitskiy;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class FileWorker {
    File file = new File("DB.txt");
    public void flush(List<User> userList){
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {
                for(User user : userList)
                out.print(user.toString() + "\n");
            } finally {
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
