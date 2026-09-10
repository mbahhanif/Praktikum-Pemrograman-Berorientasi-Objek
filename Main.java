public class Main {
    public static void main(String[] args) {
        // Objek Kucing: Hachimi, umur 3, suaranya "Miww Miaw"
        Hewan kucing = new Hewan("Hachimi", 3, "Miww Miaw");
        kucing.info();
        kucing.bersuara();
        kucing.berlari();

        System.out.println(); // Spasi biar rapi di terminal

        // Objek Anjing: Kiko, umur 2, suaranya "Auuu"
        Hewan anjing = new Hewan("Kiko", 2, "Auuu");
        anjing.info();
        anjing.bersuara();
        anjing.berlari();
    }
}