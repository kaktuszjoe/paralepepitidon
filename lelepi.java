//Jakabos Ábel 2023 02 20 doga
/*
* File: lelepi.java
* Author: Jakabos Ábel
* Copyright: 2023, Jakabos Ábel
* Group: Szoft I
* Date: 2023-02-20
* Github: https://github.com/kaktuszjoe/paralepepitidon
* Licenc: GNU GPL
*/


import java.util.Scanner;

public class lelepi {
    public static void main(String[] args) {
        System.out.print("Jakabos Ábel 2023 02 20 doga");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("add meg a paralepid a oldalat");

        double a = myObj.nextDouble();
        System.out.println("add meg a paralepid a oldalat");

        double b = myObj.nextDouble();
        System.out.println("add meg a paralepid a oldalat");

        double c = myObj.nextDouble();
        
        double terfogat = c*a*b;
        System.out.print(terfogat);
    
        
        
        
    
    }
    
}
