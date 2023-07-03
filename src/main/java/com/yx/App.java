package com.yx;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        int i = 0;
        System.out.println(i);
        try {
            InputStream inputStream = new FileInputStream("./q.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
            }
        }).start();
        A();
        System.out.println("yscjx");
    }
    private static String A(){
        String str = "";
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println("a");
        return str;
    }
}
