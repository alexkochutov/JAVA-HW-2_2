public class Main {
    public static void main(String[] args) {

        int account = 100;      // Баланс до пополнения
        int payment = 1100;     // Сумма пополнения
        int delimiter = 100;    // Рублей в платеже за один бонусный рубль

        if (payment > 1000) {
            System.out.println("За платеж в " + payment + " рублей начислено " + (payment / delimiter) + " бонусных рублей.");
            System.out.println("После пополнения на счете: " + (account + payment + (payment / delimiter)));
        } else {
            System.out.println("Суммы пополнения недостаточно для начисления бонусных рублей.");
            System.out.println("После пополнения на счете: " + (account + payment));
        }

    }
}
