public class PersegiPanjang {
    // Atribut
    double panjang;
    double lebar;

    // Konstruktor
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Method untuk menghitung luas
    public double hitungLuas() {
        return panjang * lebar;
    }

    // Method untuk menghitung keliling
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    // Method main untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek PersegiPanjang
        PersegiPanjang pp = new PersegiPanjang(5, 3);

        // Menampilkan hasil
        System.out.println("Panjang: " + pp.panjang);
        System.out.println("Lebar  : " + pp.lebar);
        System.out.println("Luas   : " + pp.hitungLuas());
        System.out.println("Keliling: " + pp.hitungKeliling());
    }
}
