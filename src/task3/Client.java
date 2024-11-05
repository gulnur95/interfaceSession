package task3;
public class Client {
    private String firstName;
    private String lastName;
    private int age;
    private Card card;
    private Basket basket;


    public Client(String firstName, String lastName, int age, Card card, Basket basket) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.card = card;
        this.basket = basket;
    }


    public void makePurchase(String password) {

        System.out.println("Ваш баланс:  " + card.getBalance());

        double totalAmount = basket.calculateTotal();
        System.out.println("Общая сумма: " + totalAmount + " сом.");

        String paymentStatus = card.payWithCard(totalAmount, password);
        System.out.println(paymentStatus);

        if (paymentStatus.equals("Оплата успешна!")) {
            System.out.println("Чек:");
            for (Product product : basket.getProducts()) {
                System.out.println(product.getProductName() + " - " + product.getPrice() + " сом");
            }
            System.out.println("Итого: " + totalAmount + " сом");
        }
    }
}

