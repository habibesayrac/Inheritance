public class OgretimGorevlisi extends Akademisyen{


    private String kapiNo;

    public OgretimGorevlisi(String adSoyad, String telefon, String eposta, String bolum, String unvan, String kapiNo) {
        super(adSoyad, telefon, eposta, bolum, unvan);
        this.kapiNo=kapiNo;
    }
    public void senatoToplati(){
        System.out.println(this.getAdSoyad() + "senato toplatısı yaptı");
    }

    public void sinavYap(){
        System.out.println(this.getAdSoyad() + " Sınav yaptı");
    }

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }


}
