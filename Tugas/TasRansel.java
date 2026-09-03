package Tugas;

public class TasRansel extends Tas {
    private int jumlahKompartemen;
    private boolean memilikiLaptopSleeve;

    public TasRansel(
            String merk,
            String warna,
            int jumlahKompartemen,
            boolean memilikiLaptopSleeve
    ) {
        super(merk, warna);
        this.jumlahKompartemen = jumlahKompartemen;
        this.memilikiLaptopSleeve = memilikiLaptopSleeve;
    }

    public void aturTali() {
        System.out.println("Panjang tali ransel telah diatur.");
    }

    public void masukkanBuku() {
        System.out.println("Buku dimasukkan ke dalam tas ransel.");
    }

    @Override
    public void cetakInformasi() {
        super.cetakInformasi();

        System.out.println(
                "Jumlah kompartemen : " + jumlahKompartemen
        );

        System.out.println(
                "Laptop sleeve      : "
                + (memilikiLaptopSleeve ? "Ada" : "Tidak ada")
        );
    }
}