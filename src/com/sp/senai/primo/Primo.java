package com.sp.senai.primo;
import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {

        /** Import Scanner */
        Scanner teclado = new Scanner(System.in);

        /** Captura um numero */
        System.out.print("Digite um numero: ");
        int numero = teclado.nextInt();
        System.out.println();

        /** Verifica se o numero é primo */
        boolean primo = true;
        if (numero <= 1) {
            primo = false;
        } else if (numero == 2) {
            primo = true;
        } else if (numero % 2 == 0) {
            primo = false;
        }
        /** Printa na Tela */
        if (primo) {
            System.out.println("O numero e primo");
        } else {
            System.out.println("O Numero nao e primo");
        }
    }
}
