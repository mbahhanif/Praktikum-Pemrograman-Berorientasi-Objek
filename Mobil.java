public class Mobil {
    // Atribut privat (Encapsulation)
    private String merk;
    private String model;
    private int tahun;
    private String warna;

    // Constructor untuk inisialisasi awal atribut
    public Mobil(String merk, String model, int tahun, String warna) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }

    // Getter dan Setter untuk Merk
    public String getMerk() { return merk; }
    public void setMerk(String merk) { this.merk = merk; }

    // Getter dan Setter untuk Model
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    // Getter dan Setter untuk Tahun
    public int getTahun() { return tahun; }
    public void setTahun(int tahun) { this.tahun = tahun; }

    // Getter dan Setter untuk Warna
    public String getWarna() { return warna; }
    public void setWarna(String warna) { this.warna = warna; }

    // Method startEngine sesuai instruksi tugas
    public void startEngine() {
        System.out.println("Mesin mobil " + merk + " menyala!");
    }

    // Method displayInfo untuk menampilkan informasi lengkap
    public void displayInfo() {
        System.out.println("Merk  : " + merk);
        System.out.println("Model : " + model);
        System.out.println("Tahun : " + tahun);
        System.out.println("Warna : " + warna);
    }
}
