package calc;

import java.util.Scanner;

public class Calculadora 
{
    public static void main(String[] args) 
    {
        int valA, valB, result, calc;
        Scanner c = new Scanner(System.in);
        System.out.println("Escolha uma das opções:\n1 Soma\n2 Subtração\n3 Multiplicação\n4 Divisão");
        calc = c.nextInt();
        Scanner a = new Scanner(System.in);
        System.out.println("Digite um valor:");
        valA = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.println("Digite outro valor:");
        valB = b.nextInt();
        switch(calc)
        {
            case 1:
                result = valA + valB;
                System.out.printf("A soma dos valores é: %d\n", result);
                break;
            case 2:
                result = valA - valB;
                System.out.printf("A subtração dos valores é: %d\n", result);
                break;
            case 3:
                result = valA * valB;
                System.out.printf("A multiplicação dos valores é: %d\n", result);
                break;
            case 4:
                result = valA / valB;
                System.out.printf("A divisão dos valores é: %d\n", result);
                break;
        }
    }  
}
