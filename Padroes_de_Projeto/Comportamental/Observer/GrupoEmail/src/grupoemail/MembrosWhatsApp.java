/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupoemail;

/**
 *
 * @author 20171BSI0162
 */
public class MembrosWhatsApp implements Observer{
    private int numero;
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void update(Observable obs) {
        System.out.println("vc recebeu uma msg wpp");
    }
    
    
}
