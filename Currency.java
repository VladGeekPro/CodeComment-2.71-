public class Currency implements Cloneable{
   
// Переменные 
String cname1;		// Название валюты 1
String cname2;		// Название валюты 2
String data;		// Дата
Double value;		// Значение
Integer number;		// Ид

// Создает новый объект Currency с значениями по умолчанию.
public Currency() {}

/*
 Создает новый объект Currency с заданными параметрами. 
  c1 Название валюты 1
  c2 Название валюты 2
  d Дата
  v Значение
  n ид
 */
public Currency(String c1, String c2, String d, double v, int n ) 
{
	this.cname1 = c1;
	this.cname2 = c2;
	this.data = d;
	this.value = v;
	this.number = n;
}

/* Конструктор копирования создает новый объект Currency на основе существующего объекта.
   currency Существующий объект Currency*/
public Currency(Currency currency )
{
	this.cname1 = currency.cname1;
	this.cname2 = currency.cname2;
	this.data = currency.data;
	this.value = currency.value;
	this.number = currency.number;  
}

// Отображает информацию о валюте.
public void displaycurrency()
{
	System.out.println("cname1 : " + this.cname1);
	System.out.println("cname2 : " + this.cname2);
	System.out.println("data : " + this.data);
	System.out.println("value : " + this.value);
	System.out.println("number : " + this.number);		
}

//Создает и возвращает копию текущего объекта Currency.

@Override
public Currency clone() throws CloneNotSupportedException 
{
	return (Currency) super.clone();
}

/* Сравнивает текущий объект Currency с другим объектом.
 obj Другой объект для сравнения
 return true, если объекты равны; false в противном случае */
public boolean equals(Object obj)
{
	Currency otherCurrency = (Currency) obj;
	return  this.cname1 == otherCurrency.cname1 &&
			this.cname2 == otherCurrency.cname2 &&
			this.data == otherCurrency.data &&
			this.value == otherCurrency.value &&
			this.number == otherCurrency.number;
}     

}