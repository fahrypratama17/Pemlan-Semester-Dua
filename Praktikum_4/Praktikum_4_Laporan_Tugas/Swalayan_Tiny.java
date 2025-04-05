import java.util.Scanner;

public class Swalayan_Tiny {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Data_Pelanggan pelanggan1 = new Data_Pelanggan("7412345678", "Budi", 5000, "1234");

        while (true) {
            System.out.println("\n===== SWALAYAN TINY =====");
            System.out.println("1. Top Up");
            System.out.println("2. Pembelian");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            
            int pilihan = input.nextInt();
            input.nextLine(); 

            if (pilihan == 3) {
                System.out.println("Terima kasih telah berbelanja!");
                break;
            }

            System.out.print("Masukkan nomor pelanggan: ");
            String nomorPelanggan = input.nextLine();
            System.out.print("Masukkan PIN: ");
            String pinPelanggan = input.nextLine();

            if (!pelanggan1.autentikasi(nomorPelanggan, pinPelanggan)) {
                continue;
            }

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah top-up: ");
                    double jumlahTopUp = input.nextDouble();
                    pelanggan1.topUp(jumlahTopUp);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah pembelian: ");
                    double jumlahBeli = input.nextDouble();
                    pelanggan1.pembelian(jumlahBeli);
                    break;
                default:
                    System.out.println("Menu tidak valid!");
            }
        }
    }
}