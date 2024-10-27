import java.util.Scanner;

public class TiketWisata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama destinasi: ");
        String destinasi = scanner.nextLine();

        System.out.print("Masukkan jumlah tiket: ");
        int jumlahTiket = scanner.nextInt();

        int hargaTiket = 100000; // Harga tiket sementara
        int totalHarga = jumlahTiket * hargaTiket;

        System.out.println("Total harga untuk " + jumlahTiket + " tiket ke " + destinasi + " adalah Rp" + totalHarga);
    }
}