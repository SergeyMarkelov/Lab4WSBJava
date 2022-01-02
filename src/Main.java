public class Main {
    public static void main(String[] args) {

        Dom dom1 = new Dom();
        dom1.setBudynek("Example");
        dom1.powierzchnia(80.0);
        dom1.adresBudynku("Targ Rybny 11");
        dom1.liczbaOkien(22);
        dom1.liczbaMieszkancow(3);
        dom1.poleBudynku(2.2, 3.3);
        dom1.kolorDomu(KolorEnum.green);

        System.out.println(dom1.toString());

        System.out.println();

        Budynek dom2 = new Dom();
        dom2.setBudynek("Example2");
        dom2.powierzchnia(90.5);
        dom1.adresBudynku("Targ Rybny 12");
        dom1.liczbaOkien(33);
        dom1.liczbaMieszkancow(0);
        dom1.poleBudynku(2.0, 3.3);
        dom1.kolorDomu(KolorEnum.red);

        System.out.println(dom2.toString());
    }
}




        /* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double pow);
            - String adresBudynku(String adres);
            - int liczbaOkien(int value);
            - void liczbaMieszkancow(int value);
            - void kolorDomu(KolorEnum kolor);
        c) stworzyć enum KolorEnum z przykładowymi kolorami,
        d) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
        */

        /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie
        */

        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom
        */
    }
}
