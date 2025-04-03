public class Buku{
    private final String kategori;
    private final String judul;
    private final String penulis;
    private final String penerbit;
    private final String tahunTerbit;
    private final int jumlahHalaman;
    private final String ukuranBuku;
    private final String ISBN; 
    private final String Sinopsis;

    public Buku(String k, String j, String ps, String pt, String t, int h, String u, String i, String s) {
        this.kategori = k;
        this.judul = j;
        this.penulis = ps;
        this.penerbit = pt;
        this.tahunTerbit = t;
        this.jumlahHalaman = h;
        this.ukuranBuku = u;
        this.ISBN = i;
        this.Sinopsis = s;
    }

    public void displayMessage(){
        System.out.printf("%-22s :  %s \n","Kategori Buku", this.kategori);
        System.out.printf("%-22s :  %s \n","Judul Buku", this.judul);
        System.out.printf("%-22s :  %s \n","Penulis Buku", this.penulis);
        System.out.printf("%-22s :  %s \n","Penerbit Buku", this.penerbit);
        System.out.printf("%-22s :  %s \n","Tahun Terbit Buku", this.tahunTerbit);
        System.out.printf("%-22s :  %d \n","Jumlah Halaman Buku", this.jumlahHalaman);
        System.out.printf("%-22s :  %s \n","Ukuran Buku Buku", this.ukuranBuku);
        System.out.printf("%-22s :  %s \n","ISBN Buku", this.ISBN);
        System.out.printf("%-22s :  %s \n","Sinopsis Buku", this.Sinopsis);
        System.out.printf("%-22s :  %s \n\n","Jumlah Kata Sinopsis", menghitungKataSinopsis());
    }

    public int menghitungKataSinopsis() {
        return Sinopsis.trim().split(" ").length;
    }


    public double cekPersenKesamaan(Buku sama) {
        int totalAtribut = 9;
        int kesamaan = 0;

        if (this.kategori.equals(sama.kategori)) kesamaan++;
        if (this.judul.equals(sama.judul)) kesamaan++;
        if (this.penulis.equals(sama.penulis)) kesamaan++;
        if (this.penerbit.equals(sama.penerbit)) kesamaan++;
        if (this.tahunTerbit.equals(sama.tahunTerbit)) kesamaan++;
        if (this.jumlahHalaman == sama.jumlahHalaman) kesamaan++;
        if (this.ukuranBuku.equals(sama.ukuranBuku)) kesamaan++;
        if (this.ISBN.equals(sama.ISBN)) kesamaan++;
        if (this.Sinopsis.equals(sama.Sinopsis)) kesamaan++;

        return (kesamaan / (double) totalAtribut ) * 100; 
    }

    public Buku copyBuku() {
        return new Buku(this.kategori, this.judul, this.penulis, this.penerbit, this.tahunTerbit, 
                        this.jumlahHalaman, this.ukuranBuku, this.ISBN, this.Sinopsis);
    }

    public double hitungRoyalti(double hargaBuku){
        return (hargaBuku * 30) * 0.1;
    }

    public double hitungRoyalti(double hargaBuku, int royalti){
        return (hargaBuku * 30) / royalti;
    }
}