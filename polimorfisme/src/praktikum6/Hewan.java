package praktikum6;

class Hewan {
    public void bersuara() {
        System.out.println("Hewan bersuara");
    }

    // Overloading method makan()
    public void makan(String makanan) {
        System.out.println("Makan " + makanan);
    }

    public void makan(String makanan, int jumlah) {
        System.out.println("Makan " + jumlah + " porsi " + makanan);
    }
}
