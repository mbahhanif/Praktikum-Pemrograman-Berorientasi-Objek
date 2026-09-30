package Responsi;

public class Main {
    public static void main(String[] args) {
        // 1. Output Produk
        System.out.println("1. Output Produk");
        Produk laptop = new Elektronik("Laptop", 15000000, 2);
        laptop.tampilkanInfo();

        System.out.println();

        // 2. Output Pegawai
        System.out.println("2. Output Pegawai");
        Pegawai pegawaiTetap = new PegawaiTetap("Luqman", 5000000, 1000000); // Ganti "Budi" dengan nama Anda jika diperlukan
        pegawaiTetap.tampilkanInfo();

        System.out.println();

        // 3. Output Polimorfisme
        System.out.println("3. Output Polimorfisme");

        // Polimorfisme menggunakan referensi kelas induk Produk
        Produk snack = new Makanan("Snack", 15000, "2023-12-30");
        snack.tampilkanInfo();

        System.out.println();

        // Polimorfisme menggunakan referensi kelas induk Pegawai
        Pegawai pegawaiKontrak = new PegawaiKontrak("Hanif", 3000000, 12);
        pegawaiKontrak.tampilkanInfo();
    }
}
