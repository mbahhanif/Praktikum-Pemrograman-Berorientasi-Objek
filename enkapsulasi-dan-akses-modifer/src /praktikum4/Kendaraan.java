public class Kendaraan {
    // 1. private: Terkunci rapat di dalam kelas ini
    private String nama;

    // 2. protected: Bebas diakses package sama & subclass
    protected int kecepatanMaks;

    // 3. public: Terbuka bebas untuk umum
    public String jenisMesin;

    // Constructor
    public Kendaraan(String nama, int kecepatanMaks, String jenisMesin) {
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
        this.jenisMesin = jenisMesin;
    }

    // Getter dan Setter khusus untuk variabel private 'nama'
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method publik menampilkan informasi kendaraan
    public void tampilkanInfoKendaraan() {
        System.out.println("Nama Kendaraan     : " + nama);
        System.out.println("Kecepatan Maksimum : " + kecepatanMaks + " km/h");
        System.out.println("Jenis Mesin        : " + jenisMesin);
    }
} 

public class Mobil extends Kendaraan {
    private int jumlahPintu;

    // Constructor memanggil constructor induk pakai super()
    public Mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
        super(nama, kecepatanMaks, jenisMesin);
        this.jumlahPintu = jumlahPintu;
    }

    // Method menampilkan info spesifik mobil
    public void tampilkanInfoMobil() {
        // kecepatanMaks bisa diakses langsung karena modifier-nya protected!
        System.out.println("Kecepatan Maks Mobil : " + kecepatanMaks + " km/h");
        System.out.println("Jumlah Pintu         : " + jumlahPintu);
    }
} 

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
