public class Mobil extends Kendaraan {
    private int jumlahPintu;

    // Constructor memanggil constructor induk pakai super()
    public Mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
        super(nama, kecepatanMaks, jenisMesin);
        this.jumlahPintu = jumlahPintu;
    }

    // Method menampilkan info spesifik mobil
    public void tampilkanInfoMobil() {
        // kecepatanMaks bisa diakses langsung karena modifier-nya protected!
        System.out.println("Kecepatan Maks Mobil : " + kecepatanMaks + " km/h");
        System.out.println("Jumlah Pintu         : " + jumlahPintu);
    }
}
