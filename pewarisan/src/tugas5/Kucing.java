package tugas5;

class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama, "Kucing");
    }

    // Overriding method tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        bersuara();
    }

    // Metode khas suara Kucing
    public void bersuara() {
        System.out.println("Suara : Meow meow!");
    }
}
