import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//Класс CSVReader предназначен для чтения данных из CSV-файла
public class CSVReader {

  //Разделитель полей в CSV-файле
    public static final String delimiter = "	";
  
  //Метод  осуществляет чтение данных из CSV-файла и вывод их на экран
  public static void read(String csvFile) {
    try {
      // Создание объекта файла и потока чтения из файла
      File file = new File(csvFile);
      FileReader fr = new FileReader(file);
      BufferedReader br = new BufferedReader(fr);
       // Чтение данных из файла построчно и вывод их на экран
      String line = " ";
      String[] tempArr;
      while ((line = br.readLine()) != null) {
          tempArr = line.split(delimiter);
          for (String tempStr : tempArr) {
              System.out.print(tempStr + " ");
          }
          System.out.println();
      }

      // Закрытие потока чтения из файла
      br.close();
    }
    catch(IOException ioe) {
      ioe.printStackTrace();
    }
    
}
}
