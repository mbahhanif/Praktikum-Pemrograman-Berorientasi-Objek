package tugas4;

/**
 * Subclass Pekerja yang mewarisi (extends) dari kelas Manusia.
 * Menambahkan atribut khusus 'gaji' dengan akses private.
 */
public class Pekerja extends Manusia {
    private double gaji;

    // Konstruktor Pekerja yang memanggil konstruktor induk (Manusia) menggunakan super()
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }

    // Getter untuk mengambil nilai gaji
    public double getGaji() {
        return gaji;
    }

    // Setter untuk mengupdate nilai gaji
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Meng-override method toString() bawaan Object untuk memformat tampilan data pekerja
    @Override
    public String toString() {
        return "Data Pekerja:\n" +
                "- Nama      : " + getNama() + "\n" +           // Menggunakan getter karena nama bersifat private
                "- Usia      : " + usia + " tahun\n" +           // Mengakses langsung usia karena bersifat protected
                "- Pekerjaan : " + pekerjaan + "\n" +          // Mengakses langsung pekerjaan karena bersifat public
                "- Gaji      : Rp " + String.format("%,.2f", gaji);
    }
}
