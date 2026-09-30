package tugas6;

class KeranjangBelanja {
    Produk[] daftarProduk = new Produk[5];
    int jumlah = 0;

    public void tambahProduk(Produk p) {
        if (jumlah < daftarProduk.length) {
            daftarProduk[jumlah++] = p;
        }
    }

    public void cetakStruk() {
        double total = 0;
        System.out.println("=== DETAIL BELANJA ===");
        for (int i = 0; i < jumlah; i++) {
            Produk p = daftarProduk[i];
            double diskon = p.hitungDiskon(); // Polimorfisme
            double hargaAkhir = p.harga - diskon;
            total += hargaAkhir;

            System.out.printf("%-20s | Harga: Rp%.0f | Diskon: Rp%.0f | Net: Rp%.0f%n",
                    p.nama, p.harga, diskon, hargaAkhir);
        }
        System.out.println("---------------------------------------------------------");
        System.out.printf("TOTAL BAYAR: Rp%.0f%n", total);
    }
}
