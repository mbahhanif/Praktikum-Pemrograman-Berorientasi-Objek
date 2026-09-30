package tugas6;

class Pakaian extends Produk {
    public Pakaian(String nama, double harga) { super(nama, harga); }
    @Override
    public double hitungDiskon() { return harga * 0.15; } // Diskon 15%
}
