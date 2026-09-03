package Tugas;

public class BotolMinum {
    private int kapasitas;
    private String warna;

    public BotolMinum(int kapasitas, String warna) {
        this.kapasitas = kapasitas;
        this.warna = warna;
    }

    public void isiAir() {
        System.out.println("Botol diisi air hingga penuh.");
    }

    public void minum() {
        System.out.println("Air dari botol diminum.");
    }

    public void cetakInformasi() {
        System.out.println("Kapasitas : " + kapasitas + " ml");
        System.out.println("Warna     : " + warna);
    }
}
