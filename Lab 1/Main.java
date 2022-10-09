import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String [] args) {
        System.out.println("Lab 1");

        //Zadanie 1 - Uruchomienie pierwszego programu

        System.out.println("Zadanie 1 - Uruchomienie pierwszego programu");

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Wprowadź imię:");
        String userName = inputScanner.nextLine(); // Odczyt tekstu
        System.out.println("Wprowadź wiek:");
        int wiek = inputScanner.nextInt(); // Odczyt liczby całkowitej
        System.out.println("Uzytkownik " + userName + " ma " + wiek + " lat.");

        //Zadanie 2 - Komentarze

        System.out.println("Zadanie 2 - Komentarze");

        /*
        Używanie komentarzy liniowych oraz blokowych.
        W komentarzu blokowym możemy napisać kilka lini
         */

        //Zadanie 3 - Zmienne oraz operatory

        System.out.println("Zadanie 3 - Zmienne oraz operatory");

        int a = 8;
        short b = 5;
        int wynik;

        System.out.println("a = " + a + " b = " + b);

        wynik = a + b;
        System.out.println("Wynik dodawania a + b = " + wynik);

        wynik = a * b;
        System.out.println("Wynik mnożenia a * b = " + wynik);

        wynik = a / b;
        System.out.println("Wynik dzielenia a / b = " + wynik);

        wynik = a % b;
        System.out.println("Wynik modulo a % b = " + wynik);

        //Zadanie 4 - a%b%c

        System.out.println("Zadanie 4 - a%b%c");

        int c = 7;
        int d = a%b%c;

        System.out.println("Wynik modulo a, b i c = " + d);

        //Zadanie 5 - Zwieksz wartość zmiennej o 4 bez uzycia =, +, +=

        System.out.println("Zadanie 5 - Zwieksz wartość zmiennej o 4 bez uzycia =, +, +=");

        int zad5 = 5;
        System.out.println("Początkowa wartość = " + zad5);

        zad5++;
        zad5++;
        zad5++;
        zad5++;

        System.out.println("Zwiekszona o 4 = " + zad5);

        // Zadanie 6 - Pole prostokąta

        System.out.println("Zadanie 6 - Pole prostokąta");

        int pole;

        System.out.println("Wprowadź a:");
        int bokA = inputScanner.nextInt();

        System.out.println("Wprowadź b:");
        int bokB = inputScanner.nextInt();

        pole = bokA * bokB;

        System.out.println("Pole prostokąta = " + pole);

        // Zadanie 7 - Objętość kuli

        System.out.println("Zadanie 7 - Objętość kuli");

        System.out.println("Wprowadz promień r:");
        double r = inputScanner.nextInt();
        double objetosc = (4 * Math.PI * (r*r*r))/3;
        double poleKuli = 4 * Math.PI * (r*r);

        System.out.println("V = " + objetosc + " P = " + poleKuli);

        // Zadanie 8 - Kalkulator stopni Celsjusza na Fahrenheita

        System.out.println("Zadanie 8 - Kalkulator stopni Celsjusza na Fahrenheita");

        System.out.println("Wprowadź temperature w 'C ");
        double stopnieC = inputScanner.nextDouble();
        double stopnieF = 32 + (9.0 * stopnieC) /5;

        System.out.println("'C: " + stopnieC + ", 'F: " + stopnieF);

        // Zadanie 9

        // Zadanie 10 - Funkcja if

        System.out.println("Zadanie 10 - Funkcja if");

        System.out.println("Wprowadz liczbę");
        int liczba = inputScanner.nextInt();

        if (liczba > 100) {
            System.out.println("Podana liczba jest wieksza od 100");
        }
        else if (liczba < 0) {
            System.out.println("Podana liczba jest mniejsza od 0");
        }
        else {
            System.out.println("Podana liczba jest z przedziału 0-100");
        }

        // Zadanie 11 - Pętla while oraz funkcja if

        System.out.println("Zadanie 11 - Pętla while oraz funkcja if");

        String input = inputScanner.nextLine();
        char litera = 'a';

        while(litera != 'c') {
            System.out.println("Wprowadz litere");
            input = inputScanner.nextLine();
            litera = input.charAt(0);
            System.out.println(litera);
        }
        System.out.println("Koniec pętli");


    }
}