/*
* File: Valami.java
* Author: Szamosfalvi Szonja
* Copyright: 2024, Szamosfalvi Szonja
* Group: Szoft II-1-N
* Date: 2024-10-05
* Github: https://github.com/szonia/
* Licenc: GNU GPL
*/

import java.util.Scanner;

public class Valami {

    public void Romb(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Rombusz terület számolás");
        System.out.println("Szamosfalvi Szonja, 2024.10.05, II-1-N");
    
        System.out.print("Átló1: ");
        String atloegystr = sc.nextLine();
        Double atloegy = Double.parseDouble(atloegystr);

        System.out.print("Átló2: ");
        String atlokettostr = sc.nextLine();
        Double atloketto = Double.parseDouble(atlokettostr);

        Double eredmeny = (1.0/2.0) * atloegy * atloketto;

        System.out.println("Rombusz területe: " + eredmeny);

        sc.close();
    }

}
