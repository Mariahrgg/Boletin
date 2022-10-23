import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    /*
    codifica un programa que saque, por consola,
    un número tecleado, sempre que sexa positivo,
    xunto coa mensaxe “ e positivo “ .
     */
        /*
        Inicio
        leer numero;
        hacer condicional si es o no positivo;
        mostrar "es positivo el numero:" + numero;
        Fin
         */

        System.out.println("Este programa muestra si un numero es positivo.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        double numero =sc.nextDouble();
        if (numero > 0){
            System.out.println("el numero " + numero + " es positivo.");
        }

    }
}