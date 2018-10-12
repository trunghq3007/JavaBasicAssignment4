package core;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Start {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter numberphone:");
        String str = null;
        try {
            str = inp.nextLine();

            StringTokenizer st = new StringTokenizer(str, " -");
            while (st.hasMoreTokens())
                System.out.println(st.nextToken());

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }
}