import task1.Database;
import task1.Phone;
import task1.PhoneInterface;
import task1.PhoneServiceImpl;
import task3.*;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

                   //Task 3   Interface    Session
        Product product1 = new Product("Хлеб", 30);
        Product product2 = new Product("Молоко", 40);
        Product product3 = new Product("Яйца", 50);
        Product[] products = {product1, product2, product3};

        Basket basket = new Basket(products);

        Card card = new Card("Иван", "Иванов", "1234-5678-9101-1121", 200, "1234");

        Client client = new Client("Иван", "Иванов", 30, card, basket);

        client.makePurchase("1234");
         /*       Task 3   Interface    Session
            Представьте что вы пришли в супермаркет и совершаете покупку, расплачиваетесь картой,

     если сумма на продукты превышает 100 сом у вас запрашивается пароль, при
        вводе, пароль проверяется и если он не верный, на консоль выводится "не верный
            пароль", а если же он верный вы можете продолжать операцию. если у вас достаточно
средств вы оплачиваете и на консоли вы можете увидеть чек (с названиями и ценами
на продукты и общую сумму на них), а если нет на консоль выводится "у вас не хватает
средств".

Создайте класс Card (firstname, lastname, cardnumber, balance, password).
Создайте класс product (productname, price).
Создайте класс basket (products[] ).
Создайте класс Client с полями(firstname, lastname, age, card, basket).

Создайте interface cardinterface и метод abstract paywithcard(double money) возвращает
чек на купленные продукты и getcardbalance() возвращает баланс на карте. класс CardServiceImp
наследует cardinterface и переопределяет его методы.
             */




       /*          TASK 2    Interface    Session
       ФОРМАТ СООБЩЕНИЯ: FORMATMESSAGE(STRING MESSAGE) МЕТОДУН КАМТЫГАН  MESSAGEFORMATTER ИНТЕРФЕЙСИН ТҮЗҮҢҮЗ.
        КИЙИН БУЛ ИНТЕРФЕЙСТИ ИШКЕ АШЫРГАН  СООБЩЕНИЯЛАРДЫ ФОРМАТТАШТЫРУУНУН АР КАНДАЙ ЖОЛДОРУН
        (ЧОҢ ЖАНА КИЧИНЕ ТАМГА) КАМСЫЗ КЫЛГАН UPPERCASEFORMATTER ЖАНА LOWERCASEFORMATTER КЛАССТАРЫН ИШКЕ
        АШЫРЫҢЫЗ. НЕГИЗГИ ПРОГРАММАДА ЭКИ КЛАССТЫН ТЕҢ ОБЪЕКТИЛЕРИН ТҮЗҮП, АЛАРДЫ ТҮРДҮҮ БИЛДИРҮҮЛӨРГӨ (СООБЩЕНИЯ) КОЛДОНУҢУЗ */

//        task2.MessageFormatter upperFormatter = new task2.UpperCaseFormatter();
//        task2.MessageFormatter lowerFormatter = new task2.LowerCaseFormatter();
//
//        String message = "Enjoy learning Java !";
//        System.out.println("Original: " + message);
//
//        System.out.println("task2.UpperCaseFormatter: " + upperFormatter.formatMessage(message));
//        System.out.println("task2.LowerCaseFormatter: " + lowerFormatter.formatMessage(message));






//           Task 1   Interface    Session
//        PhoneInterface phoneInterface = new PhoneServiceImpl();
//        Phone phone = new Phone("Apple","Iphone","12345", Database.contacts);
//        System.out.println("1 method");
//
//        System.out.println("Command:  ");
//        System.out.println(phoneInterface.turnOn(phone, new Scanner(System.in).nextLine()));

//        System.out.println("2 method");
//        System.out.println("Chaluu jurguzuu uchun telefon nomer jazynyz");
//        System.out.println(phoneInterface.call(new Scanner(System.in).nextLong()) + "chaluu...");
//
//        System.out.println("3 method");
//        System.out.println("Chaluu jurguzuu uchun contacttynn attyn  jazynyz: ");
//        System.out.println(phoneInterface.call(new Scanner(System.in).nextLine()) + "chaluu....");
//
//        System.out.println("4 method");
//        System.out.println("Update kyluu uchun eski atty jazynyz: ");
//        String oldName = new Scanner(System.in).nextLine();
//        System.out.println("jany atty jazynyz: ");
//        String newName = new Scanner(System.in).nextLine();
//        System.out.println(Arrays.toString(phoneInterface.updateContact(oldName, newName)));
//
//
//        System.out.println("5 method");
//        System.out.println("All contacts:  ");
//        System.out.println(Arrays.toString(phoneInterface.getAllContacts()));






}}