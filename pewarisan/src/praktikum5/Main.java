package praktikum5;

public class Main {
    public static void main(String[] args) {
        // Objek Mobil Toyota Avanza
        Mobil mobil = new Mobil();
        mobil.nama = "Toyota Avanza";
        mobil.kecepatan = 180;
        mobil.jumlahPintu = 5;
        mobil.tampilkanInfo();

        System.out.println(); // Pemisah baris

        // Objek Sepeda Motor Honda Vario 160
        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Honda Vario 160";
        motor.kecepatan = 115;
        motor.jenisMesin = "4-tak, eSP+";
        motor.tampilkanInfo();
    }
}
