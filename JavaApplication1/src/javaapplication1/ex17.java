/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class ex17 {
      public static void main(String args[]) {
        // TODO code application logic here
        Scanner Numero = new Scanner(System.in);
        System.out.println("Informe seu salário:");
        float Salario_Fixo = Numero.nextInt();
        System.out.println("Informe agora, a comissão por carro vendido:");
        float Comissao = Numero.nextInt();
        System.out.println("Informe agora a quantidade de carros vendidos:");
        int Quantidade_Carros_Vendidos = Numero.nextInt();
        System.out.println("Informe o valor total de suas vendas:");
        float Total_Vendas = Numero.nextInt();
        float Porcentagem_Total_Vendas = Total_Vendas*0.05f;
        float Salario_Total = (Comissao*Quantidade_Carros_Vendidos) + Porcentagem_Total_Vendas +Salario_Fixo;
        System.out.println("O salário total foi de R$"+Salario_Total);
    }
}
