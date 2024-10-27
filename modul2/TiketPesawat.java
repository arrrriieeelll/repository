public class TiketPesawat {
    private String nm;
    private String asal;
    private String dst;
    private String tiket;
    private String disk;

    public TiketPesawat(String nmInfo, String aSal, String dst, double Tiket, double distance)
    {
        this.nm = nm;
        this.asal = asal;
        this.dst = dst;
        this.tiket = tiket;
        this.disk = disk;
    }
    public double hbt() {
        return tiket - (tiket *(disk / 100));
    }

    public double h(){
        return tiket * (disk / 100);
    }

    public void t(){
        System.out.println("nama penumpang: " +nm);
        System.out.println("asal: " +asal);
        System.out.println("tujuan: " +dst);
        System.out.println("harga tiket: " +tiket);
        System.out.println("diskon: " +disk + "%");
        System.out.println("biaya tiket seblum diskon: " +hbt());
        System.out.println("jumlah diskon: " +h());
    }
}

