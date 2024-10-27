import java.util.Scanner;

public class refactTiket {
    private static final int HARGA_TIKET_DASAR = 100000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama destinasi: ");
        String destinasi = scanner.nextLine();

        System.out.print("Masukkan jumlah tiket: ");
        int jumlahTiket = scanner.nextInt();

        int totalHarga = hitungTotalHarga(jumlahTiket);

        System.out.println("Total harga untuk " + jumlahTiket + " tiket ke " + destinasi + " adalah Rp" + totalHarga);
    }

    private static int hitungTotalHarga(int jumlahTiket) {
        return jumlahTiket * HARGA_TIKET_DASAR;
    }
}