package latihan_uas;
import java.util.Scanner;
public class TestKalkulator {
    public static void main(String[] args) {
        Kalkulator operasi = new Kalkulator();
        Scanner scan = new Scanner(System.in);
        System.out.println("Kalkulator Sederhana");
        
        System.out.println("Masukan Bilangan 1 = ");
        int bil1 = scan.nextInt();
        System.out.println("Masukan Bilangan 2 = ");
        int bil2 = scan.nextInt();
        System.out.println("\nSilahkan Pilih Operasi");
        System.out.println("1.\t Perkalian (*)");
        System.out.println("2.\t Pembagian (/)");
        System.out.println("3.\t Pertambahan (+)");
        System.out.println("4.\t Pengurangan (-)");
        int pilih = scan.nextInt();
        
        switch(pilih)
        {
            case 1:
                System.out.println("Hasil \t"+operasi.Kali(bil1, bil2)); 
                break;
            case 2:
                System.out.println("Hasil \t"+operasi.Bagi(bil1, bil2)); 
                break;
            case 3:
                System.out.println("Hasil \t"+operasi.Tambah(bil1, bil2)); 
                break;
            case 4:
                System.out.println("Hasil \t"+operasi.Kurang(bil1, bil2)); 
                break;
        }
    }
}
