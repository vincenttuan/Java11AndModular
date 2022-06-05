package com;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FilesEnhancements {
    public static void main(String[] args) throws Exception {
        String fileName = "/Users/vincenttuan/NetBeansProjects/Java11NewFeature/src/main/java/com/demo.txt";
        String content = "Hello Java 11";
        Path path = Paths.get(fileName);
        
        Files.deleteIfExists(path);
        
        // 資料寫入
        Files.writeString(Files.createFile(path), content, StandardOpenOption.WRITE);
        System.out.println("資料寫入成功\n");
        
        // 資料讀取
        String result = Files.readString(path);
        System.out.println(result);
        System.out.println("資料讀取成功");
    }
}
