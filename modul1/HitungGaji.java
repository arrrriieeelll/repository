public class HitungGaji{
    
    public int perhitunganGaji(int jamKerja, int gajiperJam) {
        int gajiTotal = 0;
        for (int i = 0; i < jamKerja; i++) {
            gajiTotal += gajiperJam;
        }
        return gajiTotal;
    }

    public static void main(String[] args) {
        HitungGaji hitung = new HitungGaji();

        int gajiTotal = hitung.perhitunganGaji(40, 250000);
        System.out.println("Gaji karyawan dengan 40 jam kerja = " + gajiTotal);
    }
} 
