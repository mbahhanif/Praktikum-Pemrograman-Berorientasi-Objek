public class Hewan {
    // Atribut privat (Encapsulation) termasuk suara khasnya
    private String nama;
    private int umur;
    private String suara;

    // Constructor menerima nama, umur, dan suara khas masing-masing hewan
    public Hewan(String nama, int umur, String suara) {
        this.nama = nama;
        this.umur = umur;
        this.suara = suara;
    }

    // Getter dan Setter untuk Nama
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    // Getter dan Setter untuk Umur
    public int getUmur() { return umur; }
    public void setUmur(int umur) { this.umur = umur; }

    // Getter dan Setter untuk Suara
    public String getSuara() { return suara; }
    public void setSuara(String suara) { this.suara = suara; }

    // Method untuk mengeluarkan suara sesuai parameternya
    void bersuara() {
        System.out.println(nama + " bersuara: " + suara);
    }

    void info() {
        System.out.println("Nama: " + getNama() + ", Umur: " + getUmur() + " tahun");
    }

    void berlari() {
        System.out.println(nama + " sedang berlari");
    }
}