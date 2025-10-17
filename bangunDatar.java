// MainBangunDatar.java
public class MainBangunDatar {
    public static void main(String[] args) {
        // Membuat objek Persegi Panjang
        PersegiPanjang pp = new PersegiPanjang(10, 5);
        System.out.println("=== Persegi Panjang ===");
        System.out.println("Panjang : " + pp.getPanjang());
        System.out.println("Lebar   : " + pp.getLebar());
        System.out.println("Luas    : " + pp.hitungLuas());
        System.out.println("Keliling: " + pp.hitungKeliling());
        System.out.println();

        // Membuat objek Persegi
        Persegi p = new Persegi(7);
        System.out.println("=== Persegi ===");
        System.out.println("Sisi     : " + p.getSisi());
        System.out.println("Luas     : " + p.hitungLuas());
        System.out.println("Keliling : " + p.hitungKeliling());
        System.out.println();

        // Membuat objek Lingkaran
        Lingkaran l = new Lingkaran(6);
        System.out.println("=== Lingkaran ===");
        System.out.println("Jari-jari: " + l.getJariJari());
        System.out.println("Luas     : " + l.hitungLuas());
        System.out.println("Keliling : " + l.hitungKeliling());
    }
}

// ===== Class Persegi Panjang =====
class PersegiPanjang {
    private double panjang;
    private double lebar;

    // Konstruktor
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Method hitung luas
    public double hitungLuas() {
        return panjang * lebar;
    }

    // Method hitung keliling
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    // Getter
    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }
}

// ===== Class Persegi =====
class Persegi {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }

    public double hitungKeliling() {
        return 4 * sisi;
    }

    public double getSisi() {
        return sisi;
    }
}

// ===== Class Lingkaran =====
class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }
}
