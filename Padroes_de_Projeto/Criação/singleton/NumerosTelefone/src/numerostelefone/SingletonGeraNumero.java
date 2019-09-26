/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerostelefone;

/**
 *
 * @author 20171BSI0162
 */
public class SingletonGeraNumero {
    private static SingletonGeraNumero instancia;
    
    public synchronized static SingletonGeraNumero getInstancia(){
        if (instancia == null){
            instancia = new SingletonGeraNumero();
        }
        return instancia;
    }
    
    private int cont;
    
    private SingletonGeraNumero(){}
    
    public synchronized int getNextNumero(){
        return cont++;
    }
}
