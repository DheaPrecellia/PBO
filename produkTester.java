// Class Produk
class Produk {
    // Atribut private
    private String kodeProduk;
    private String namaProduk;
    private double harga;

    // Constructor default
    public Produk() {
        this.kodeProduk = "P000";
        this.namaProduk = "Unknown";
        this.harga = 0;
    }

    // Constructor berparameter
    public Produk(String kodeProduk, String namaProduk, double harga) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        // Validasi harga hanya jika > 0
        if (harga > 0) {
            this.harga = harga;
        } else {
            this.harga = 0;
        }
    }

    // Getter dan Setter
    public String getKodeProduk() {
        return kodeProduk;
    }

    public void setKodeProduk(String kodeProduk) {
        this.kodeProduk = kodeProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    // Setter dengan validasi: harga harus > 0
    public void setHarga(double harga) {
        if (harga > 0) {
            this.harga = harga;
        } else {
            System.out.println("❌ Harga tidak boleh nol atau negatif!");
        }
    }

    // Method untuk menampilkan informasi produk
    public void tampilkanInfo() {
        System.out.println("Kode Produk : " + kodeProduk);
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga       : Rp " + harga);
        System.out.println("---------------------------");
    }
}

// Class Tester
public class Tester {
    public static void main(String[] args) {
        // Objek pertama menggunakan constructor default
        Produk produk1 = new Produk();

        // Objek kedua menggunakan constructor berparameter
        Produk produk2 = new Produk("P101", "Laptop", 8500000);

        // Tampilkan info kedua produk
        System.out.println("=== DATA PRODUK 1 ===");
        produk1.tampilkanInfo();

        System.out.println("=== DATA PRODUK 2 ===");
        produk2.tampilkanInfo();

        // Uji setter harga dengan nilai negatif
        System.out.println("Mencoba ubah harga produk1 menjadi -5000...");
        produk1.setHarga(-5000); // Tidak boleh berubah
        produk1.tampilkanInfo();

        // Uji setter harga dengan nilai valid
        System.out.println("Mengubah harga produk1 menjadi 15000...");
        produk1.setHarga(15000); // Berhasil
        produk1.tampilkanInfo();
    }
}
