package model;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
  
    private static List<Cliente> listaCliente = new ArrayList<>();

    
    public void Adicionar(Cliente cli){
        listaCliente.add(cli);
    }
    
      //acessar lista e adicionar novos itens
    public List<Cliente> listar() {
        return listaCliente;
    }
    
    public void excluir (int indice) {
    listaCliente.remove(indice);
}
    public void pegarPaciente (int indice){
        listaCliente.get(indice);
    }

}
