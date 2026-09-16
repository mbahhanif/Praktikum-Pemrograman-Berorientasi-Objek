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


