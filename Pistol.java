import java.util.Scanner;

public class Pistol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int peluru = 7;
        int tembak;
        do {
            System.out.print("Ketik 1 untuk menembak: ");
            tembak = input.nextInt();

            if (tembak == 1) {
                peluru--;
                System.out.println("DOR! Sisa peluru: " + peluru);
            } else {
                System.out.println("Input salah. Ketik 1 untuk menembak.");
            }
        } while (peluru > 0);

        System.out.println("Peluru habis.");
        input.close();
    }
}