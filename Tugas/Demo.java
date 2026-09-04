package Tugas;

public class Demo {
    public static void main(String[] args) {

        Tas tas = new Tas("Eiger", "Hitam");

        System.out.println("=== TAS ===");
        tas.bukaTas();
        tas.tutupTas();
        tas.cetakInformasi();

       TasRansel ransel = new TasRansel("Eiger", "Hijau", 10);

        System.out.println("\n=== TAS Ransel ===");
        ransel.bukaTas();
        ransel.tambahBarang(3.5);
        ransel.tambahBarang(2.5);
        ransel.keluarkanBarang(1);
        ransel.cetakInformasi();
        ransel.tutupTas();

        TasSelempang selempang = new TasSelempang(
                "Bodypack",
                "Cokelat",
                100,
                "Kanvas"
        );

        System.out.println("\n=== TAS SELEMPANG ===");
        selempang.bukaTas();
        selempang.aturPanjangTali(90);
        selempang.simpanDompet();
        selempang.cetakInformasi();
        selempang.tutupTas();

        BotolMinum botol = new BotolMinum(
                750,
                "Biru"
        );

        System.out.println("\n=== BOTOL MINUM ===");
        botol.isiAir();
        botol.minum();
        botol.cetakInformasi();

        JamDinding jam = new JamDinding(
                "Quartz",
                30
        );

        System.out.println("\n=== JAM DINDING ===");
        jam.aturWaktu();
        jam.gantiBaterai();
        jam.cetakInformasi();
    }
}

