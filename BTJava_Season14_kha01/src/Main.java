import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            try {
                System.out.print("Nhập một số nguyên: ");
                int number = scanner.nextInt();
                if (number <= 0) {
                    System.out.println("Phải nhập số >0");
                } else {
                    if (isPrime(number)) {
                        System.out.println(number + " là số nguyên tố.");
                        System.exit(0);
                    } else {
                        System.out.println(number + " không phải là số nguyên tố.");
                        System.exit(0);
                    }
                }
            } catch (Exception e) {
                System.out.println("Vui lòng nhập một số nguyên.");
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
