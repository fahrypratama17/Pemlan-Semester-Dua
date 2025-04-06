public class Manusia {
   private String nama;
   private String NIK;
   private boolean jenisKelamin; 
   private boolean menikah;

    public Manusia(String n, String nik, boolean jk, boolean m) {
        this.nama = n;
        this.NIK = nik;
        this.jenisKelamin = jk;
        this.menikah = m;
    }

    public double getTunjangan() {
        if (menikah) {
            return jenisKelamin ? 25.0 : 20.0;
        }
        return 15.0;
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    @Override
    public String toString() {
        return "nama : " + nama + "\n" +
               "nik : " + NIK + "\n" +
               "jenisKelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan") + "\n" +
               "pendapatan : " + getPendapatan() + "\n";
    }
}
