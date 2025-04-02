import java.util.Scanner;

public class BukuRun {
    public static void main (String[] arg){
        Scanner input = new Scanner (System.in);
        Buku book = new Buku();

        System.out.println("Anda hanya sanggup menulis 100 kata per hari");
        System.out.println("100 kata per hari berarti hanya setengah halaman buku\n");

        System.out.print("Masukkan seberapa banyak halaman pada buku anda: ");
        int page = input.nextInt();
        book.setWaktu(page);
        book.displayMessage();
    }
}
