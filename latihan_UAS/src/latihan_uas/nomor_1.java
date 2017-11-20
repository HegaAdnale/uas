package latihan_uas;
import java.util.Scanner;
public class nomor_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        nomor_1_proses[] data = new nomor_1_proses[10];
        String Jawab = "";
        int i = 0;
        
        do {
            System.out.println("NIS Siswa");
            String nis = scan.next();
            System.out.println("Nama Siswa");
            String nama_siswa = scan.next();
            System.out.println("Nilai UAS");
            double uas = scan.nextDouble();
            System.out.println("Nilai UTS");
            double uts = scan.nextDouble();
            
            nomor_1_proses masuk = new nomor_1_proses();
            masuk.setNama(nama_siswa);
            masuk.setNis(nis);
            masuk.setUas(uas);
            masuk.setUts(uts);
            masuk.setNilai_akhir(uts, uas);
            data[i] = masuk;
            
            System.out.println("Mau input lagi? ");
            Jawab = scan.next();
            i++;
        } while (Jawab.equalsIgnoreCase("Y"));
        
        System.out.println("====================================================");
        System.out.println("No\t NIS\t Nama\t UTS\t UAS\t Nilai Akhir\t Index");
        System.out.println("====================================================");
        for(int j=0;j<i;j++){
            nomor_1_proses s = data[j];
            System.out.print((j+1)+"\t");
            System.out.print(s.getNis()+"\t");
            System.out.print(s.getNama()+"\t");
            System.out.print(s.getUts()+"\t");
            System.out.print(s.getUas()+"\t");
            System.out.print(s.getNilai_akhir()+"\t\t");
            if (s.getNilai_akhir() >= 80) {
                System.out.println("A\t");
            }
            else if(s.getNilai_akhir() >= 77.5){
                System.out.println("B\t");
            }
            else{
                System.out.println("C\t");
            }
        }
    }
}
