package notools;

public class arreglos {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,5,6};
       

        /*for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);*/

        //int i;

        /*for(i = 0; i<numeros.length; i++) {
            System.out.println(numeros[i]);
        }*/

        //for each
        for(int numero : numeros) {
            System.out.println(numero);
        }
    }
}

