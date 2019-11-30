/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos;

/**
 *
 * @author 20171bsi0162
 */
public class StatusItem {
    
    public enum Estado { 
        CARRINHO, FECHADO, PAGO, ENVIADO , ENTREGUE 
    }
    
    public Estado estado;
    public boolean podeCancelar;
    public boolean compraConcluida;
    
    StatusItem(Estado estado, boolean podeCancelar, boolean compraConcluida){
        this.estado = estado;
        this.podeCancelar = podeCancelar;
        this.compraConcluida = compraConcluida;
    }

    
}
