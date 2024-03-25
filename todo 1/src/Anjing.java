public class Anjing {
    String nama;
    String ras;
    String warna;
    int usia;

    public Anjing(String nama, String ras, String warna, int usia) {
        this.nama = nama;
        this.ras = ras;
        this.warna = warna;
        this.usia = usia;
    }

//    methhod
    public void makan() {
        System.out.println(nama + " lagi makan.");
    }

    public void berlari() {
        System.out.println(nama + " sedang berlari.");
    }

    public void tidur() {
        System.out.println(nama + " lagi tidur.");
    }

    public void menggongong() {
        System.out.println(nama + " sedang menggonggong: gukguk!");
    }
}
