package tugas6;

public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        keranjang.tambahProduk(new Buku("Pemrograman Java", 100000));
        keranjang.tambahProduk(new Elektronik("Mouse Wireless", 150000));
        keranjang.tambahProduk(new Pakaian("Kemeja Polos", 200000));

        keranjang.cetakStruk();
    }
}
