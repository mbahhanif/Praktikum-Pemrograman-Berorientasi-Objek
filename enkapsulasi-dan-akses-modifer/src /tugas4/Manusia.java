package tugas4;

/**
 * Superclass Manusia yang menerapkan konsep Access Modifier:
 * - nama (private)     : Hanya dapat diakses di dalam kelas Manusia
 * - usia (protected)   : Dapat diakses oleh subclass dan kelas dalam package yang sama
 * - pekerjaan (public) : Dapat diakses secara bebas dari mana saja
 */
public class Manusia {
    private String nama;
    protected int usia;
    public String pekerjaan;

    // Konstruktor untuk menginisialisasi atribut Manusia
    public Manusia(String nama, int usia, String pekerjaan) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }

    // Getter untuk mengambil nilai nama (karena atribut nama bersifat private)
    public String getNama() {
        return nama;
    }

    // Setter untuk mengubah nilai nama
    public void setNama(String nama) {
        this.nama = nama;
    }
}
