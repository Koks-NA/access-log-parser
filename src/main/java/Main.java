package main.java;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Счетчик количество верно указанных путей к файлам
        int countTrueSelectPathsFiles = 0;
        while (true) {
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            if (!fileExists || isDirectory) {
                if (!fileExists) {
                    System.out.println("Ошибка: указанный файл не существует");
                } else {
                    System.out.println("Ошибка: указанный путь является путём к папке");
                } continue;
            } else {
                countTrueSelectPathsFiles++;
                System.out.println("Путь указан верно!");
                System.out.println("Это файл номер " + countTrueSelectPathsFiles);
            }
        }
    }
}
