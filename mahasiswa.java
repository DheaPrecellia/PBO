public class Mahasiswa {
    // Atribut
    String nama;
    double ipk;

    // Konstruktor
    public Mahasiswa(String nama, double ipk) {
        this.nama = nama;
        this.ipk = ipk;
    }

    // Method untuk menentukan kategori prestasi
    public String kategoriPrestasi() {
        if (ipk >= 3.50) {
            return "Cumlaude";
        } else if (ipk >= 3.00) {
            return "Sangat Baik";
        } else if (ipk >= 2.50) {
            return "Baik";
        } else {
            return "Cukup";
        }
    }

    // Method main untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Dhea", 3.75);
        Mahasiswa mhs2 = new Mahasiswa("Rina", 3.20);
        Mahasiswa mhs3 = new Mahasiswa("Budi", 2.70);
        Mahasiswa mhs4 = new Mahasiswa("Andi", 2.30);

        // Menampilkan hasil kategori
        System.out.println("Nama: " + mhs1.nama + " | IPK: " + mhs1.ipk + " | Kategori: " + mhs1.kategoriPrestasi());
        System.out.println("Nama: " + mhs2.nama + " | IPK: " + mhs2.ipk + " | Kategori: " + mhs2.kategoriPrestasi());
        System.out.println("Nama: " + mhs3.nama + " | IPK: " + mhs3.ipk + " | Kategori: " + mhs3.kategoriPrestasi());
        System.out.println("Nama: " + mhs4.nama + " | IPK: " + mhs4.ipk + " | Kategori: " + mhs4.kategoriPrestasi());
    }
}
