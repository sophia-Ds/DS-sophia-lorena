/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosvetor;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class ex2 {
    public static void main(String[] args) {
         int Soma = 0;
        Scanner Entrada = new Scanner(System.in);
        int[] Numeros = new int[10];
        for(int i = 0; i < Numeros.length; i++)
        {
            System.out.println("Insira os numeros:");
            Numeros[i] = Entrada.nextInt();
            Soma+=Numeros[i];
        }
        System.out.println("A soma de todos os numeros e igual a:"+Soma);
    }
}
