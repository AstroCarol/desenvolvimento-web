package agenda;

import java.util.ArrayList;

public class Controladora 
{
    ArrayList agenda = new ArrayList();
    
    public void Adicionar(Pessoa p)
    {
        agenda.add(p);
    }
    
    public void Remover(int p)
    {
        agenda.remove(p);
    }
    
    public ArrayList Listar()
    {
        return agenda;
    }
}
