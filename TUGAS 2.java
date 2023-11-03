import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka maksimal: ");
        int n = scanner.nextInt();
        int totalGenap = 0;
        int i = 1;

        while (i <= n) {
            if (i % 2 == 0) {
                totalGenap += i;
            }
            i++;
        }

        System.out.println("Jumlah bilangan genap dari 1 hingga " + n + " adalah: " + totalGenap);
    }
}
