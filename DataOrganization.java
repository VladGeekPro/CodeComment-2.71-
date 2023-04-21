


/*
  Класс DataOrganization содержит метод main, который использует классы Currency, CSVReader и CSVWriter
  для  чтения и записи CSV-файлов, создания и клонирования и сравнения объектов класса Currency.
 */
public class DataOrganization {
    
    /*
     Метод main создает объекты класса Currency, вызывает их методы, сравнивает объекты 
     а также использует методы класса CSVReader и CSVWriter для чтения и записи CSV-файлов.
     CloneNotSupportedException если клонирование объекта не поддерживается.
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        
        // Создание объекта c1 класса Currency
        Currency c1 = new Currency("USD","TDA","01/06/2022",14.2,89);
        c1.displaycurrency();
        
        // Создание объекта c2 класса Currency с помощью конструктора копирования
        Currency c2 = new Currency(c1);
        System.out.println("\n");
        c2.displaycurrency();
        
        // Создание объекта c3 класса Currency с помощью метода clone()
        Currency c3 = (Currency) c1.clone();
        System.out.println("\n");
        c3.displaycurrency();
        
        // Создание объекта c4 класса Currency
        Currency c4 = new Currency("MDL","TDA","01/06/2022",14.2,89);
        System.out.println("\n");
        c4.displaycurrency();
        
        // Сравнение объектов класса Currency
        System.out.println("\nAre c1 and c2 equal? - " + c1.equals(c2));
        System.out.println("\nAre c4 and c2 equal? - " + c4.equals(c2));

        // Чтение и запись CSV-файлов
        String csvFile = "C:\\Users\\Vlad\\Desktop\\CurrencyData.csv";
        CSVReader.read(csvFile);
        CSVWriter.writeDataLineByLine(csvFile);
    }
}
