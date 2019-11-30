/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos;

import java.util.ArrayList;

/**
 *
 * @author 20171bsi0162
 */
public class Pedido { 
    ArrayList<Item> itens = new ArrayList(); 


    void addItemPedido(Item item) {
        itens.add(item);
    }
}
