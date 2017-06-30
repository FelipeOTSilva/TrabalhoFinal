/*
Classe comanda, onde temos um atributo de lista  de item comanda  para adiconar
os produtos.

 */
package LanchoneteMain;

import java.util.ArrayList;
import java.util.List;

public class Comanda {

    private int numComanda;
    private int numMesa;
    private String nomeCliente;
    private List<ItemComanda> itens;

    public Comanda(int numComanda, int numMesa, String nomeCliente) {
        this.numComanda = numComanda;
        this.numMesa = numMesa;
        this.nomeCliente = nomeCliente;
    }

    public Comanda() {
    }

    public List<ItemComanda> getItens() {
        if (itens == null) {
            itens = new ArrayList<>();
        }
        return itens;
    }

    public void adicionar(ItemComanda item) {
        getItens().add(item);
    }

    public float gettotal() {
        float valor = 0;
        for (ItemComanda itemComanda : getItens()) {
            valor = valor + itemComanda.getValorTotal();

        }
        return valor;
    }
}
