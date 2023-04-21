import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;



// Класс CSVWriter представляет методы для записи данных в формате CSV в файл.
public class CSVWriter {
   
 //Записывает данные в формате CSV в файл по заданному пути.
 
public static void writeDataLineByLine(String filePath) {
    // создание объекта файла
    File file = new File(filePath);
    try {
        // создание объекта FileWriter
        FileWriter outputfile = new FileWriter(file);

        // создание объекта BufferedWriter для улучшения производительности записи
        BufferedWriter writer = new BufferedWriter(outputfile);
       
        // запись заголовка в файл
        String[] header = {"BTN", "CNY", "08.08.2023", "6,00", "112" };
        writer.newLine();
        writer.write(String.join(",", header));
        writer.newLine();

        // запись данных в файл
        String[] data1 = {"BAM", "NZD", "15.09.2023", "2,89", "897" };
        writer.write(String.join(",", data1));
        writer.newLine();

        String[] data2 = {"BDT", "TJS", "05.01.2022", "19,51", "972" };
        writer.write(String.join(",", data2));
        writer.newLine();

        // закрытие объекта BufferedWriter
        writer.close();
    }
    catch (IOException e) {
        e.printStackTrace();
    }
}
}

    