import java.util.Scanner;

public class PRAK105_2310817310004_MSAMILRENDYNORSALEH {
    public static final double PHI = 3.141592653589793;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double radius = scanner.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double height = scanner.nextDouble();

        double volume = PHI * radius * radius * height;

        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3%n",
                          radius, height, volume);

        scanner.close();
    }
}
