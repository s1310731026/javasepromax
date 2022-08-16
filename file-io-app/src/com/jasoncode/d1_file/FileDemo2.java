package com.jasoncode.d1_file;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileDemo2 {
    public static void main(String[] args) {
        File f1 = new File("C:/Users/jason/Pictures/Saved Pictures/94573417_p0.jpg");
        System.out.println(f1.getPath());
        System.out.println(f1.getName());
        System.out.println(f1.length());
        long time = f1.lastModified();
        System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(time));
    }
}
