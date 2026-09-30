package tugas5;

class SepedaMotor extends KendaraanDarat {
    private String tipeMesin;

    public SepedaMotor(String merk, int jumlahRoda, String tipeMesin) {
        super(merk, jumlahRoda);
        this.tipeMesin = tipeMesin;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("--- Informasi Sepeda Motor ---");
        super.tampilkanInfo();
        System.out.println("Tipe Mesin     : " + tipeMesin);
    }
}
