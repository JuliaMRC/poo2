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
public class NumerosTelefone {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        String path = "C:/Users/Julia/Documents/GitHub/poo2/Padroes_de_Projeto/Criação/singleton/NumerosTelefone/numeros.txt";
        
        ManipulaArquivo.escritor(path, Integer.toString(999990101));
        //ManipulaArquivo.escritor(path, Integer.toString(999990102));
        //ManipulaArquivo.escritor(path, Integer.toString(999990103));
        //ManipulaArquivo.escritor(path, Integer.toString(999990104));
        
        SingletonGeraNumero generator = SingletonGeraNumero.getInstancia();
        System.out.println("next number: " + generator.getNextNumero());
        System.out.println("next number: " + generator.getNextNumero());
        System.out.println("next number: " + generator.getNextNumero());
        
        
        
        //ManipulaArquivo.leitor(path);
    }
    
}
