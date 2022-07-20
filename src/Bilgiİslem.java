public class Bilgiİslem extends Memur{

    private String gorev;


    public Bilgiİslem(String adSoyad, String telefon, String eposta, String department, String mesai,String gorev) {
        super(adSoyad, telefon, eposta, department, mesai);
        this.gorev = gorev;

    }

    public void networkKurulumu(){
        System.out.println(this.getAdSoyad() + "network kuruldu");

    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

}
