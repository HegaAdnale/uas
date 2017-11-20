package latihan_uas;
import java.util.Scanner;
public class Nomor_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Nama\t= ");
        String nama = scan.next();
        System.out.print("Gol\t= ");
        String golo = scan.next();
        System.out.print("Status\t= ");
        String stat = scan.next();
        System.out.print("Jumlah Anak\t= ");
        int jumnak = scan.nextInt();
        
        System.out.println("Output");
        System.out.println("Nama\t= "+nama);
        System.out.println("Gol\t= "+golo);
        System.out.println("Status\t= "+stat);
        System.out.println("Jumlah Anak\t= "+jumnak);
        if (golo == "2A" || golo == "2a") {
            System.out.println("Gaji Pokok = 1000000");
            int gaji = 1000000;
        }
        else if(golo == "2B" || golo == "2b"){
        }
    }
}

