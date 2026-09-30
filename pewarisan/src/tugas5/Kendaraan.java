package tugas5;

class Kendaraan {
    protected String merk;

    public Kendaraan(String merk) {
        this.merk = merk;
    }

    public void tampilkanInfo() {
        System.out.println("Merk Kendaraan : " + merk);
    }
}
