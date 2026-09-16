package tugas4;

/**
 * Main Class untuk menguji pembuatan objek Pekerja,
 * penggunaan Getter/Setter, method toString(), serta pengujian Access Modifier.
 */
public class Main {
    public static void main(String[] args) {
        // 1. Membuat objek Pekerja dengan nama Muhammad Hanif Raharjo
        Pekerja pekerja1 = new Pekerja("Muhammad Hanif Raharjo", 21, "Software Engineer", 9500000);

        // 2. Menampilkan data awal pekerja menggunakan method toString() yang telah di-override
        System.out.println("=== DATA AWAL PEKERJA ===");
        System.out.println(pekerja1.toString());

        // 3. Mengubah nama pekerja menggunakan method setter
        pekerja1.setNama("Muhammad Hanif Raharjo, S.Kom.");
        System.out.println("\n=== SETELAH PERUBAHAN NAMA (SETTER) ===");
        System.out.println(pekerja1.toString());

        // 4. Menguji akses langsung terhadap atribut berdasarkan Access Modifier-nya
        System.out.println("\n=== PERCOBAAN AKSES LANGSUNG ATRIBUT ===");

        // [BERHASIL] Atribut 'pekerjaan' bersifat public, bisa diakses langsung dari mana saja
        System.out.println("Akses langsung pekerjaan (public) : " + pekerja1.pekerjaan);

        // [BERHASIL] Atribut 'usia' bersifat protected, bisa diakses langsung karena masih dalam 1 package (tugas4)
        System.out.println("Akses langsung usia (protected)   : " + pekerja1.usia + " tahun");

        // [ERROR JIKA DI-UNCOMMENT] Atribut private tidak bisa diakses langsung dari luar kelasnya
        // pekerja1.nama = "Hanif"; // Compilation Error: nama has private access in Manusia
        // System.out.println(pekerja1.gaji); // Compilation Error: gaji has private access in Pekerja
    }
}
