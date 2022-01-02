
public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setName("Bond");
        student1.setIndex(007);
        student1.setSpecialization("Intelligence Service");
        student1.setSemester(6);
        student1.setAge(25);

        System.out.println("\n" + student1.toString());

        Student student2 = new Student();
        student1.setName("Q");
        student1.setIndex(99);
        student1.setSpecialization("Intelligence Support");
        student1.setSemester(5);
        student1.setAge(24);

        System.out.println("\n" + student2.toString());

        Pracownik pracownik1 = new Pracownik();
        pracownik1.setName("Blofeld");
        pracownik1.setSalary(374985723.00);
        pracownik1.setPost("Evil Genius");
        pracownik1.setExperience(33);
        pracownik1.setAge(45);

        System.out.println(pracownik1.toString());
        System.out.println();

        Pracownik pracownik2 = new Pracownik();
        pracownik1.setName("Moneypenny");
        pracownik1.setSalary(33423.00);
        pracownik1.setPost("Secretary");
        pracownik1.setExperience(1);
        pracownik1.setAge(25);

        System.out.println(pracownik2.toString());
        System.out.println();





        /* zad.1
        a) napisać interfejs CzlowiekI
        b) zadeklarować 2 metody

        c) napisać interfejs StudentI który dziedziczy po interfejsie CzlowiekI
        d) zadeklarować 3 metody

        e) napisać interfejs PracownikI który dziedziczy po interfejsie CzlowiekI
        f) zadeklarować 3 metody
         */

        /* zad.2
        a) napisać klasę Student która będzie implementować interfejs StudentI
        b) napisać klasę Pracownik która będzie implementować interfejs PracownikI
        c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
        (gettery i settery / toString() ..., najlepiej wygenerować: Code/Prawy myszy-->Generate-->getters/setters/toString)
        */

        /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola
        c) wypisać metody toString() wszystkich objektów

        zad.4 - Dla chętnych
        a) stworzyć klasę Kierownik która będzie implementować interfejs PracownikI,
        b) zaimplementować wszystkie metody, i stworzyć pola
        c) stworzyć 2 objekty typu Kierownik i uzupełnić wszystkie pola,
        d) stworzyć listę typu PracownikI --> List<PracownikI> listaPracownikow = new ArrayList<>();
        e) dodać do niej objekty typu Kierownik i Pracownik
        f) wypisać pętlą metody toString() wszystkich elementów listy
        */

        /* zad5 - Dla chętnych
        Stworzyć klasę która będzie implementować 2 lub 3 interfejsy następnie będzie
        dziedziczona przez inną klasę
        */
    }
}
