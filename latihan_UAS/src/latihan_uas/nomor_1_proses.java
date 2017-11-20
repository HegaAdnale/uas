package latihan_uas;
public class nomor_1_proses {
    private String nis;
    private String nama;
    private double nilai_akhir;
    private double uas;
    private double uts;

    /**
     * @return the uas
     */
    public double getUas() {
        return uas;
    }

    /**
     * @param uas the uas to set
     */
    public void setUas(double uas) {
        this.uas = uas;
    }

    /**
     * @return the uts
     */
    public double getUts() {
        return uts;
    }

    /**
     * @param uts the uts to set
     */
    public void setUts(double uts) {
        this.uts = uts;
    }

    /**
     * @return the nis
     */
    public String getNis() {
        return nis;
    }

    /**
     * @param nis the nis to set
     */
    public void setNis(String nis) {
        this.nis = nis;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the nilai_akhir
     */
    public double getNilai_akhir() {
        return nilai_akhir;
    }

    /**
     * @param nilai_akhir the nilai_akhir to set
     */
    public void setNilai_akhir(double uts,double uas) {
        nilai_akhir = (uts * 0.5)+(uas * 0.5);
        this.nilai_akhir = nilai_akhir;
    }
}
