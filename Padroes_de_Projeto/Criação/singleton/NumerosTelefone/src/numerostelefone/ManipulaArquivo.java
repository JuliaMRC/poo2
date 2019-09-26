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

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManipulaArquivo {
    
    public static void leitor(String path) throws IOException{
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        while(true){
            if (linha != null){
                System.out.println(linha);
            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }
    
    public static void escritor(String path, String numero) throws IOException{
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        System.out.println("Vou escrever agora, humana: "+numero);
        buffWrite.append(numero + "\n");
        buffWrite.close();
    }
}
