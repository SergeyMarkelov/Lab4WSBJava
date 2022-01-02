import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int[] tablica = {1, 2, 3, 4, 5, 6};
        Scanner scan = new Scanner(System.in);
        boolean Cheking = false;
        int tempForLoop = 0;

        System.out.println("enter the data: ");
        try {
            while (!Cheking) {
                try {
                    tempForLoop = scan.nextInt();
                    System.out.println(tablica[tempForLoop]);
                    if (tempForLoop >= 0 && tempForLoop <= 5) {
                        Cheking = true;
                    }
                } catch (InputMismatchException e) {  //W tym wypadku NumberFormatException nie dzialal poprawnie
                    System.out.println("error, it,s not a nubmer");
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("error index: " + tempForLoop + ", you can write indexes from 0 to  " + (tablica.length - 1));
                }
            }
        }

        finally {
            System.out.println("End of the program");
        }




        String example = null;

        try {
            if (example.equals("example"))
                System.out.print("Strings are the same");
            else
                System.out.print("Strings aren't the same");
        } catch (NullPointerException e) {
            System.out.println("Error");
            throw e;
        }

        int x = 5532534, y = 1341341;
        try {
            int tempDivision = x / y;
            System.out.println(tempDivision);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException " + e.getMessage());
        }

        int tempCount = 0;
        System.out.println("write a number:");
        try {
            tempCount = scan.nextInt();
            System.out.println(tempCount);
        } catch (InputMismatchException e) {
            System.out.println("error");
        } catch (Exception n) {
            System.out.println("error");
        } finally {
            System.out.println("end of the program");
        }



        /* zad.1
        a) stworzyć tablicę 6-cio elementową, uzupełnić przykładowymi wartościami (dowolny typ tablicy),
        b) wprowadzić z klawiatury numer indexu tablicy który chcemy wyświetlić, użyć metody next() --> scan.next();
        c) zabezpieczyć kod przed wprowadzeniem:
           - za dużej liczby (index > tab.length),
           - wprowadzeniem innego znaku niż liczba,
        d) użyć metody finally aby wyświetlić komunikat zakończenia programu
        e) wprowadzanie indeksu niech będzie zapętlone do momentu wprowadzenia poprawnego indeksu

           PODPOWIEDZI:
           scan.next() - można wprowadzać dowolny znak z klawiatury,
           index = Integer.parseInt(scan.next()); - parsowanie zmiennej do typu int (liczbowego calkowitego)

           warto stworzyć flagę np. isIndexCorrect = false, i niech pętla sie wykonuje, dopuki flaga jest false,
           boolean isIndexCorrect
           white(!isIndexCorrect) {}
        */



        /* zad.2
        a) stworzyć dowolny przykład z NullPonterException,
        b) stworzyć dowolny przykład z ArithmeticException ,
        c) stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally,
         */

           }
}


