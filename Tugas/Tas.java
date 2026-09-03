package Tugas;

public class Tas {
    private String merk;
    private String warna;

    public Tas(String merk, String warna) {
        this.merk = merk;
        this.warna = warna;
    }

    public void bukaTas() {
        System.out.println("Tas dibuka.");
    }

    public void tutupTas() {
        System.out.println("Tas ditutup.");
    }

    public void cetakInformasi() {
        System.out.println("Merk  : " + merk);
        System.out.println("Warna : " + warna);
    }
}
