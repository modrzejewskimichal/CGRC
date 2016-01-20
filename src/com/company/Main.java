package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ten program obliczy dla Ciebie punkt w którym należy podeprzeć model w celu wywarzenia.");
        double A, B, C, M, N, S, CG, MAC;
        boolean a = true;//deklaracja koniecznych zmiennych
        Scanner C1 = new Scanner(System.in);
        System.out.println("Jesli potrzebujesz pomocy wcisnij P, jesli nie dowolny znak");
        String D = C1.nextLine();
        System.out.println(D);
        if (java.util.Objects.equals(D, "P")) {
            System.out.println("Nalezy wybrac jedna jednostke miary, wynik obliczen podany bedzie liczac od krawedzi natarcia w wybranych jednostkach");
            System.out.println("Pojęcia, które pojawią się przy wprowadzaniu zmiennych:");
            System.out.println("-Najwieksza cieciwa: jest to miejsce w ktorym skrzydło ma najwiekszy przednio-tylny wymiar");
            System.out.println("-Najmniejsza cieciwa: jest to miejsce w ktorym przednio-tylny wymiar jest najmniejszy");
            System.out.println("-Przesuniecie krawedzi natarcia: to roznica pomiedzy poczatkiem skrzydla przy najwiekszej cieciwie");
            System.out.println("a zrzutowanego do osi poczatku skrzydla przy cieciwie najmniejszej, zmienna ta moze przyjmowac" +
                    "wartosci zarowno dodatnie jak i ujemne");
            System.out.println("-%MAC to procent sredniej aerodynamicznej cieciwy, ktory ma przypisane pewne zakresy dla " +
                    "poszczegolnych ksztaltow plata:");
            System.out.println("-konwencjonalny kształt skrzydla 25%-35%");
            System.out.println("-szybowce i makiety 35%");
            System.out.println("-bezogonowce12%-18%");
            System.out.println("-delta15%-19%");
            System.out.println("-doswiadczenie pokazuje jednak, ze niemal uniwersalna wartoscia jest 30%");
        }
        do {
            try {
                System.out.println("Podaj największą cieciwe");
                A = C1.nextDouble();
                System.out.println("Podaj najmniejsza cieciwe");
                B = C1.nextDouble();
                System.out.println("Podaj przesunięcie krawedzi natarcia");
                S = C1.nextDouble();
                System.out.println("Podaj % MAC");
                M = C1.nextInt();//pobranie od uzytkownika koniecznych danych
                N = M / 100;
                C = (S * (A + 2 * B)) / (3 * (A + B));//obliczenie przesunięcia wstecznego cieciwy w punkcie MAC
                MAC = A - (2 * (A - B) * (0.5 * A + B) / (3 * (A + B)));//obliczenie MAC (Mean Aerodynamic Chord)
                CG = N * MAC + C;//obliczenie srodka ciezkosci
                CG = CG * 100;
                CG = Math.round(CG);
                CG = CG / 100;//zaokraglenie wyniku do 2 miejsc po przecinku
                System.out.println("Srodek ciezkosci lezy" + CG);//wypisanie w konsoli wyniku
                a = false;
            } catch (InputMismatchException ime) {
                System.err.println("Zle dane wejsciowe, podaj poprawne dane");//obsluga wyjatku linie 33,51, 52
                C1.nextLine(); //czyszczenie buforu skanera
            }
        } while (a);
        C1.close();//zamknięcie scanner
    }
}
