public interface Budynek {
    void setBudynek(String Budynek);
    String getBudynek();
    double powierzchnia(double pow);
    String adresBudynku(String adres);
    int liczbaOkien(int value);
    void liczbaMieszkancow(int value);
    double poleBudynku(double wysokosc, double szerokosc);
    void kolorDomu(KolorEnum kolor);
    String toString();
}
