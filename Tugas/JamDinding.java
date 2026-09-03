package Tugas;

public class JamDinding {
    private String merk;
    private int diameter;

    public JamDinding(String merk, int diameter) {
        this.merk = merk;
        this.diameter = diameter;
    }

    public void aturWaktu() {
        System.out.println(
                "Waktu pada jam dinding telah diatur."
        );
    }

    public void gantiBaterai() {
        System.out.println(
                "Baterai jam dinding telah diganti."
        );
    }

    public void cetakInformasi() {
        System.out.println("Merk     : " + merk);
        System.out.println("Diameter : " + diameter + " cm");
    }
}
