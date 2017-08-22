package calc;

import java.util.Scanner;

public class Calculadora 
{
    public static void main(String[] args) 
    {
        Calc cal = new Calc();
        
        int calc;
        Scanner c = new Scanner(System.in);
        System.out.println("Escolha uma das opções:\n1 Soma\n2 Subtração\n3 Multiplicação\n4 Divisão");
        calc = c.nextInt();
        Scanner a = new Scanner(System.in);
        System.out.println("Digite um valor:");
        cal.a = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.println("Digite outro valor:");
        cal.b = b.nextInt();
        
        switch(calc)
        {
            case 1:
                System.out.printf("A soma dos valores é: %d\n", cal.soma(cal.a, cal.b));
                break;
            case 2:
                System.out.printf("A subtração dos valores é: %d\n", cal.sub(cal.a, cal.b));
                break;
            case 3:
                System.out.printf("A multiplicação dos valores é: %d\n", cal.mult(cal.a, cal.b));
                break;
            case 4:
                System.out.printf("A divisão dos valores é: %d\n", cal.div(cal.a, cal.b));
                break;
        }
        
    }
    
}

