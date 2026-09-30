package tugas5;

class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama, "Anjing");
    }

    // Overriding method tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        bersuara();
    }

    // Metode khas suara Anjing
    public void bersuara() {
        System.out.println("Suara : Guk guk!");
    }
}
