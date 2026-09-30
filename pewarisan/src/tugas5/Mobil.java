package tugas5;

class Mobil extends KendaraanDarat {
    private int jumlahPintu;

    public Mobil(String merk, int jumlahRoda, int jumlahPintu) {
        super(merk, jumlahRoda);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("--- Informasi Mobil ---");
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu   : " + jumlahPintu);
    }
}
