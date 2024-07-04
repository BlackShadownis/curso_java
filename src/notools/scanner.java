package notools;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("escoje tu modo de juego y te dire tu resultado");
        System.out.println("bedwars - skywars - eggwars");
        System.out.println("elige una opcion: ");


        String juego = scanner.nextLine();
        switch (juego) {
            case"bedwars":
                System.out.println("preparate para llorrar");
                break;

            case "skywars":
                System.out.println("preparate para estresarte");
                break;

            case"eggwars":
                System.out.println("lo mismo que bedwars zzzz");
                break;
            case"otra opcion":
                System.out.println("dime una sugerencia");
                String opcion = scanner.nextLine();
                System.out.println("igual preparate para llorrar");
        }
        }
    }

