/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LanchoneteMain;


public class Produto {
    private String nome;
    private float preco;
    private int quant_estoque;

    public Produto(String nome, float preco, int quant_estoque) {
        this.nome = nome;
        this.preco = preco;
        this.quant_estoque = quant_estoque;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public int getQuant_estoque() {
        return quant_estoque;
    }

    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    
}
