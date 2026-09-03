package Tugas;

public class TasSelempang extends Tas {
    private int panjangTali;
    private String bahan;

    public TasSelempang(
            String merk,
            String warna,
            int panjangTali,
            String bahan
    ) {
        super(merk, warna);
        this.panjangTali = panjangTali;
        this.bahan = bahan;
    }

    public void aturPanjangTali(int panjangBaru) {
        panjangTali = panjangBaru;

        System.out.println(
                "Panjang tali diatur menjadi "
                + panjangTali + " cm."
        );
    }

    public void simpanDompet() {
        System.out.println(
                "Dompet disimpan di dalam tas selempang."
        );
    }

    @Override
    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Panjang tali : " + panjangTali + " cm");
        System.out.println("Bahan        : " + bahan);
    }
}