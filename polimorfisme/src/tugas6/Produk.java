package tugas6;

class Produk {
    String nama;
    double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public double hitungDiskon() {
        return 0; // Default tanpa diskon
    }
}
