package model;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {
      private static List<Funcionario> listaFuncionario = new ArrayList<>();

    
    public void Adicionar(Funcionario func){
        listaFuncionario.add(func);
    }
    
      //acessar lista e adicionar novos itens
    public List<Funcionario> listar() {
        return listaFuncionario;
    }
    
    public void excluir (int indice) {
    listaFuncionario.remove(indice);
}
    public void pegarPaciente (int indice){
        listaFuncionario.get(indice);
    }  
}
