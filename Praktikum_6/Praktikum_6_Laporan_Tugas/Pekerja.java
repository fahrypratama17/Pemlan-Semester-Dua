import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private int hariMasuk;
    private int bulanMasuk;
    private int tahunMasuk; 
    private int jumlahAnak;

    public Pekerja(double g, int hm, int bm, int tm, String na, String ni, boolean jk, boolean m, int ja) {
        super(na, ni, jk, m);
        this.gaji = g;
        this.hariMasuk = hm;
        this.bulanMasuk = bm;
        this.tahunMasuk = tm;
        this.jumlahAnak = ja;
    }

    public double getGaji() {
        return gaji;
    }

    public double getBonus() {
        int tahunSekarang = LocalDate.now().getYear();
        int lamaBekerja = tahunSekarang - tahunMasuk;

        if (lamaBekerja >= 10) {
            return gaji * 0.15;
        } else if (lamaBekerja >= 5) {
            return gaji * 0.10;
        } else {
            return gaji * 0.05;
        }
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + gaji + getBonus() + (jumlahAnak * 20);
    }

    @Override
    public String toString() {
        return super.toString() +
               "tanggal masuk : " + hariMasuk + " " + bulanMasuk + " " + tahunMasuk + "\n" +
               "jumlah anak : " + jumlahAnak + "\n" +
               "gaji : " + gaji + "\n";
    }
}
