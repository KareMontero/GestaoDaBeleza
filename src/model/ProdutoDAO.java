package model;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    private static List<Produto> listaProduto = new ArrayList<>();

    
    public void Adicionar(Produto prod){
        listaProduto.add(prod);
    }
    
      //acessar lista e adicionar novos itens
    public List<Produto> listar() {
        return listaProduto;
    }
    
    public void excluir (int indice) {
    listaProduto.remove(indice);
}
    public void pegarPaciente (int indice){
        listaProduto.get(indice);
    }
}
