package com.tang;

import java.io.*;

/**
 * Created by Administrator on 2018/11/24.
 */
public class Buffered {
    public static void main(String[] args) {
        try {
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("abc.txt",true));
            bufferedWriter.write("dbjbdsk");
            for (int i = 0; i <10 ; i++) {
                bufferedWriter.write("hello"+i);
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader("abc.txt"));
            /*int ch;
            while ((ch=bufferedReader.read())!=-1){
                System.out.print(""+(char)ch);

            }*/
            /*char[] by=new char[1024];
            int len;
            while ((len=bufferedReader.read(by))!=-1){
                System.out.println("________________"+new String(by,0,len));
            }*/
            String line;
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(""+line);
            }


            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
