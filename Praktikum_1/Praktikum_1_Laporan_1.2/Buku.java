public class Buku{
    private int waktu;

    public void setWaktu(int i){
        this.waktu = hitungWaktu(i);
    }

    private int hitungWaktu(int i){
        return i * 2 * 2;
    }

    public void displayMessage(){
        System.out.println("Anda akan bisa menyelesaikan buku ini dalam " + waktu + " hari.");
    }
}