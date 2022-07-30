import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        System.out.println("Введите число, для того, что-бы определить является ли оно простым: ");
        int num;
        boolean isPrime;

        num = (int) System.in.read();

        if(num < 2) isPrime = false;
        else isPrime = true;

        for (int i = 2; i <= num/i; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }

        }
        if (isPrime) System.out.println("Простое число");
        else System.out.println("Не простое число");
    }
}