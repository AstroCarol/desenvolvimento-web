package agenda;

public class Pessoa 
{
    private String nome, sobrenome, rua, bairro;
    private int idade, numero;
    
    public void setNome(String nome)
    {
        this.nome = nome;
    } 
    
    public String getNome()
    {
        return nome;
    }

    public String getSobrenome() 
    {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) 
    {
        this.sobrenome = sobrenome;
    }

    public int getIdade() 
    {
        return idade;
    }

    public void setIdade(int idade) 
    {
        this.idade = idade;
    }

    public String getRua() 
    {
        return rua;
    }

    public void setRua(String rua) 
    {
        this.rua = rua;
    }

    public String getBairro() 
    {
        return bairro;
    }

    public void setBairro(String bairro) 
    {
        this.bairro = bairro;
    }

    public int getNumero() 
    {
        return numero;
    }

    public void setNumero(int numero) 
    {
        this.numero = numero;
    }   
}
