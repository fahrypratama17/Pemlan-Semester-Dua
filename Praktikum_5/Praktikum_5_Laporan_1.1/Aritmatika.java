public class Aritmatika {
    public void hitungPenjumlahan(int a, int b) {
        int nilai = a + b;
        System.out.println("nilai penjumlahan adalah : "+nilai);
    }

    public static void hitungPerkalian(int a, int b) {
        int nilai = a * b;
        System.out.println("nilai perkalian adalah : " + nilai);
    }

    public static void hitungPengurangan(int a, int b) {
        int nilai = a - b;
        System.out.println("nilai pengurangan adalah : "+nilai);
    }

    public double hitungPembagian(String nil1, String nil2) {
        double nilai1 = Double.parseDouble(nil1);
        double nilai2 = Double.parseDouble(nil2);

        double nilai = nilai1 / nilai2;
        return nilai;
    }
}   
