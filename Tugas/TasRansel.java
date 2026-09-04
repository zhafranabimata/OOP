package Tugas;

public class TasRansel extends Tas {
    private double kapasitasMaksimal;
    private double beratIsi;

    public TasRansel(String merk, String warna, double kapasitasMaksimal) {
        super(merk,warna);
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.beratIsi = 0;
    }

    public void tambahBarang(double beratBarang) {
        if (beratIsi + beratBarang <= kapasitasMaksimal) {
            beratIsi += beratBarang;

            System.out.println(
                    "Barang ditambahkan. Berat isi: "
                    + beratIsi + " kg"
            );
        } else {
            System.out.println(
                    "Barang tidak dapat ditambahkan karena melebihi kapasitas."
            );
        }
    }

    public void keluarkanBarang(double beratBarang) {
        beratIsi -= beratBarang;

        if (beratIsi < 0) {
            beratIsi = 0;
        }

        System.out.println(
                "Barang dikeluarkan. Berat isi: "
                + beratIsi + " kg"
        );
    }

    @Override
    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Kapasitas maksimal : "
                + kapasitasMaksimal + " kg");
        System.out.println("Berat isi          : "
                + beratIsi + " kg");
    }
}