public class MainMobil {
    public static void main(String[] args) {
        // Menciptakan object pertama dari class Mobil
        Mobil mobil1 = new Mobil("Toyota", "Supra MK4", 2020, "Hitam");
        mobil1.startEngine();
        mobil1.displayInfo();

        // Menciptakan object kedua dari class Mobil
        Mobil mobil2 = new Mobil("Honda", "Civic Type R", 2023, "Putih Mutiara");
        mobil2.startEngine();
        mobil2.displayInfo();

        // Menguji method setter untuk mengubah warna mobil 1
        System.out.println("UPDATE WARNA MOBIL 1");
        mobil1.setWarna("Oranye Menyala");
        mobil1.displayInfo();
    }
}
