public class GuvenlikGorevlisi extends Memur{

    private String belge;

    public GuvenlikGorevlisi(String adSoyad, String telefon, String eposta, String department, String mesai,String belge) {
        super(adSoyad, telefon, eposta, department, mesai);
        this.belge = belge;
    }

    public void nobet(){
        System.out.println(this.getAdSoyad() + " nobet tuttu");
    }

    public String getBelge() {
        return belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }


}
