import java.util.Scanner;

public class PRAK104_2310817310004_MSAMILRENDYNORSALEH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tangan Abu (3 ronde): ");
        String[] abu = scanner.nextLine().split(" ");

        System.out.print("Tangan Bagas (3 ronde): ");
        String[] bagas = scanner.nextLine().split(" ");

        int poinAbu = 0, poinBagas = 0;

        for (int i = 0; i < 3; i++) {
            if (abu[i].equals(bagas[i])) continue;
            if ((abu[i].equals("B") && bagas[i].equals("G")) ||
                (abu[i].equals("G") && bagas[i].equals("K")) ||
                (abu[i].equals("K") && bagas[i].equals("B"))) {
                poinAbu++;
            } else {
                poinBagas++;
            }
        }

        if (poinAbu > poinBagas) {
            System.out.println("Abu");
        } else if (poinBagas > poinAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }

        scanner.close();
    }
}
