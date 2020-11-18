import java.util.*;
import java.lang.*;

class Main {

    public static void main (String[] args) throws java.lang.Exception {

        Scanner scanner = new Scanner(System.in);
        int liczbaTestow = scanner.nextInt(); //wczytywanie liczby testów
        int[] podstawa = new int[liczbaTestow];
        int[] wykladnik = new int[liczbaTestow];

        for (int i = 0; i < liczbaTestow; i++) {
            podstawa[i] = scanner.nextInt(); //wczytywanie podstaw
            wykladnik[i] = scanner.nextInt(); //wczytywanie wykladnikow
        }

        for (int i = 0; i < liczbaTestow; i++) {
            switch (podstawa[i] % 10) { //liczenie cyfry jednosci z podstawy
                case 0:
                    System.out.println(0);
                    break;
                case 1:
                    System.out.println(1);
                    break;
                case 2:
                    switch (wykladnik[i] % 4) {
                        case 0:
                            System.out.println(6);
                            break;
                        case 1:
                            System.out.println(2);
                            break;
                        case 2:
                            System.out.println(4);
                            break;
                        case 3:
                            System.out.println(8);
                            break;
                    }
                    break;
                case 3:
                    switch (wykladnik[i] % 4) {
                        case 0:
                            System.out.println(1);
                            break;
                        case 1:
                            System.out.println(3);
                            break;
                        case 2:
                            System.out.println(9);
                            break;
                        case 3:
                            System.out.println(7);
                            break;
                    }
                    break;
                case 4:
                    switch (wykladnik[i] % 2) {
                        case 0:
                            System.out.println(6);
                            break;
                        case 1:
                            System.out.println(4);
                            break;
                    }
                    break;
                case 5:
                    System.out.println(5);
                    break;
                case 6:
                    System.out.println(6);
                    break;
                case 7:
                    switch (wykladnik[i] % 4) {
                        case 0:
                            System.out.println(1);
                            break;
                        case 1:
                            System.out.println(7);
                            break;
                        case 2:
                            System.out.println(9);
                            break;
                        case 3:
                            System.out.println(3);
                            break;
                    }
                    break;
                case 8:
                    switch (wykladnik[i] % 4) {
                        case 0:
                            System.out.println(6);
                            break;
                        case 1:
                            System.out.println(8);
                            break;
                        case 2:
                            System.out.println(4);
                            break;
                        case 3:
                            System.out.println(2);
                            break;
                    }
                    break;
                case 9:
                    switch (wykladnik[i] % 2) {
                        case 0:
                            System.out.println(1);
                            break;
                        case 1:
                            System.out.println(9);
                            break;
                    }
                    break;
            }
        }
    }
}