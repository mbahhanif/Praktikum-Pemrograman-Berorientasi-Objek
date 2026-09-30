package tugas6;

class Elektronik extends Produk {
    public Elektronik(String nama, double harga) { super(nama, harga); }
    @Override
    public double hitungDiskon() { return harga * 0.20; } // Diskon 20%
}
