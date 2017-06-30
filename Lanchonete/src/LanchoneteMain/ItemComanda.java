/* 
Classe ItemCOmanda onde ela´tem herança da classe Produto para pegar os atributos
nome e preço
*/
package LanchoneteMain;


public class ItemComanda extends Produto {
    private int quant;

    public ItemComanda(int quant, String nome, float preco) {
        super(nome, preco);
        this.quant = quant;
    }
    
    public float getValorTotal(){
        return  this.quant* getPreco();
    }
    
}
