import java.util.Scanner;

public class MainMobil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //instan objek bernama m1
        Mobil m1 = new Mobil();
        System.out.print("Masukkan kecepatan untuk m1: ");
        int kecepatan1 = input.nextInt(); input.nextLine();

        System.out.print("Masukkan manufaktur untuk m1: ");
        String manufaktur1 = input.nextLine();

        System.out.print("Masukkan NoPlat untuk m1: ");
        String NoPlat1 = input.nextLine();

        System.out.print("Masukkan Warna untuk m1: ");
        String Warna1 = input.nextLine();

        System.out.print("Masukkan Waktu untuk m1: ");
        double Waktu1 = input.nextDouble();

        m1.setKecepatan(kecepatan1);
        m1.setManufaktur(manufaktur1);
        m1.setNoPlat(NoPlat1);
        m1.setWarna(Warna1);
        m1.setWaktu(Waktu1);
        m1.hitungJarak();
        m1.displayMessage();
        System.out.println("================");

        // instan objek baru bernama m2
        Mobil m2 = new Mobil();
        System.out.print("Masukkan kecepatan untuk m2: ");
        int kecepatan2 = input.nextInt(); input.nextLine();

        System.out.print("Masukkan manufaktur untuk m2: ");
        String manufaktur2 = input.nextLine();

        System.out.print("Masukkan NoPlat untuk m2: ");
        String NoPlat2 = input.nextLine();

        System.out.print("Masukkan Warna untuk m2: ");
        String Warna2 = input.nextLine();

        System.out.print("Masukkan Waktu untuk m2: ");
        double Waktu2 = input.nextDouble(); input.nextLine();

        m2.setKecepatan(kecepatan2);
        m2.setManufaktur(manufaktur2);
        m2.setNoPlat(NoPlat2);
        m2.setWarna(Warna2);
        m2.setWaktu(Waktu2);
        m2.hitungJarak();
        m2.displayMessage();
        System.out.println("================");
        //merubah warna dari objek m1
        System.out.print("mobil pada objek m1 di rubah menjadi warna lain: ");
        Warna1 = input.nextLine();
        m1.setWarna(Warna1);
        //menampilkan hasil perubahan
        m1.displayMessage();
    }
}