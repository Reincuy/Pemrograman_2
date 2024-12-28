import java.util.Scanner;

public class PRAK102_2310817310004_MSAMILRENDYNORSALEH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka awal: ");
        int angka = scanner.nextInt();

        int count = 0;
        while (count < 10) {
            if (angka % 5 == 0) {
                System.out.print((angka / 5 - 1) + ", ");
            } else {
                System.out.print(angka + ", ");
            }
            angka++;
            count++;
        }

        scanner.close();
    }
}
