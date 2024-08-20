import java.util.Scanner;

public class Barang {

    public static void main(String[] args) {
        
        double hargaBarang, jumlahBarang, diskon, totalHarga;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan harga barang: ");
            hargaBarang = input.nextDouble();
        System.out.println("Masukkan jumlah barang: ");
            jumlahBarang = input.nextDouble();
        System.out.println("Jumlah diskon: ");
            diskon = input.nextDouble();

        totalHarga = hargaBarang*jumlahBarang;
        diskon = (diskon/100)*totalHarga;
        totalHarga = totalHarga-diskon;

        System.out.println("Total harga: " + totalHarga);

    }
}