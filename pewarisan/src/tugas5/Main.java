package tugas5;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== BAGIAN 1 & 2: HEWAN & OVERRIDING ===");
        Kucing kucing1 = new Kucing("Kitty");
        Anjing anjing1 = new Anjing("Doggy");

        kucing1.tampilkanInfo();
        System.out.println();
        anjing1.tampilkanInfo();

        System.out.println("\n=== BAGIAN 3: HIERARKI KENDARAAN (3 LEVEL) ===");
        Mobil mobil1 = new Mobil("Toyota", 4, 4);
        SepedaMotor motor1 = new SepedaMotor("Honda", 2, "Matic");

        mobil1.tampilkanInfo();
        System.out.println();
        motor1.tampilkanInfo();
    }
}
