/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerostelefone;

import java.io.IOException;

/**
 *
 * @author 20171BSI0162
 */
public class SingletonGeraNumero {
    String path = "C:/Users/Julia/Documents/GitHub/poo2/Padroes_de_Projeto/Criação/singleton/NumerosTelefone/numeros.txt";
    
    private static SingletonGeraNumero instancia;
    
    public synchronized static SingletonGeraNumero getInstancia() throws IOException{
        if (instancia == null){
            instancia = new SingletonGeraNumero();
        }
        return instancia;
    }
    
    private int cont;
    
    private SingletonGeraNumero() throws IOException{
        this.cont = Integer.parseInt(ManipulaArquivo.leitor(path));
        
    }
    
    public synchronized int getNextNumero(){
        return ++cont;
    }
}
