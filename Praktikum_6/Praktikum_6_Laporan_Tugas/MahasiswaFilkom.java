public class MahasiswaFilkom extends Manusia {
    private String NIM;
    private double IPK;

    public MahasiswaFilkom(String ni, double ip, String na, String nik, boolean jk, boolean m) {
        super(na, nik, jk, m);
        this.NIM = ni;
        this.IPK = ip;
    }

    public String getStatus() {
        String angkatan = "20" + NIM.substring(0, 2);
        char kodeProdi = NIM.charAt(6);
        String prodi;

        if (kodeProdi == '2') {
            prodi = "Teknik Informatika";
        } else if (kodeProdi == '3') {
            prodi = "Teknik Komputer";
        } else if (kodeProdi == '4') {
            prodi = "Sistem Informasi";
        } else if (kodeProdi == '6') {
            prodi = "Pendidikan Teknologi Informasi";
        } else {
            prodi = "Teknologi Informasi";
        }

        return prodi + ", " + angkatan;
    }

    public double getBeasiswa() {
        if (IPK >= 3.5 && IPK <= 4.0) return 75.0;
        if (IPK >= 3.0 && IPK < 3.5) return 50.0;
        return 0.0;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }

    @Override
    public String toString() {
        return super.toString() +
               "NIM : " + NIM + "\n" +
               "IPK : " + IPK + "\n" +
               "Status : " + getStatus() + "\n";
    }
}
