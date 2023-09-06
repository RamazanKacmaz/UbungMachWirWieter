package Auto;

public class ArabaSahibi {
    private String isim;
    private Araba araba;

    public ArabaSahibi(String isim, Araba araba) {
        this.isim = isim;
        this.araba = araba;
    }

    public String getIsim() {
        return isim;
    }

    public Araba getAraba() {
        return araba;
    }

    public static void main(String[] args) {

        Araba araba = new Araba("Toyota" , "Coralla");
        ArabaSahibi sahip = new ArabaSahibi("Ramazan",araba);

        System.out.println(sahip.getIsim() + " " + sahip.getAraba());
    }
}
