/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class EX03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double numero1, numero2,soma, subtracao, divisao, multiplicacao;
       Scanner leitor = new Scanner (System.in);     
       
       System.out.print("Digite o primeiro número: ");
       numero1 = leitor.nextDouble () ;
       System.out.print("\nDigite o segundo número: ");
       numero2 = leitor.nextDouble () ;
       
       
       soma = numero1 + numero2;
       subtracao = numero1 - numero2;
       divisao = numero1 / numero2;
       multiplicacao = numero1 * numero2;
       
       System.out.print("\nO resultado da soma entre os números é " + soma);
       System.out.print("\nO resultado da subtração entre os números é " + subtracao);
       System.out.print("\nO resultado da divisão entre os números é " + divisao);
       System.out.print("\nO resultado da multiplicação entre os números é " + multiplicacao);
       
    }
    
}
