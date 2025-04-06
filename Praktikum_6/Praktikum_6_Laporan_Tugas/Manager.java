public class Manager extends Pekerja {
    private String departemen;

    public Manager(String d, double g, int hm, int bm, int tm, String na, String ni, boolean jk, boolean m, int ja) {
        super(g, hm, bm, tm, na, ni, jk, m, ja);
        this.departemen = d;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + (0.1 * getGaji());
    }

    @Override
    public String toString() {
        return super.toString() +
               "departemen : " + departemen + "\n";
    }
}
