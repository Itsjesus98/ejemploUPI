/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fibonacci;

import java.util.Scanner;
public class Fibonacci {

 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cambio,limite,temporal,intercambio,i;
        cambio = 0;
        intercambio = 1;
        System.out.println("Digite hasta donde desea la sucession");
        limite = entrada.nextInt();
        System.out.println("------------------------");
        for (i = 1; i <= limite; i++){
            System.out.println(cambio);
            temporal = intercambio + cambio;
            cambio = intercambio;
            intercambio = temporal;
        }
    }
}
