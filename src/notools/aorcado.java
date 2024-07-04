package notools;

import java.util.Scanner;

public class aorcado {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = "semen";

        int intentos = 10;
        int intento = 0;
        boolean palabraadivinada = false;

        char[] letrasUsadas = new char[palabraSecreta.length()];

        for (int i = 0; i < letrasUsadas.length; i++) {
            letrasUsadas[i] = '_';
            System.out.println(letrasUsadas[i]);

        }

        while(!palabraadivinada && intento < intentos){
            System.out.println("palabra a adivinar" + String.valueOf(letrasUsadas));
            System.out.println("mete otra letra: ");

            char letra = scanner.next().charAt(0);
            boolean letraCorrecta = false;

            for (int i = 0; i <  palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasUsadas[i] = letra;
                    letraCorrecta = true;
                }

            }
            if(!letraCorrecta){
                intento++;
                System.out.println("te quedan " + (intentos - intento));
            }

            if(String.valueOf(letrasUsadas).equals(palabraSecreta)){
                palabraadivinada = true;
                System.out.println("haz advinado");
            }

            if(!palabraadivinada){
                System.out.println("perdistes");
            }
        }

    }
}