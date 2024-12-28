import java.util.Scanner;

public class PRAK103_2310817310004_MSAMILRENDYNORSALEH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris (N): ");
        int N = scanner.nextInt();

        System.out.print("Masukkan angka awal: ");
        int angka = scanner.nextInt();

        int count = 0;
        do {
            if (angka % 2 != 0) {
                System.out.print(angka + (count < N - 1 ? ", " : ""));
                count++;
            }
            angka++;
        } while (count < N);

        scanner.close();
    }
}
