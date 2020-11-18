import java.util.*;
import java.lang.*;

class Main
{

    public static boolean czyJestPierwsza(int sprawdzanaLiczba)
    {
        if (sprawdzanaLiczba == 0 || sprawdzanaLiczba == 1)
        {
            return false;
        }

        for (int i = 0; i < sprawdzanaLiczba-2; i++)
        {
            if (sprawdzanaLiczba % (i+2) == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int liczbaTestow = scanner.nextInt();
        int[] sprawdzanaLiczba = new int[liczbaTestow];

        for (int i = 0; i < liczbaTestow; i++)
        {
            sprawdzanaLiczba[i] = scanner.nextInt();
        }

        for (int i = 0; i < liczbaTestow; i++)
        {
            if (Main.czyJestPierwsza(sprawdzanaLiczba[i]) == true )
            {
                System.out.println("TAK");
            } else
            {
                System.out.println("NIE");
            }
        }
    }
}