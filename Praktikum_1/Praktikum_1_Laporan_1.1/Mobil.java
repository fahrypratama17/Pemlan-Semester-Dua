public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;
    private double jarak;
    
    public void setNoPlat(String s){
        noPlat = s;
    }
    public void setWarna(String s){
        warna = s;
    }
    public void setManufaktur(String s){
        manufaktur = s;
    }
    public void setKecepatan(int i){
        kecepatan = rubahKecepatan(i);
    }
    public void setWaktu(double i){
        waktu = rubahSekon(i);
    }
    private double rubahSekon(double i){
        return i*3600;
    }
    private int rubahKecepatan(int i){
        return i * 1000 / 3600;
    }
    public void hitungJarak(){
        jarak = kecepatan * waktu / 1000;
    }
    public void displayMessage(){
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memililki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan " + kecepatan + " m/s");
        System.out.println("waktu yang dibutuhkan: " + waktu + " detik");
        System.out.println("Jarak yang ditempuh: " + jarak + " km");
    }
}