import java.util.Scanner;
//Nama :Ikarima
//Nim :13020210283
public class Hitung0283 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan mil: ");
        double mil = input.nextDouble();

        double meter = mil * 5;

        System.out.println("Hasil " + mil + " mil = " + meter + " meter");
    }
}
