import java.util.Scanner;

public class gaji {
    public static void main(String[] args) {
        
        double jamKerja, tarifJam, gajiBersih, pajak = 10;

        Scanner input = new Scanner(System.in);

        System.out.println("Jumlah jam kerja: ");
            jamKerja = input.nextDouble();
        System.out.println("Tarif per jam: ");
            tarifJam = input.nextDouble();

        gajiBersih = jamKerja*tarifJam;
        pajak = (pajak/100)*gajiBersih;
        gajiBersih = gajiBersih-pajak;

        System.out.println("Total gaji: " + gajiBersih);
    }
}
