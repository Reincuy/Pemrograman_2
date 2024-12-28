package soal1;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

class Dadu {
    private int nilai;

    public Dadu() {
        acakNilai();
    }

    public void acakNilai() {
        Random random = new Random();
        this.nilai = random.nextInt(6) + 1;
    }

    public int getNilai() {
        return nilai;
    }
}

public class PRAK301_2310817310004_MSAMILRENDYNORSALEH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Dadu> daduList = new LinkedList<>();

        System.out.print("Masukkan jumlah dadu: ");
        int jumlahDadu = scanner.nextInt();

        int totalNilai = 0;

        for (int i = 1; i <= jumlahDadu; i++) {
            Dadu dadu = new Dadu();
            daduList.add(dadu);
            System.out.println("Dadu ke-" + i + " bernilai " + dadu.getNilai());
            totalNilai += dadu.getNilai();
        }

        System.out.println("Total nilai dadu keseluruhan " + totalNilai);
        scanner.close();
    }
}
