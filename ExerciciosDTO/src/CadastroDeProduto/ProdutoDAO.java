/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadastroDeProduto;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno.saolucas
 */
public class ProdutoDAO {
    
        private List<ProdutoDTO> produtos  = new ArrayList<>();
        
        public void salvarProduto(ProdutoDTO produto){
            
            produtos.add(produto);
              JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!\n" + produto.toString());
        }
    
        public void listProdutos(){
        StringBuilder produtosListados = new StringBuilder();
        for (ProdutoDTO produto : produtos) {
            produtosListados.append(produto.toString()).append("\n\n");
        }
        
        JOptionPane.showMessageDialog(null, produtosListados.length() == 0 ? 
                                      "Nenhum produto cadastrado." : 
                                      produtosListados.toString());
        
        }
        
}
