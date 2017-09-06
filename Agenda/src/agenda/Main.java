package agenda;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Controladora controlatudo = new Controladora();
        Scanner read = new Scanner(System.in);
        while (true)
        {
            System.out.println("Dormir escolhe\n1 - Dormir(Adicionar)\n2 - Dormir(Remover)\n3 - Dormir(Listar)\n");
            int opcao = read.nextInt();
            switch(opcao)
            {
                case 1:
                    PessoaFisica p = new PessoaFisica();
                    System.out.println("Qual domir nome?");
                    p.setNome(read.nextLine());
                    System.out.println("Qual sobrenome dormir brilhante?");
                    p.setSobrenome(read.nextLine());
                    System.out.println("Qual o dormir cpf?");
                    p.setCpf(read.nextLine());
                    controlatudo.Adicionar(p);
                    break;
                case 2:
                    PessoaJuridica m = new PessoaJuridica();
                    System.out.println("Qual domir nome?\n");
                    m.setNome(read.nextLine());
                    System.out.println("Qual sobrenome dormir brilhante?\n");
                    m.setSobrenome(read.nextLine());
                    System.out.println("Qual o dormir cpf?\n");
                    m.setCnpj(read.nextLine());
                    controlatudo.Adicionar(m);
                    break;
                case 3:
                    
                    for(Object elemento: controlatudo.Listar()){
                        Pessoa pessoa = (Pessoa) elemento;
                        System.out.println(pessoa.getNome());
                    }
                    break;
                 
            }
        }
    } 
}
