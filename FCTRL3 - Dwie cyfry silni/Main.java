import java.util.*;
import java.lang.*;

public class Main {

    public static void main (String[] args) throws java.lang.Exception {

        Scanner scanner = new Scanner(System.in);
        int liczbaProb = scanner.nextInt(); //wczytywanie liczby prob
        int[] n = new int[liczbaProb];
        int[] silniaN = new int[liczbaProb];

        for (int i = 0; i <liczbaProb; i++) { //wczytywanie liczb
            n[i] = scanner.nextInt();
        }

        for (int i = 0; i <liczbaProb; i++) { //obliczanie i wypisywanie wyniku dla kazdej liczby
            if (n[i] == 0 || n[i] == 1) System.out.println("0 1");
            else {
                if (n[i] > 9) System.out.println("0 0");
                else {
                    silniaN[i] = 1;
                    for (int j = 1; j <= n[i]; j++) {
                        silniaN[i] = silniaN[i] * j;
                    }
                    int jednosciSilni = silniaN[i] % 10;
                    int dziesiatkiSilni = (silniaN[i] % 100 - jednosciSilni) / 10;
                    System.out.println(dziesiatkiSilni + " " + jednosciSilni);
                }
            }
        }

    }
}