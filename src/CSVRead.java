import java.util.Scanner;

import static java.lang.System.*;

 class  CSVRead {
    public static void CSVReader() {
        String[][] Tabbelle = new String[47][5];
        String[] testStr = new String[5];

        String delimiter = ";";

        Scanner sc = new Scanner("Leistungsnachweis.csv");

         int i = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            testStr = line.split(delimiter);
            Tabbelle[i][0] = testStr [0];
            Tabbelle[i][1] = testStr [1];
            Tabbelle[i][2] = testStr [2];
            Tabbelle[i][3] = testStr [3];
            Tabbelle[i][4] = testStr [4];
            Tabbelle[i][5] = testStr [5];
        }

        for ( i = 0; i < 49; i++) {
            testStr[0] = Tabbelle[i][0];
            testStr[1] = Tabbelle[i][1];
            testStr[2] = Tabbelle[i][2];
            testStr[3] = Tabbelle[i][3];
            testStr[4] = Tabbelle[i][4];
            testStr[5] = Tabbelle[i][5];
            testStr[6] = Tabbelle[i][6];
            out.println(testStr[0]);
        }
        new UserInterface();
    }
}