package latihan_uas;
public class Kalkulator {
    int jumlah;
    
    public int Tambah(int bil1, int bil2){
        jumlah = bil1 + bil2;
        return jumlah;
    }
    
    public int Kurang(int bil1, int bil2){
        jumlah = bil1 - bil2;
        return jumlah;
    }
    
    public int Kali(int bil1, int bil2){
        jumlah = bil1 * bil2;
        return jumlah;
    }
    public float Bagi(int bil1, int bil2){
        jumlah = bil1 / bil2;
        return jumlah;
    }
}
