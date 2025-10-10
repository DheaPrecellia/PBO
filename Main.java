public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
//
//        int a = 10;
//        int b = 5;
//
//        int d = a * b;
//        int e = a / b;
//
//        System.out.println("a + b = " + (a + b));
//        System.out.println("a - b = " + (a - b));
//        System.out.println("a * b = " + (d));
//        System.out.println("a / b = " + (e));

//        double f = 10.5;
//        double g = 20.2;
//        double h = f * g;
//
//        System.out.println("f = " + f);
//        System.out.println("g = " + g);
//        System.out.println("f * g = " + h);
//        System.out.println("f / h = " + (f / g));

//        String nama = "Dhea Precellia";
//        long nim=2400018273L;
//        String kelas="E";
//        String fakultas="Teknologi Industri";
//        String prodi="Informatika";
//
//        System.out.println(" Nama = " + nama);
//        System.out.println(" Nim = " + nim);
//        System.out.println(" Kelas = " + kelas);
//        System.out.println(" Fakultas = " + fakultas);
//        System.out.println(" Program Studi = " + prodi);

        String antrian[] = {"Joko", "Budi", "Andi", "Siti", "Sita"};
        System.out.println("Daftar Antrian : ");
        for(int i = 0; i < antrian.length; i++){
            System.out.println("Antrian ke-" + (i+1) + " : " + antrian[i]);
        }

        String mobil[] = new String[5];
        mobil[0] = "KIA";
        mobil[1] = "Hyundai";
        mobil[2] = "Wuling";
        mobil[3] = "Honda";
        mobil[4] = "Toyota";
        for(int i = 0; i<mobil.length; i++){
            System.out.println("Antrian ke-" + (i+1) + " : " + mobil[i]);
        }

    }
}
