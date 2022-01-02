public class Dom implements Budynek{

    private String budynekA;
    private double pow;
    private String adres;
    private int okna;
    private int mieszkancy;
    private double poleBudynku;
    private KolorEnum kolor;
    @Override
    public void setBudynek(String budynek) {
        this.budynekA = budynek;
    }
    @Override
    public String getBudynek() {
        return budynekA;
    }
    public double getPow() {
        return pow;
    }
    public void setPow(double pow) {
        this.pow = pow;
    }
    @Override
    public double powierzchnia(double pow) {
        return pow;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public String adresBudynku(String adres) {
        return adres;
    }
    public int getOkna() {
        return okna;
    }
    public void setOkna(int okna) {
        this.okna = okna;
    }
    @Override
    public int liczbaOkien(int okna) {
        return okna;
    }
    @Override
    public void liczbaMieszkancow(int mieszkancy) { this.mieszkancy = mieszkancy;}

    public double getPoleBudynku() {
        return poleBudynku;
    }
    public void setPoleBudynku(double poleBudynku) {
        this.poleBudynku = poleBudynku;
    }
    @Override
    public double poleBudynku(double wysokosc, double szerokosc) {
        return wysokosc * szerokosc;
    }
    @Override
    public void kolorDomu(KolorEnum kolor) {
        this.kolor = kolor;
    }
    @Override
    public String toString() {
        return "Information: {" +
                "Family='" + budynekA +
                ", square='" + pow +
                ", address=" + adres +
                ", number of windows=" + okna +
                ", number of inhabitants=" + mieszkancy +
                ", kolor of the house=" + kolor +
                ", ... " + poleBudynku +
                '}';
    }
}