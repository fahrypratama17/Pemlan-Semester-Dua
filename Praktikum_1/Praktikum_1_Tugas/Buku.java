public class Buku{
    private final String kategori;
    private final String judul;
    private final String penulis;
    private final String penerbit;
    private final String tahunTerbit;
    private final int jumlahHalaman;
    private final String ukuranBuku;
    private final String ISBN; 

    public Buku(String k, String j, String ps, String pt, String t, int h, String u, String i) {
        this.kategori = k;
        this.judul = j;
        this.penulis = ps;
        this.penerbit = pt;
        this.tahunTerbit = t;
        this.jumlahHalaman = h;
        this.ukuranBuku = u;
        this.ISBN = i;
    }

    public void displayMessage(){
        System.out.printf("%-20s :  %s \n","Kategori Buku:", this.kategori);
        System.out.printf("%-20s :  %s \n","Judul Buku:", this.judul);
        System.out.printf("%-20s :  %s \n","Penulis Buku:", this.penulis);
        System.out.printf("%-20s :  %s \n","Penerbit Buku:", this.penerbit);
        System.out.printf("%-20s :  %s \n","Tahun Terbit Buku:", this.tahunTerbit);
        System.out.printf("%-20s :  %d \n","Jumlah Halaman Buku:", this.jumlahHalaman);
        System.out.printf("%-20s :  %s \n","Ukuran Buku Buku:", this.ukuranBuku);
        System.out.printf("%-20s :  %s \n\n","ISBN Buku:", this.ISBN);
    }
}