/*
* File: App.java
* Author: Fekete Gergely
* Copyright: 2023, Fekete Gergely
* Group: Szoft 1 N
* Date: 2023-04-27
* Github:https://github.com/feketegergely062/lelepi
* Licenc: GNU GPL
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Feladat: 0358");
        System.out.print("Keszitette: Fekete Gergely, Szoft/1/N 2023-04-27\n ");
        Scanner szamit = new Scanner(System.in);  
        System.out.println("Add meg a paralepid A oldalat: ");

        double Aold = szamit.nextDouble();
        System.out.println("Add meg a paralepid B oldalat: ");

        double Bold = szamit.nextDouble();
        System.out.println("Add meg a paralepid C oldalat: ");

        double Cold = szamit.nextDouble();
        System.out.println("Az értéke: ");
        
        double terfogat = Aold*Bold*Cold;
    
        System.out.print(terfogat);

    }
}


    

