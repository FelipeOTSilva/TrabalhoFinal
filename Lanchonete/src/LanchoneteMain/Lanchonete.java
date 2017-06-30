package LanchoneteMain;


public class Lanchonete {

    
    public static void main(String[] args) {
       ItemComanda produto = new ItemComanda(5,"Coca",3.50f);
       ItemComanda pastel = new ItemComanda(2,"Pastel",5.00f);
       Comanda comanda = new Comanda(1,5, "Frey");
       
       comanda.adicionar(produto);
       comanda.adicionar(pastel);
       
       System.out.print(comanda.gettotal());
    }
    
    
    
}
