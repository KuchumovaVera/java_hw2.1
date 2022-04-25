public class Main {
    public static void main(String[] args) {
        double price =5624.25; // стоимость билета
        int bonusPrice =20; //количество рублей для одной бонусной милли
        int mile = (int)price/bonusPrice; // количество бонусных миль

        System.out.println(mile);
    }
}
