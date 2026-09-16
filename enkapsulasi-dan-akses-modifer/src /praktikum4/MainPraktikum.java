public class MainPraktikum {
    public static void main(String[] args) {
        // Inisialisasi objek mobil menggunakan data Honda Mobilio RS (Tahun 2021)
        Mobil mobilSaya = new Mobil("Honda Mobilio RS 2021", 160, "1.5L SOHC i-VTEC", 5);

        System.out.println("=== INFO KENDARAAN ===");
        mobilSaya.tampilkanInfoKendaraan();

        System.out.println("\n=== INFO KHUSUS MOBIL ===");
        mobilSaya.tampilkanInfoMobil();
    }
}
