package praktikum6;

public class Main {
    public static void main(String[] args) {
        // Polymorphism & Overriding
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();

        kucing.bersuara(); // Output: Meow
        anjing.bersuara(); // Output: Woof

        // Overloading
        kucing.makan("ikan");    // Output: Makan ikan
        anjing.makan("daging", 2); // Output: Makan 2 porsi daging
    }
}
