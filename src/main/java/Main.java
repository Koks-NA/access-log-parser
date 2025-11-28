import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
                try {
                    FileReader fileReader = new FileReader(path);
                    BufferedReader reader = new BufferedReader(fileReader);
                    String line;
                    int totalLines=0;
                    int maxLength=0;
                    int minLength=Integer.MAX_VALUE;
                    while ((line = reader.readLine()) != null) {
                        int length = line.length();
                        totalLines++;//считаем строки
                        if(length>maxLength){
                            maxLength=length; //ищем максимальную длину строки
                        }
                        if(length<minLength){
                            minLength=length; //ищем минимальную длину строки
                        }
                        if (length>1024){
                            throw new LongLineException ("Строка слишком длинная: " + length + " символов");
                        }
                    }
                    System.out.println("Количество строк в файле: "+totalLines);
                    System.out.println("Максимальная длина строки: "+maxLength);
                    System.out.println("Минимальная длина строки: "+minLength);

                    reader.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                System.out.println("Это файл номер " + countTrueSelectPathsFiles);
            }
        }
    }
}
