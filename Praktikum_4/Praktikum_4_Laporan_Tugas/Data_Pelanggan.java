public class Data_Pelanggan {

    private final String nomorPelanggan;
    private final String namaPelanggan;
    private double saldoPelanggan;
    private final String pinPelanggan;
    private int banyakPercobaan = 0;
    private boolean diblokir = false;

    public Data_Pelanggan(String np, String n, double s, String p) {
        this.nomorPelanggan = np;
        this.namaPelanggan = n;
        this.saldoPelanggan = s;
        this.pinPelanggan = p;
    }

    public String getNomorPelanggan() {
        return nomorPelanggan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public double getSaldoPelanggan() {
        return saldoPelanggan;
    }

    public boolean pelangganDiblokir() {
        return diblokir;
    }

    public boolean autentikasi(String nomorPelanggan, String pinPelanggan) {
        if (diblokir) {
            System.out.println("Akun diblokir. Datangi petugas atau hubungi customer service.");
            return false;
        }

        if (this.nomorPelanggan.equals(nomorPelanggan) && this.pinPelanggan.equals(pinPelanggan)) {
            return true;
        } else {
            banyakPercobaan++;
            System.out.println("Autentikasi gagal. Percobaan ke-" + banyakPercobaan);
            if (banyakPercobaan == 3) {
                diblokir = true;
                System.out.println("Akun telah diblokir karena 3x kesalahan.");
            }
            return false;
        }
    }

    public void topUp(double jumlah) {
        if (jumlah > 0) {
            saldoPelanggan += jumlah;
            System.out.println("Top up berhasil! Saldo saat ini: Rp" + saldoPelanggan);
        } else {
            System.out.println("Top up gagal! Jumlah harus lebih dari 0 Rupiah.");
        }
    }

    public void pembelian(double jumlah) {
        double cashback = hitungCashback(jumlah);
        double totalBiaya = jumlah - cashback;

        if (saldoPelanggan < 10000) {
            System.out.println("Transaksi gagal! Saldo minimal Rp10.000.");
        } else {
            saldoPelanggan -= totalBiaya;
            System.out.println("Pembelian sukses! Cashback Rp" + cashback + " telah ditambahkan.");
            System.out.println("Saldo saat ini: Rp" + saldoPelanggan);
        }
    }

    private double hitungCashback(double jumlah) {
        String kodeJenis = nomorPelanggan.substring(0, 2);
        if (jumlah > 1000000) {
            switch (kodeJenis) {
                case "38":
                    return jumlah * 0.05;
                case "56":
                    return jumlah * 0.07;
                case "74":
                    return jumlah * 0.10;
            }
        } else {
            switch (kodeJenis) {
                case "56":
                    return jumlah * 0.02;
                case "74":
                    return jumlah * 0.05;
            }
        }
        return 0;
    }
}
