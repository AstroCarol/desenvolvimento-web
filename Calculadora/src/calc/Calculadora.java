package calc;

import java.util.Scanner;

public class Calculadora 
{
    public static void main(String[] args) 
    {
        
        int calc, a, b;
        Scanner c = new Scanner(System.in);
        System.out.println("Escolha uma das opções:\n1 Soma\n2 Subtração\n3 Multiplicação\n4 Divisão");
        calc = c.nextInt();
        System.out.println("Digite um valor:");
        a = c.nextInt();
        System.out.println("Digite outro valor:");
        b = c.nextInt();
        
        switch(calc)
        {
            case 1:
                System.out.printf("A soma dos valores é: %d\n", Calc.soma(a, b));
                break;
            case 2:
                System.out.printf("A subtração dos valores é: %d\n", Calc.sub(a, b));
                break;
            case 3:
                System.out.printf("A multiplicação dos valores é: %d\n", Calc.mult(a, b));
                break;
            case 4:
                System.out.printf("A divisão dos valores é: %d\n", Calc.div(a, b));
                break;
        }
        
    }
    
}

