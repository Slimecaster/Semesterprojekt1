package com.example.semesterprojekt1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DbSql db = new DbSql();
        Scanner input = new Scanner(System.in);
        System.out.println("1. Opret Bruger");
        System.out.println("2. Opret ønskeseddel.");
        System.out.println("3. Tilføj ønske til ønskeseddel.");
        System.out.println("4. Reserver ønske.");
        System.out.println("5. Slet ønskeseddel.");
        System.out.println("6. Slet ønske fra ønskeseddel.");
        System.out.println("7. Afreserver ønske.");
        System.out.println("8. Udskriv ønsker");
        System.out.println("Indtast dit valg.");
        int valg = input.nextInt();
        switch (valg) {
            case 1:
                Bruger b=new Bruger("Nichlas","sejestrejest","1234");
                db.opretBruger(b);
                break;
            case 2:
                Oenskeseddel s=new Oenskeseddel(1,1,"Damis Jul 2023");
                db.opretOenskeseddel(s);
                break;
            case 3:
                Oenske o = new Oenske(1,1,"Strømper",100,"str. 39-42, hvid","",0);
                db.opretOenske(o);
                break;
            case 4:
                db.reserverGave(3);
                break;
            case 5:
                db.sletOenskeseddel(1);
                break;
            case 6:
                db.sletOenske(2);
                break;
            case 7:
                db.afReserverGave(1);
                break;
            case 8:
                ArrayList <Oenske> Liste = db.specifikOenskeliste(1,1);
                udskrivOensker(Liste);
                break;

        }
    }
    public static void udskrivOensker(ArrayList<Oenske>Oensker){
        for (int i = 0;i <Oensker.size();i++)
            System.out.println(Oensker.get(i));
    }
}
    public static void main(String[] args) {
        DbSql db = new DbSql();
        Scanner input = new Scanner(System.in);
        System.out.println("1. Opret Bruger");
        System.out.println("2. Opret ønskeseddel.");
        System.out.println("3. Tilføj ønske til ønskeseddel.");
        System.out.println("4. Reserver ønske.");
        System.out.println("5. Slet ønskeseddel.");
        System.out.println("6. Slet ønske fra ønskeseddel.");
        System.out.println("7. Afreserver ønske.");
        System.out.println("8. Udskriv ønsker");
        System.out.println("Indtast dit valg.");
        int valg = input.nextInt();
        switch (valg) {