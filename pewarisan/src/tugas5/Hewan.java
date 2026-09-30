package tugas5;

class Hewan {
    protected String nama;
    protected String jenis;

    public Hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public void tampilkanInfo() {
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis : " + jenis);
    }
}
