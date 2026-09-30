package tugas5;

class KendaraanDarat extends Kendaraan {
    protected int jumlahRoda;

    public KendaraanDarat(String merk, int jumlahRoda) {
        super(merk);
        this.jumlahRoda = jumlahRoda;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Roda    : " + jumlahRoda);
    }
}
