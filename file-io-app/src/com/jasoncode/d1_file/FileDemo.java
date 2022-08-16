package com.jasoncode.d1_file;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        // 創建File 對象
        File f = new File("C:"+File.separator+"Users/jason/Pictures/Saved Pictures/94573417_p0.jpg");
        long size = f.length(); //文件字節大小
        System.out.println(size);

        //2. File 創建對象，支持絕對路徑 支持相對路徑(重點)
        File f1 = new File("C:/Users/jason/Pictures/Saved Pictures/94573417_p0.jpg");
        System.out.println(f1.length());

        // 相對路徑
        File f2 = new File("file-io-app/src/com/jasoncode/data.txt");
        System.out.println(f2.length());

        // 相對路徑
        File f3 = new File("C:\\Users\\jason\\Pictures");
        System.out.println(f3.exists());
    }
}
