import java.util.Scanner;

/**
 * Kelas LengthConverter digunakan untuk mengonversi panjang dalam meter ke kilometer
 * atau sebaliknya.
 */
public class Tugas2{

    /**
     * Mengonversi panjang dari meter ke kilometer.
     *
     * @param meters Panjang dalam meter.
     * @return Panjang dalam kilometer.
     */
    public static double metersToKilometers(double meters) {
        return meters / 1000.0;
    }

    /**
     * Mengonversi panjang dari kilometer ke meter.
     *
     * @param kilometers Panjang dalam kilometer.
     * @return Panjang dalam meter.
     */
    public static double kilometersToMeters(double kilometers) {
        return kilometers * 1000.0;
    }

    /**
     * Metode utama program untuk mengonversi panjang dari meter ke kilometer dan sebaliknya.
     *
     * @param args Argumen baris perintah (tidak digunakan).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang dalam meter: ");
        double meters = scanner.nextDouble();

        double kilometers = metersToKilometers(meters);
        System.out.println(meters + " meter sama dengan " + kilometers + " kilometer.");

        System.out.print("Masukkan panjang dalam kilometer: ");
        double kilometers2 = scanner.nextDouble();

        double meters2 = kilometersToMeters(kilometers2);
        System.out.println(kilometers2 + " kilometer sama dengan " + meters2 + " meter.");

        // Tutup scanner setelah penggunaannya
        scanner.close();
    }
}
