package task3;
public class Card implements CardInterface {
    private String firstName;
    private String lastName;
    private String cardNumber;
    private double balance;
    private String password;

    public Card(String firstName, String lastName, String cardNumber, double balance, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String payWithCard(double totalAmount, String inputPassword) {
        if (totalAmount > 100) {
            if (!inputPassword.equals(this.password)) {
                return "Неверный пароль!";
            }
        }

        if (balance >= totalAmount) {
            balance -= totalAmount;
            return "Оплата успешна!";
        } else {
            return "У вас не хватает средств.";
        }
    }


    @Override
    public double getCardBalance() {
        return balance;
    }
}

    /*
            Представьте что вы пришли в супермаркет и совершаете покупку, расплачиваетесь
картой, если сумма на продукты превышает 100 сом у вас запрашивается пароль, при
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

